import Vue from 'vue'
import VueRouter from 'vue-router'
import HomePage from '../pages/HomePage'
import AuctionDetail from '../pages/AuctionDetail'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'HomePage',
    component: HomePage
  },
  {
    path: '/detail',
    name: 'AuctionDetail',
    component: AuctionDetail
  },



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