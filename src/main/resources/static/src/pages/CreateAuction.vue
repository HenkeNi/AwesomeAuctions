<template>
<div class="containerAuction">
    <form action="#" @submit.prevent="createAuction()">
  <div class="auction">
      <h1>Create new auction</h1>
      <p class="test">Product name</p>
      <input class="product-name" v-model="name">
      <br>
      <p class="desc">Description</p>
      <input class="product-name" v-model="desc">
      <br>
       
    <p class="test">Image URL</p>
      <input class="img-url" type="text" v-model="img">
      <br>
  
      <p class="test">Start bid</p>
      <input class="asking-bid" type="number" min=0 oninput="validity.valid||(value='');" v-model="startBid">
      <br>
      <p class="test">End date</p>
      <input class="end-date" type="date" min=0 oninput="validity.valid||(value='');" v-model="endDate">
      <br>
        <button class="create-auction btn waves-effect waves-light" type="submit" name="action" >Create auction</button>
  </div>
  </form>
  </div>
</template>

<script>

import M from 'materialize-css'

export default {
    data() {
        return {
            name: '',
            desc: '',
            img: '',
            startBid: '',
            endDate: ''

        }
    },

    mounted () {
        M.AutoInit(),

        fetch('http://localhost:5000/api/v1/user')
        .then(res => {
            return res.json()
        })
    },
    methods: {
        createAuction(){
            console.log(this.name, this.desc, this.img, this.startBid, this.endDate);
        }
    }

}

</script>


<style>
.auction {
    margin:0 auto;
}

.product-name {
    width: 40% !important;
}

.asking-bid {
    width: 40% !important;
}

.test {
    margin-bottom: 0;
}

.create-auction {
    margin-top: 40px;
}

</style>