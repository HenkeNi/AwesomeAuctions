
<template>
<nav>
    <div class="nav-wrapper">
      <a href="#!" class="brand-logo center">Logga in/ Skapa konto</a>
      <ul class="left hide-on-med-and-down">
        <li><a href="sass.html">Sass</a></li>
        <li><a href="badges.html">Components</a></li>
        <li class="active"><a href="collapsible.html">JavaScript</a></li>
      </ul>
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