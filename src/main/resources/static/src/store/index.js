import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    auctionList: [],
    auctionSearched: "",
  },
  getters: {
    auctionList(state) {
      return state.auctionList;
    },
    auctionSearched(state) {
      return state.auctionSearched;
    },
  },
  mutations: {
    setAuctionList(state, auctionList) {
      state.auctionList = auctionList;
    },
    setAuctionSearched(state, searched) {
      state.auctionSearched = searched;
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