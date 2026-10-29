/** Génère un PDF texte d'une page (suffisant pour le contrat bouchonné). */
export function buildPdf(title: string, lines: string[]): Blob {
  // Les polices standard PDF utilisent WinAnsi : on retire les caractères hors Latin-1.
  const clean = (s: string) =>
    s
      .replace(/[’]/g, "'")
      .replace(/[•·]/g, '-')
      .replace(/−/g, '-')
      .replace(/[^\x20-\xff]/g, '')
      .replace(/([\\()])/g, '\\$1');
  const body = [
    'BT /F1 16 Tf 50 790 Td',
    `(${clean(title)}) Tj`,
    '/F1 10 Tf 0 -28 Td 14 TL',
    ...lines.map((l) => `(${clean(l)}) '`),
    'ET',
  ].join('\n');
  const objects = [
    '<< /Type /Catalog /Pages 2 0 R >>',
    '<< /Type /Pages /Kids [3 0 R] /Count 1 >>',
    '<< /Type /Page /Parent 2 0 R /MediaBox [0 0 595 842] /Contents 4 0 R /Resources << /Font << /F1 5 0 R >> >> >>',
    `<< /Length ${body.length} >>\nstream\n${body}\nendstream`,
    '<< /Type /Font /Subtype /Type1 /BaseFont /Helvetica /Encoding /WinAnsiEncoding >>',
  ];
  let pdf = '%PDF-1.4\n';
  const offsets: number[] = [];
  objects.forEach((obj, i) => {
    offsets.push(pdf.length);
    pdf += `${i + 1} 0 obj\n${obj}\nendobj\n`;
  });
  const xref = pdf.length;
  pdf += `xref\n0 ${objects.length + 1}\n0000000000 65535 f \n`;
  pdf += offsets.map((o) => `${String(o).padStart(10, '0')} 00000 n \n`).join('');
  pdf += `trailer\n<< /Size ${objects.length + 1} /Root 1 0 R >>\nstartxref\n${xref}\n%%EOF`;
  const bytes = Uint8Array.from(pdf, (c) => c.charCodeAt(0) & 0xff);
  return new Blob([bytes], { type: 'application/pdf' });
}
