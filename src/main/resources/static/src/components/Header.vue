
<template>
  <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo">Awesome Auction</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="sass.html">Sass</a></li>
        <li><a href="badges.html">Components</a></li>
        <li><a href="collapsible.html">JavaScript</a></li>
      </ul>
    </div>
  </nav>

       <!-- Modal Structure -->
  <!-- <div id="modal1" class="modal">
    <div class="modal-content">
      <h4>Modal Header</h4>
      <p>A bunch of text</p>
    </div>
    <div class="modal-footer">
      <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
    </div> -->



</template>
  
 <script>
import M from 'materialize-css'
import Signup from '../components/users/Signup'

export default {
    name: 'header',
    components: {
      Signup
    },
    data() {
      return {
        isLoggedin: false,
      }
    },
    methods: {
      closeSignup() {
      if (this.isLoggedin) {
        let modal = document.querySelector("#signup");
        this.$M.Modal.getInstance(modal).close();
      }
    }
    },
    mounted () {
    M.AutoInit();
    let modal = document.querySelectorAll(".modal");
    this.$M.Modal.init(modal);
},
}

</script>
<style>
.container{
height: 70px;
background-color: red;
 display: flex;
   align-items: center;
   justify-content: space-between;
  align-content: space-between;
  

}
.nav-info{

   align-items: center;
   justify-content: space-between;
  align-content: space-between;
   display: flex;
}

</style>