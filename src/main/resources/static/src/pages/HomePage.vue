<template>
  <div class="home-page">
      <input v-model="search" type="text" placeholder="Search Auction..." />
      <AuctionList />
  </div>
</template>


<script>
import AuctionList from "../components/AuctionList.vue";

export default { 
  data() {
    return {
      title: 'Hello',
      search: "",
    };
  },
  components: {
    AuctionList
  },
  watch: {
    search() {
      this.$store.commit('setAuctionSearched', this.search);      
    }
  },
}
</script>

<style>
.home-page h1 {
    text-align: center;
}

div {
  background-color: #f3f3f3;
}
</style>

