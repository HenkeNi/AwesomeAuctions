  
import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    auctionList: [],
    auctionSearched: "",
    isLoggedIn: false,
    currentUser: Object,
    currentUserEmail: "",
  },
  getters: {
    auctionList(state) {
      return state.auctionList;
    },
    auctionSearched(state) {
      return state.auctionSearched;
    },
    currentUser(state) {
      //return JSON.parse(localStorage.getItem('currentUser'));
      //localStorage.getItem('currentUser');
      return state.currentUser;
    },
    currentUserEmail() {
      return JSON.parse(localStorage.getItem('currentUserEmail'));
    },
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
    setCurrentUser(state, user) {
      state.currentUser = user;
      //localStorage.setItem('currentUser', user);
    },
    setCurrentUserEmail(email) {
      localStorage.setItem('currentUserEmail', email);
    },
    setIsLoggedIn(state, isLoggedIn){
      state.isLoggedIn = isLoggedIn
    },
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