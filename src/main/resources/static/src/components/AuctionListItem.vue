<template>
  <div @click="goToAuctionDetails(auction)" class="auction-item">
    <img class="item-img" src="https://i.ebayimg.com/images/g/N0oAAOSwmo1fdoDf/s-l640.jpg" />
    <div class="item-desc">
      <h2>{{ auction.productName }}</h2>
      <h4>Starting bid: {{ auction.startBid }}</h4>
      <h4>Ends at: {{ auction.endDate }}</h4>
    </div>
   </div>
</template>

<script>

export default {
  props: ['auction'],
  data() {
    return {

    };
  },
  methods: {
    goToAuctionDetails(auction) {
      this.$router.push({ name: 'AuctionDetail', params: {auction: auction} });
      //this.$router.push(`detail/${auction}`);
    }
  }
}
</script>

<style>
.auction-item {
  width: 25vw;
  margin: 5px 20px 5px 20px;
  padding-left: 15px;
  cursor: pointer;
}

.item-desc {
  text-align: start;
  padding-left: 25px;
}

.item-desc h2 {
  margin-top: 2px;
}

.auction-item img {
  flex-shrink: 0;
  max-width: 60%;
  max-height: 60%;
}

/* .item-img {
  width: 20vw;
  height: 30vw;
} */
</style>