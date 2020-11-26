
<template>
<nav>
    <div class="navbar-wrapper"  >
    <div class="container">
      <a href="" class="brand-logo">AwesomeAuction</a>
      <div class="nav-info">
      <ul class="right hide-on-med-and-down">
        <li><a href="#about">About</a></li>
        <li><a href="#home">Home</a></li>
        <li><a href="#contact">Contact Us</a></li>
        <li><a href="#logIn/Register">Logg In/Register</a></li>
      </ul>
      </div>
<ul class="sidenav gray lighten 2" id="mobile-menue">
  <li><a href="#about">About</a></li>
        <li><a href="#home">Home</a></li>
        <li><a href="#contact">Contact Us</a></li>
        <li><a href="#logIn/Register">Logg In/Register</a></li>
</ul>
    </div>

               

       </div>
    </nav>


</template>
  
 <script>
import M from 'materialize-css'
export default {
    mounted () {
    M.AutoInit()
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
.nav-info{

   align-items: center;
   justify-content: space-between;
  align-content: space-between;
  display: inline-block
}

</style>