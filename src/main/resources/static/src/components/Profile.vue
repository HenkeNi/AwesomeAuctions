<template>

 <div>
    <div class="card cover">

      <h1>Here is profile</h1>
     
  </div>
  

      



</template>

 <script>
import M from 'materialize-css'

export default {
    mounted () {
    M.AutoInit();
    let modal = document.querySelectorAll(".modal");
    this.$M.Modal.init(modal);
    }
}