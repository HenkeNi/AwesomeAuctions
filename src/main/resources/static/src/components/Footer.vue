<template>
<footer class="page-footer">
          <div class="container">
            <div class="row">
              <div class="col s6">
             
                <h5>About us</h5>
  
                
                <a href="#">Contact us</a><br/>
                <a href="#">Career</a>
              </div>
              
              <div class="col s6">
                <h5>Connect</h5>
             
                <a href="#">Facebook</a><br/>
                <a href="#">Instagram</a><br/>
                <a href="#">Twitter</a>
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container"><br/>
            © 2020 Copyright Awesome Auctions
        
            </div>
          </div>
        </footer>
            
</template>
<script>
import M from 'materialize-css'
import Footer from '../components/Footer'
export default {

  components: Footer,

  mounted(){
    M.AutoInit();
   

    

  },
}

</script>
<style scoped>
h5 {
  color:black;
  font-family: 'Courier New', Courier, monospace;

}

a{
  color:  black;
  font-family: 'Courier New', Courier, monospace;
  font-size: 12px;

}
body {
    display: flex;
    min-height: 100vh;
    flex-direction: column;
  
  }

  main {
    flex: 1 0 auto;
  }
</style>
