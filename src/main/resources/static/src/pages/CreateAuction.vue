<template>
<div class="containerAuction">
    <form action="#" @submit.prevent="createAuction()">
  <div class="auction">
      <h1>Create new auction</h1>
      <p class="p-tag">Product name</p>
      <input class="product-name width-input" v-model="name">
      <br>
      <p class="p-tag">Description</p>
      <input class="description width-input" v-model="desc">
      <br>
      <p class="p-tag">Image URL</p>
      <input class="img-url width-input" type="text" v-model="img">
      <br>
      <p class="p-tag">Start bid</p>
      <input class="asking-bid width-input" type="number" min=0 oninput="validity.valid||(value='');" v-model="startBid">
      <br>
      <p class="p-tag">End date</p>
      <input class="end-date width-input" type="number" min=0 oninput="validity.valid||(value='');" v-model="endDate">
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
        async createAuction(){
            console.log(this.name, this.desc, this.img, this.startBid, this.endDate);
            await fetch('http://localhost:5000/api/v1/auction', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        userID:"123",
        productName: this.name,
        description: this.desc,
        imageURL: this.img,
        startBid: this.startBid,
        endDate: this.endDate
      })
    })
        }
    }

}

</script>


<style>
.auction {
    margin:0 auto;
}

.width-input {
    width: 40% !important;
}

.asking-bid {
    width: 40% !important;
}

.p-tag {
    margin-bottom: 0;
}

.create-auction {
    margin-top: 40px;
}

</style>