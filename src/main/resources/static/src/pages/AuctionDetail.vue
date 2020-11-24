<template>
  <div class="home-page">
    <div class="container">
       <div class="row">
      <div class="col s8">PICTURE</div>
      <div class="col s4">INFO
        <div class="row">
      <div class="col s4">START PRICE
        50
      </div>
      <div class="col s4">ENDS</div> 
      <div class="col s4">BID</div> 
        </div> 
        <div class="row">
      <div class="col s12">LAY BID</div>
        </div>
        <div class="row">
      <div class="col s12">BID BOX</div>
        </div>
        <div class="row">
      <div class="col s12">BID BUTTON</div>
        </div>
    </div>
      
    </div>
    <div class="row">
      <div class="col s8">DESCRIPTION</div>
    </div>
    </div>
    <div>

    </div>
  </div>

</template>

<script>

//import { Vue } from "vue-property-decorator";
//import Vue from 'vue'
//import Component from 'vue-class-component'
import M from 'materialize-css'

export default { //class HomePage extends Vue {
  data() {
    return {
      title: 'Details about auction'
    };
  },
  mounted () {
    M.AutoInit()
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

