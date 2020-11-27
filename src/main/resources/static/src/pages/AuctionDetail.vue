<template>
  <div class="home-page">
    <div class="container">
      <div class="row">
        <h1>{{ this.$route.params.auction.productName }}</h1>
        <h3>{{ this.$route.params.auction.id }}</h3>
        <div class="col s8">
          PICTURE
          <div class="row">
            <div class="col s12">
              <img src="this.$route.params.auction.imageURL" alt="./skor.jpg" />
            </div>
          </div>
        </div>
        <div class="col s4">
          INFO
          <div class="row">
            <div class="col s4">
              START PRICE
              {{ this.$route.params.auction.startBid }}
            </div>
            <div class="col s4">ENDS</div>
            {{ this.$route.params.auction.endDate }}
            <div class="col s4">BID</div>
          </div>
          <div class="row">
            <div class="col s12">LAY BID</div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input placeholder="Input bid" id="first_name" type="text" class="validate" />
              <label for="first_name">Lay bid</label>
            </div>
          </div>
          <div class="row">
            <div class="col s12">
              <a href class="btn">PLACE BUD</a>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col s8">
          DESCRIPTION
          <div class="row">
            <div class="col s12">{{ this.$route.params.auction.description }}</div>
          </div>
        </div>
      </div>
    </div>
    <div></div>
  </div>
</template>

<script>
//import { Vue } from "vue-property-decorator";
//import Vue from 'vue'
//import Component from 'vue-class-component'
import M from "materialize-css";

export default {
  //class HomePage extends Vue {
  //props: ['auction'],
  data() {
    return {
      title: "Details about auction"
    };
  },

  mounted() {
    M.AutoInit(),
      fetch(
        "http://localhost:5000/api/v1/auction" /*, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        productName:"Window",
        description:"Fine window",
        imageURL:"http://window",
        startBid:299,
        endDate:161616
      })
    }*/
      )
        .then(res => {
          return res.json();
        })
        .then(data => console.log(data));
    //.catch(error => console.log('ERROR'))
  }
};
</script>

<style>
.home-page h1 {
  text-align: center;
}

div {
  background-color: #f3f3f3;
}
</style>

