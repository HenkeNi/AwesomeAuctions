<template>
<div class="containerAuction">
  <div class="auction">
      <h1>Create new auction</h1>
      <p class="test">Product name</p>
      <input class="product-name">
      <br>
      <br>
      <p class="test">Asking bid</p>
      <input class="asking-bid" type="number" min=0 oninput="validity.valid||(value='');">
      <br>
        <button class="create-auction btn waves-effect waves-light" type="submit" name="action">Create auction</button>
  </div>
  </div>
</template>

<script>

import M from 'materialize-css'

export default {

    mounted () {
        M.AutoInit(),

        fetch('http://localhost:5000/api/v1/user')
        .then(res => {
            return res.json()
        })
    },

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