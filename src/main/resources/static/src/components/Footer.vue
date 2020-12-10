<template>
       <nav class=footer>
    <div>
      <a href="#" class="brand-logo center">Connect with us!</a>
      <ul id="nav-mobile" class="center hide-on-med-and-down">
        <li><a class="hover-effect" href="/contact">Contact</a></li>
        <li><a class="hover-effect" href="badges.html">Facebook</a></li>
        <li><a class="hover-effect" href="collapsible.html">Twitter</a></li>
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
  background: -webkit-linear-gradient(to top, rgb(188,140,78), #dfd3fb);
  background: linear-gradient(to top, rgb(0,0,0), rgb(188,140,78));
  box-shadow:0px 0px 15px black;
  font-weight:bold;
  position: fixed;
  bottom: 0;
}

.hover-effect:hover{
  transform:translate(4px,3px);
}
</style>