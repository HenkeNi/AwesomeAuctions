<template>
  <div id="app">
    <div>HELLO WORLD</div>
    <!-- <router-view /> -->
  </div>
</template>

<script>

//import Vue from 'vue'
//npimport Component from 'vue-class-component'

import { Vue } from "vue-property-decorator";


export default class App extends Vue {
  
  created() {
    console.log('hello-world')
  }
}

//import { Vue } from "vue-property-decorator";

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
