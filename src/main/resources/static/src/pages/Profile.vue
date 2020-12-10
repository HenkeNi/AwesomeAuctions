<template>
<div class="profile-page">
  <div>
    <h4>
     Hej {{ user.name }}!
    </h4>
    <p>Phone: {{ user.phone }}</p>
    <p>Email: {{ user.email }}</p>
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

 <style scoped>
 .profile-page{
   background-image: url('../assets/background2.jpg');
 }
 </style>