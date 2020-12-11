
<template>
 <div class="row transparent">
    <div class="card cover transparent">
      <div class=" card center-align transparent">
        <div class="card-content white-text transparent">
          <span class="card-title text">About us</span>
          <h2 class="text">Here you can buy what you need and sell what you don't need. You can suggest higher price also.</h2>
        </div>
        <div class="card-action transparent">
          <h2 class="text" >Contact Us</h2>
          <ul>
         <li> <a class="btn-large btn-style" href="#">Send Mail</a></li>
         <br/>
          <li><a class="btn-large btn-style" href="#">Call Us</a></li>
          </ul>
        </div>
      </div>
      </div>
     
  </div>
</template>

 <script>
import M from 'materialize-css'

export default {
    mounted () {
    M.AutoInit();
    let modal = document.querySelectorAll(".modal");
    this.$M.Modal.init(modal);
    }
}
</script>

<style>
.text {
  color: white;
}

.btn-style{
  background-color: rgb(188,140,78);
}

.card-action{
  border:none;
}

</style>
