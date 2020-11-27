import Vue from 'vue'
import VueRouter from 'vue-router'
import HomePage from '../pages/HomePage'
import AddAuction from '../pages/AddAuction'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'HomePage',
    component: HomePage
  },

  {
    path: '/test',
    name: 'AddAuction',
    component: AddAuction
  }



 /* {
    path: '/about',
    name: 'about',
    component: () => import('../views/About.vue')
  }, */
  
]



const router = new VueRouter({
    routes,
    mode: "history",
    base: process.env.BASE_URL,
    scrollBehavior() {
      return { x: 0, y: 0 }
  }
})

export default router