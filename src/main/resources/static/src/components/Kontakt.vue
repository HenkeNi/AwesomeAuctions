
<template>

 <div class="row">
    <div class="col s12 m6">
      <div class=" card blue darken-1 ">
        <div class="card-content white-text">
          <span class="card-title">About us</span>
          <h2>Here you can buy what you need and sell what you dont't need. You can suggest higher price also.</h2>
        </div>
        <div class="card-action red-text">
          <h2>Contact Us</h2>
          <ul>
         <li> <a href="#">Send Mail</a></li>
          <li><a href="#">Ring Us</a></li>
          </ul>
        </div>
      </div>
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