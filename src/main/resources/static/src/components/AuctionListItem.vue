<template>
  <div class="auction-container">
    <h3>{{ auction.productName }}</h3>
    <h4>Starting bid: {{ auction.startBid }}</h4>
    <h4>Ends at: {{ auction.endDate }}</h4>
  </div>
</template>

<script>

// import prop...

export default {
  props: ['auction'],
  data() {
    return {

    };
  }
}
</script>

<style>


</style>