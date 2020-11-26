import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    auctionList: [],
  },
  getters: {
    auctionList(state) {
      return state.auctionList;
    }
  },
  mutations: {
    setAuctionList(state, auctionList) {
      console.log("SETTING AUCTIONS", auctionList);
      state.auctionList = auctionList;

      console.log(state.auctionList);
    }
  },
  actions: {
    async fetchAuctions({ commit }) {
      let res = await fetch('http://localhost:5000/api/v1/auction');
      let json = await res.json();

      console.log("FETCHING AUCTIONS", json);

      commit('setAuctionList', json);
    },
  },
  modules: {},
});