<template>
       <nav class=footer>
    <div>
      <a href="#" class="brand-logo center">Connect with us!</a>
      <ul id="nav-mobile" class="center hide-on-med-and-down">
        <li><a href="/contact">Contact</a></li>
        <li><a href="badges.html">Facebook</a></li>
        <li><a href="collapsible.html">Twitter</a></li>
      </ul>
    </div>
  </nav>
            
</template>
<script>
import M from 'materialize-css'
export default {


  mounted(){
    M.AutoInit();

  },
}

</script>
<style scoped>

.footer{
  background: -webkit-linear-gradient(to top, rgb(44, 36, 156), #dfd3fb);
  background: linear-gradient(to top, rgb(255, 2, 141), rgb(117, 9, 67));
  position: fixed;
  bottom: 0;
}
</style>