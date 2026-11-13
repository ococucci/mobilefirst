// Proxy du serveur de dev : /api et /actuator (health) sont redirigés vers l'API.
// Par défaut http://localhost:8080 ; autre endpoint : API_TARGET=https://recette.exemple.fr npm start
const target = process.env.API_TARGET || 'http://localhost:8080';
console.log(`[proxy] /api -> ${target}`);

module.exports = {
  '/api': { target, secure: false, changeOrigin: true },
  '/actuator': { target, secure: false, changeOrigin: true },
};
