<template>
  <div class="home-page">
    <div class="container">
       <div class="row">
         <h1>{{ this.$route.params.auction.productName }}</h1>
      <div class="col s8">PICTURE
        <div class="row">
          <div class="col s12">
             <img src="this.$route.params.auction.imageURL" alt="./skor.jpg">
          </div>
        </div>
      </div>
      <div class="col s4">INFO
        <div class="row">
      <div class="col s4">START PRICE
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
          <input placeholder="Input bid" id="first_name" type="text" class="validate" v-model="price">
          <label for="first_name">Lay bid</label>
          <p>{{price}}</p>
        </div>
        </div>
        <div class="row">
      <div class="col s12"><a href="" class="btn" @click.prevent="placeBid(price)">PLACE BUD</a></div>
        </div>
    </div>
      
    </div>
    <div class="row">
      <div class="col s8">DESCRIPTION
        <div class="row">
      <div class="col s12">{{ this.$route.params.auction.description }}</div>
      <div class="col s12">{{ this.$route.params.auction.id }}</div>
    </div>
      </div>
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
  //props: ['auction'],
  data() {
    return {
      title: 'Details about auction',
      price: 0
    };
  },
 
  mounted () {
    M.AutoInit(),
    
    fetch('http://localhost:5000/api/v1/auction')
    .then(res => {
      return res.json()
    })
    .then(data => console.log(data))
    //.catch(error => console.log('ERROR'))
  
  },
  methods: {
    async placeBid(price){
      
      console.log(price);
      fetch('http://localhost:5000/api/v1/bid', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        userID:"123",
        auctionID: this.$route.params.auction.id,
        price: price
      })
    })
    .then(res => {
      return res.json()
    })
    .then(data => console.log(data))
    }
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

