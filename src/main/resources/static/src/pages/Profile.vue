<template>
<div class="profile-page">
  <div>
    <h3>
     Hej {{ user.name }}!
    </h3>
    <h4>Phone: {{ user.phone }}</h4>
    <h4>Email: {{ user.email }}</h4>
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
      //console.log("Current User: ", user);
      this.user = user
    }
  },
  created(){
    M.AutoInit();
    this.fetchUser();
  }
}

 </script>

 <style>
.profile-page h4{
  color:white;
  font-weight: bold;
  text-align: center;
  text-decoration: underline;
}

.profile-page h3{
  color: white;
  text-decoration: underline;
  font-weight: bold;
}

 </style>