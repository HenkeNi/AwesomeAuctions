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
.home-page{
  
}

.home-page h1 {
    text-align: center;
    
}

.search-field {
  width: 80vw;
  margin: auto;
  margin-top: 15px;
  padding-top: 20px;
  box-shadow:0 0 15px 4px rgb(0, 0, 0);
  border-radius: 10px;
  border: 1px solid red;
}

input[text]{
  
}

div {
  background-color: #f3f3f3;
}
</style>

