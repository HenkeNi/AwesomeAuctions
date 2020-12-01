
<template>
 <!-- <nav>   
    <div class="nav-wrapper blue">

      <div class="container">
        <a href="#" class="left">Awesome Auction</a>
        <a href="" class="sidenav-trigger" data-target="mobile-menu"><i class="material-icons">menu</i></a>
      <ul class="right hide-om-med-and-down">
       <li><a href="#">About us</a></li>
        <li><a href="#">Contact Us</a></li>
        <li><a href="#">Logg in</a></li>
        <li><a href="#"> Register</a></li>
        </ul>
      </div>
      <div>
    <ul class="sidenav gray lighten-2" id="mobile-menu">
        <li><a href="#">About us</a></li>
        <li><a href="#">Contact Us</a></li>
        <li><a href="#">Logg in/ Register</a></li>
      </ul>
    </div>
    </div>
  </nav>  -->

  <nav>
    
    <div class="nav-wrapper">
      <a href="#" class="brand-logo">Awesome Auction</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="sass.html">Sass</a></li>
        <li><a href="badges.html">Components</a></li>
        <li><a href="collapsible.html">JavaScript</a></li>
      </ul>
      
    </div>
    <ul class="sidenav" id="mobile-demo">
    <li><a href="sass.html">Sass</a></li>
    <li><a href="badges.html">Components</a></li>
    <li><a href="collapsible.html">Javascript</a></li>
    <li><a href="mobile.html">Mobile</a></li>
    <li v-if="!isLoggedin">
            <a href="#signup" class="modal-trigger">Skapa Konto</a>
    </li>
  </ul>
  <div class="modal grey lighten-4" id="signup">
    <Signup v-on:close="closeModal($event)" />
  </div>
  </nav>
</template>
  
<script>
import M from 'materialize-css'
import Signup from '../components/users/Signup'
export default {

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
  data() {
    return {
      email: "",
      password: "",
    
    }
  },
  methods: {
    async login() {
  

  /*const credentials = 'username=' +
    encodeURIComponent(username)
    + '&password=' +
    encodeURIComponent(password)*/

  let response = await fetch("http://localhost:5000/api/v1/user/login", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({email: this.email, password: this.password})
  });

  if(response.url.includes('error')) {
    console.log('Wrong username/password');
  } else {
    console.log('u logged in');
    console.log(await response.json());
  }
}
  },
    
    mounted () {
    M.AutoInit();
    let modal = document.querySelectorAll(".modal");
    this.$M.Modal.init(modal);
  
},
    }
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
@media screen and (min-width: 0px) and (max-width: 400px) {
  #my-content { display: block; }  /* show it on small screens */
}

@media screen and (min-width: 401px) and (max-width: 1024px) {
  #my-content { display: none; }   /* hide it elsewhere */
}

</style>