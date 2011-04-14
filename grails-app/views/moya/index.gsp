<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>List Characters</title></head>
  <body>

  <g:each in="${characters}" var="character">
    ${character.class.name}<br>
    ${character.race()}<br>
    ${character.actor()}<br>
    <p></p>
  </g:each>

  </body>
</html>