
<template>
 <!-- <nav>   
    <div class="nav-wrapper blue">

      <div class="container">
        <a href="#" class="left">Awesome Auction</a>
        <a href="" class="sidenav-trigger" data-target="mobile-menu"><i class="material-icons">menu</i></a>
      <ul class="right hide-om-med-and-down">
       <li><a href="#">About us</a></li>
        <li><a href="#">Contact Us</a></li>
        <li><a href="#">Logg in</a></li>
        <li><a href="#"> Register</a></li>
        </ul>
      </div>
      <div>
    <ul class="sidenav gray lighten-2" id="mobile-menu">
        <li><a href="#">About us</a></li>
        <li><a href="#">Contact Us</a></li>
        <li><a href="#">Logg in/ Register</a></li>
      </ul>
    </div>
    </div>
  </nav>  -->

  <nav>
    <div class="nav-wrapper">
      <a href="#!" class="brand-logo">Awesome Auction</a>
      <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
      <ul class="right hide-on-med-and-down">
        <li><a href="sass.html">Home</a></li>
        <li><a href="badges.html">Contact</a></li>
        <li><a href="collapsible.html">Log In</a></li>
        <li><a href="mobile.html">Register</a></li>
      </ul>
    </div>

    <ul class="sidenav" id="mobile-demo">
    <li><a href="sass.html">Home</a></li>
    <li><a href="badges.html">Contact</a></li>
    <li><a href="collapsible.html">Log In</a></li>
    <li><a href="mobile.html">Register</a></li>
  </ul>
  </nav>
  

      



</template>
  
 <script>
import M from 'materialize-css'

export default {
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