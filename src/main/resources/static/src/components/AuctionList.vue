<template>
  <div>
    <h3>Current Auctions:</h3>
    <h4>{{ searchedAuction }}</h4>
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
// TODO: auction in (searchedAuction != [](empty) ? searchedAuction : auctionsData) 

import AuctionListItem from './AuctionListItem';

export default {

  components: {
    AuctionListItem
  },
   data() {
    return {
      searchedAuction: [],
      //auctions: this.$store.getters.auctionList,
    };
  },

  computed: {
    auctionsData() {
      return this.$store.getters.auctionList;
    },
    auctionSearched() {
      return this.$store.getters.auctionSearched;
    }
  },
  watch: {
    auctionSearched() {

        // TODO: FIlter array
      for (let auction of this.auctionsData) {
        if (auction.productName.includes(auctionSearched)) {
          console.log("VICTORY!");
        }
      }

      console.log("IS CHANGIE");
    }
  }


 

}
</script>

<style scoped>
  .article-list {
    background-color: lightblue;
    display: flex;
    flex-flow: row wrap;
    justify-content: space-around;
  }
</style>