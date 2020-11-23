<template>
  <div id="app">
    <router-view />
  </div>
</template>

<script>

//import Vue from 'vue'
//npimport Component from 'vue-class-component'

import { Vue, Component } from "vue-property-decorator";

@Component({

  components: {

  },
})
export default class App extends Vue {}

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
