
<template>


  <div class="container">
  <h1 class="align-center">contact us</h1>
  <div>
    <a href="" class="btn facebook"></a>
    <a href="" class="btn instagram"></a>
    a.btn.
  </div>
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