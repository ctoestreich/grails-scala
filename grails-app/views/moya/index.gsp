<%--
  Created by IntelliJ IDEA.
  User: coestre
  Date: 3/31/11
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>List Characters</title></head>
  <body>

  <g:each in="${characters}" var="character">
    ${character.class.name}<br>
    ${character.race()}<br>
    ${character.actor()}<br>
    %{--My type: ${character.class.name}<br>--}%
    %{--My Race: ${character.race()}<br>--}%
    %{--I am played by: ${character.actor()}<br>--}%
    <p></p>
  </g:each>

  </body>
</html>