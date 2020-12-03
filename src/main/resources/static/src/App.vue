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
  async created() {
    this.$store.dispatch('fetchAuctions');
    console.log('hej');
    await fetch("http://localhost:5000/api/v1/user/whoami")
     .then(res => {
      return res.json()
    })
    .then(data => console.log(data))
    
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
