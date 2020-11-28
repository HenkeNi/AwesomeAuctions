
<template>
<nav>
    <div class="navbar-wrapper"  >
    <div class="container">
      <a href="" class="brand-logo">AwesomeAuction</a>
      <a href="" class="sidenav-trigger" data-target="mobile-menue">
        <i class="material-icons">menu</i>
              </a>
      <div class="nav-info">
      <ul class="right hide-on-med-and-down">
        <li><a href="#about">About</a></li>
        <li><a href="#home">Home</a></li>
        <li><a href="#contact">Contact Us</a></li>
        <li><a href="#logIn/Register">Logg In/Register</a></li>
        <li v-if="!isLoggedin">
            <a href="#signup" class="modal-trigger">SKAPA KONTO</a>
        </li>
      </ul>
      </div>

<ul class="sidenav gray lighten-2" id="mobile-menue">
  <li><a href="#about">About</a></li>
        <li><a href="#home">Home</a></li>
        <li><a href="#contact">Contact Us</a></li>
        <li><a href="#logIn/Register">Logg In/Register</a></li>
        
</ul>
    </div>
          
               
        <div class="modal grey lighten-4" id="signin">
          <Signup v-on:close="closeModal($event)" />
        </div>
       </div>
    </nav>


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
    M.AutoInit()
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