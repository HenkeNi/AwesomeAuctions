<template>
  <div>
    <div class="search-field">
      <input v-model="search" type="text" placeholder="Search Auction..." class="input-field"/>
    </div>
      <AuctionList class="test"/>
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
.search-field {
  width: 80vw;
  margin: auto;
  margin-top: 15px;
  padding-top: 20px;
  color:white;
  border-radius: 10px;
}

.input-field{
  color:white
}


div {
  background-color: transparent;
}
</style>

