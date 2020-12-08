
<template>

<div class="row">
    <div class="col s12 m12">
      <div class="card blue-grey darken-1">
        <div class="card-content ffab40">
          <span class="card-title">Welcome {{user.name}}</span>
          
        </div>
      
      </div>
    </div>
  </div>
</template>
 
<script>
import M from 'materialize-css'
export default{
  data() {
    return {
      user: {}
    }
  },
  methods: {
    async fetchUser() {
      console.log('hej')
      let user = this.$store.getters.currentUser;
      //let user = JSON.parse(localStorage.getItem('currentUser'));
      console.log("Current User: ", user);
      this.user = user
    }
  },
  created(){
    M.AutoInit();
    this.fetchUser();
  }
}

 </script>