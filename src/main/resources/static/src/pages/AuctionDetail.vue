<template>
  <div class="home-page">
    <div class="container">
      <div class="col-6">
        PICTURE
      </div>
    </div>
    <h1>Auction Detail...</h1>
    <h1>{{title}}</h1>
    <div>

    </div>
  </div>

</template>

<script>

//import { Vue } from "vue-property-decorator";
//import Vue from 'vue'
//import Component from 'vue-class-component'

export default { //class HomePage extends Vue {
  data() {
    return {
      title: 'Details about auction'
    };
  }
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

