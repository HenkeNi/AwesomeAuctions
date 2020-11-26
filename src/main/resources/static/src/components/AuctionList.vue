<template>
  <div>
    <h3>Current Auctions:</h3>
    <div class="article-list">
      <AuctionListItem
      v-for="auction in auctionsData"
      :key = "auction.id"
      :auction="auction"
     />
    </div>
  </div>
</template>


<script>

import AuctionListItem from './AuctionListItem';

export default {

  components: {
    AuctionListItem
  },
   data() {
    return {
      //auctions: this.$store.getters.auctionList,
    };
  },

  computed: {
    auctionsData() {
      return this.$store.getters.auctionList;
    }
  },


 

}
</script>

<style scoped>
  .article-list {
    background-color: lightblue;
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    
  }
</style>