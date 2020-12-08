<template>
  <div id="app">
    <Header/>
    <router-view />
  </div>
</template>

<script>
import Header from './components/Header.vue'

export default {
  name: 'app',
  methods: {

    async fetchAuctions() {
      this.$store.dispatch('fetchAuctions');
    },


    async fetchUser() {
      let user = JSON.parse(localStorage.getItem('currentUser'));
      console.log("Current user: ", user);
    },

    async fetchCurrentUser() {

      // Hårdkoda mail, fetcha och spara till vuex

      console.log("FETCHING......");
      let res = await fetch("http://localhost:5000/api/v1/user/whoami").catch((err) => console.error("ERROR HAPPENED: ", err));
    

      if (!res.ok) {
        console.log("BAD RESPONSE");
      } else {
        console.log("WAS OKAY");
        //console.log(await res.json().catch((err) => console.error("ERROR HAPPENED: ", err)));
      }

      res = await res.json().catch((err) => console.error("ERROR HAPPENED: ", err));
      console.log("Fetched current txt", res);


      //this.$store.commit('saveUser', res);
      //console.log(this.$store.getters.user);
    }
  },
  created() {
    this.fetchAuctions();
    this.fetchUser();
   // this.fetchCurrentUser();
  },
  components: {
    Header
  }
}

</script>


<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
