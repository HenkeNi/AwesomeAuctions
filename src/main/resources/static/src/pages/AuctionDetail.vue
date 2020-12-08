<template>
  <div class="details-page">
    <h4>{{ this.$route.params.auction.productName }}</h4>
    <div class="main-container">
      <div class="img-container">
        <img src="./skor.jpg" />
      </div>
      <div class="description">
        <h5>Description</h5>
        <p>{{ this.$route.params.auction.id }}</p>
      </div>
    </div>
    <div class="bottom-container">
        <h6>Current Bid: {{ this.$route.params.auction.currentBid }}</h6>
        <h6 class="expire">Expires at: {{ this.$route.params.auction.endDate }}</h6>
    </div>
    <div class="bid-form">
      <div class="input-field col s12">
              <input placeholder="Input bid" id="first_name" type="text" class="validate" v-model="price"/>
              <label for="first_name"></label>
      </div>
        <a href class="btn"  @click.prevent="placeBid(price)">PLACE BUD</a>
    </div>
    
    <!-- <div class="container">
      <div class="row">
        <h2>{{ this.$route.params.auction.productName }}</h2>
        <div class="col s8">
          <div class="row">
            <div class="col s12">
               <img id="auction-img" src="this.$route.params.auction.imageURL" onerror="standby()" /> 
              <img src="./skor.jpg" />
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
            <div class="col s4">BID
              <h3>Current Bid: {{ (this.$route.params.auction.currentBid == undefined ? "Not Available" : this.$route.params.auction.currentBid) }}</h3>
            </div>
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
    </div> -->
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
      title: "Details about auction",
      price: 0
    };
  },
  methods: {
    standby() {
      document.getElementById('auction-img').src = "./skor.jpg"
    },
    async placeBid(price){
      if(this.$route.params.auction.userID == 123){
        console.log('u cannot place bid on your own auction');
        return 
      }
      console.log(price);
      console.log(this.$route.params.auction.userID);
      console.log(this.$route.params.auction.id);
      await fetch('http://localhost:5000/api/v1/bid', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        userID: "123",
        auctionID: this.$route.params.auction.id,
        price: price
      })
    })
    .then(res => {
      return res.json()
    })
    .then(data => console.log(data))
    }
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
.container {
  width: 80vw;
  background-color: pink;
  margin: auto;
}

.main-container {
  display: flex;
  justify-content: center;
  
}

.main-container img {
  padding-right: 20px;
}

.main-container h5 {
  margin: 0;
  padding-left: 20px;
}


.details-page h4 {
  text-align: center;
  text-decoration: underline;
}

.bid-form {
  margin: auto;
  width: 420px;
}

.expire {
  font-size: small;
}

div {
  background-color: #f3f3f3;
}
</style>

