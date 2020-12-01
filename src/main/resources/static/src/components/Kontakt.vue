
<template>


 <div class="row">
    <div class="col s12 m6">
      <div class="card blue-grey darken-1">
        <div class="card-content white-text">
          <span class="card-title">About us</span>
          <p>I am a very simple card. I am good at containing small bits of information.
          I am convenient because I require little markup to use effectively.</p>
        </div>
        <div class="card-action">
          <a href="#">This is a link</a>
          <a href="#">This is a link</a>
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