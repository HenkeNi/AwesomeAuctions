  
import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    auctionList: [],
    auctionSearched: "",
    //user: null,
    isLoggedIn: false,
    currentUser: Object,
  },
  getters: {
    auctionList(state) {
      return state.auctionList;
    },
    auctionSearched(state) {
      return state.auctionSearched;
    },
    currentUser() {
      return JSON.parse(localStorage.getItem('currentUser'));
      //localStorage.getItem('currentUser');
      //return state.currentUser;
    },

    // user(state) {
    //   return state.user;
    // },
    loggedInStatus(state) {
      return state.isLoggedIn
    },
  },
  mutations: {
    setAuctionList(state, auctionList) {
      state.auctionList = auctionList;
    },
    setAuctionSearched(state, searched) {
      state.auctionSearched = searched;
    },
    setCurrentUser(user) {
      //state.currentUser = user;
      console.log("SETTING USER WITH; ", user);
      localStorage.setItem('currentUser', user);
    },
    // setUser(state, user) {
    //   state.user = user;
    // },
    setIsLoggedIn(state, isLoggedIn){
      state.isLoggedIn = isLoggedIn
    },
    // currentlyLoggedInUser(state, user) {
    //   localStorage.setItem('currentUser', user);
    //   state.currentUser = user;
    // },
  },
  actions: {
    async fetchAuctions({ commit }) {
      let res = await fetch('http://localhost:5000/api/v1/auction');
      let json = await res.json();

      commit('setAuctionList', json);
    },
  },
  modules: {},
});