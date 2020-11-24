<template>
  <div id="app">
    <div>AWESOME AUCTIONS</div>
    <router-view />
  </div>
</template>

<script>

// import Vue from 'vue'
// import { Component } from "vue-property-decorator";

// @Component({
//   components: {
//     // NavBar
//   }
// })
// export default class App extends Vue {}

export default {
  name: 'app',
  components: {
    
  }
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
