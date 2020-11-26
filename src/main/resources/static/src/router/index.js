import Vue from 'vue'
import VueRouter from 'vue-router'
import HomePage from '../pages/HomePage'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'HomePage',
    component: HomePage
  },
  // {
  //   path: "/auctionDetail/:auction",
  //   name: "AuctionDetails",
  //   component: AuctionDetails,
  //   props: true,
  // }



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