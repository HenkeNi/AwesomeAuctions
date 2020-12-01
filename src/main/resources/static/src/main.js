import Vue from 'vue'
import App from './App.vue'
import 'materialize-css'

import 'materialize-css/dist/css/materialize.min.css'
import 'material-design-icons/iconfont/material-icons.css'
import store from './store'
import router from './router'
import 'materialize-css/dist/css/materialize.min.css'
import store from './store'


Vue.config.productionTip = false

new Vue({
  store,
  router,
  store,
  render: h => h(App),

}).$mount('#app')
