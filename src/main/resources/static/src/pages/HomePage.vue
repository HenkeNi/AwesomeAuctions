<template>
  <div class="home-page">
      <AuctionList />
  </div>
</template>


<script>
import AuctionList from "../components/AuctionList.vue";

export default { 
  data() {
    return {
      title: 'Hello',
    };
  },
  components: {
    AuctionList
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

