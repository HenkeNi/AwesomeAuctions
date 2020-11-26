<template>
  <div id="app">
    <div>AWESOME AUCTIONS</div>
    <router-view />
  </div>
</template>

<script>

export default {
  name: 'app',
  components: {},
  created() {
    this.$store.dispatch('fetchAuctions');
  },
}

</script>


<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
