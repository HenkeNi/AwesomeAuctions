
<template>
  <nav class="nav-style">
    <div class="nav-wrapper">
      <a href="/" class="brand-logo center darken">Awesome Auction</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="/">Home</a></li>
        <li><a href="/contact">About</a></li>
        <li><a href="/createAuction" v-if="this.$store.getters.loggedInStatus == true">Create</a></li>
        <li><a href="/profile" v-if="this.$store.getters.loggedInStatus == true">Profile</a></li>
        <li><a class="modal-trigger" href="#login" v-if="this.$store.getters.loggedInStatus == false">Log In</a>
        <li><a href="#signup" class="modal-trigger" v-if="this.$store.getters.loggedInStatus == false">Create Account</a></li>
        <li><a href="/" @click.prevent="logout" v-if="this.$store.getters.loggedInStatus == true">Log Out</a></li>
        
  <!-- Modal Structure -->
  <div id="login" class="modal">
    <div class="container-fluid">
      <div class="row login">
        <div class="col s12 m8 offset-m2">
          <div class="center text-darken">
            <h4>Log in</h4>
            <!-- <hr class="hr-style"> -->
            <form @submit.prevent="login">
              <div class="input-field">
                <input type="email" id="email" v-model="email" />
                <label for="email">E-mail</label>
              </div>
              <div class="input-field">
                <input type="password" id="password" v-model="password" />
                <label for="password">Password</label>
              </div>
              <button
                type="submit"
                class="btn btn-small waves-effect"
              >Log in</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

        
      </ul>
      <div class="modal" id="signup">
        <div>
          <Signup></Signup>
        </div>
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
      email: "",
      password: "",
    }
  },
  methods: {
    isLoggedIn(){
      let currentUser = localStorage.getItem('currentUser')
      console.log(currentUser)
      if (currentUser == null){
        return false
      }
      return true
    },
    async logout(){
      console.log('logging out');
      this.$store.commit('setIsLoggedIn', false)
      localStorage.clear();
    },
    closeSignup() {
     
        let modal = document.querySelector("#signup");
        this.$M.Modal.getInstance(modal).close();
    
    },
    async login() {
  
      /*console.log(this.email, this.password);
  const credentials = 'email=' +
    encodeURIComponent(this.email)
    + '&password=' +
    encodeURIComponent(this.password)*/

  let response = await fetch("http://localhost:5000/api/v1/user/login", {
    method: "POST",
    //mode: "no-cors",
    headers: { 
        //'Accept': 'application/json',
        'Content-Type': 'application/json' 
    },
    body: 
  JSON.stringify({"email": this.email, "password": this.password})
  });

  if(!response.ok) {
    console.log('Wrong username/password');
    //console.log(await response.json());
  } else {
    console.log('Successfully logged in');
    let res = await response.json();
    
    localStorage.setItem('currentUser', JSON.stringify(res));
    this.$store.commit('setIsLoggedIn', true)
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

.nav-wrapper {
  background: -webkit-linear-gradient(to top, rgb(188,140,78), #dfd3fb);
  background: linear-gradient(to top, rgb(0,0,0), rgb(188,140,78));
  box-shadow:0px 0px 15px black;
  font-weight:bold;
}

.nav-wrapper a:hover{
  transform:translate(4px,3px);
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