  
import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    auctionList: [],
    auctionSearched: "",
    user: null,
    isLoggedIn: false
  },
  getters: {
    auctionList(state) {
      return state.auctionList;
    },
    auctionSearched(state) {
      return state.auctionSearched;
    },
    user(state) {
      return state.user;
    },
    loggedInStatus(state){
      return state.isLoggedIn
    }
  },
  mutations: {
    setAuctionList(state, auctionList) {
      state.auctionList = auctionList;
    },
    setAuctionSearched(state, searched) {
      state.auctionSearched = searched;
    },
    setUser(state, user) {
      state.user = user;
    },
    setIsLoggedIn(state, isLoggedIn){
      state.isLoggedIn = isLoggedIn
    }
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