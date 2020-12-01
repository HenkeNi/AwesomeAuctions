import Vue from 'vue'
import VueRouter from 'vue-router'
import HomePage from '../pages/HomePage'
import CreateAuction from '../pages/CreateAuction'
import AuctionDetail from '../pages/AuctionDetail'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'HomePage',
    component: HomePage
  },
  {
    path: '/detail/:auction',
    name: 'AuctionDetail',
    component: AuctionDetail,
    props: true,
  },
  // {
  //   path: "/auctionDetail/:auction",
  //   name: "AuctionDetails",
  //   component: AuctionDetails,
  //   props: true,
  // }

  {
    path: '/createAuction',
    name: 'CreatAuction',
    component: CreateAuction
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