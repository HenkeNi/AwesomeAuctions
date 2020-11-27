<template>
  <div class="home-page">
    <div class="container">
       <div class="row">
      <div class="col s8">PICTURE
        <div class="row">
          <div class="col s12">
             <img src="./skor.jpg">
          </div>
        </div>
      </div>
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
      <div class="input-field col s12">
          <input placeholder="Input bid" id="first_name" type="text" class="validate">
          <label for="first_name">Lay bid</label>
        </div>
        </div>
        <div class="row">
      <div class="col s12"><a href="" class="btn" @click="placeBid">PLACE BUD</a></div>
        </div>
    </div>
      
    </div>
    <div class="row">
      <div class="col s8">DESCRIPTION
        <div class="row">
      <div class="col s12">{{ description }}</div>
      <div v-for="auction in allAuctionDetail" :key="auction.id">
      <h2>{{auction.productName}}</h2>
      <h2>{{auction.description}}</h2>
    </div>
    <div>{{ allAuctionDetail[1].productName }}</div>
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
  data() {
    return {
      title: 'Details about auction',
      description: 'lorem ipsum dolor',
      allAuctionDetail: 
        // productName:"",
        // description:"",
        // imageURL:"",
        // startBid: 0,
        // endDate: 0
        []
      
    };
  },
  mounted () {
    M.AutoInit()
    
    
  },
  created() {
    this.fetchAuctions()
    console.log(this.auctionDetail);
  },
  methods: {
    async fetchAuctions() {

      fetch('http://localhost:5000/api/v1/auction')
      .then(res => res.json())
      .then(data => this.allAuctionDetail = data)
      .then(console.log(this.auctionDetail))
},
async placeBid(e){
  e.preventDefault();
  console.log('in place bid');
  fetch('http://localhost:5000/api/v1/bid', {
    method: 'POST',
    headers: { "Content-Type": "application/json" },
body : JSON.stringify({ 
  userID: 'test', 
  auctionID: '123', 
  price: 50
  })
    
  })
      .then(res => {
        console.log(res);
      })
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

