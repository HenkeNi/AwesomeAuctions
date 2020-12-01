
<template>
  <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo center">Awesome Auction</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="sass.html">Home</a></li>
        <li><a href="badges.html">About</a></li>
        <li><a class="modal-trigger" href="#login">Log In</a>

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

        <li><a href="collapsible.html">Register</a></li>
      </ul>
    </div>
  </nav>




</template>
  
<script>
import M from 'materialize-css'
export default {

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

</style>