<%-- 
    Document   : pointage
    Created on : 17 nov. 2016, 09:38:21
    Author     : Bae
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <meta content="text/html; charset=UTF-8" http-equiv="content-type">
    <title>pointage</title>
  </head>
  <body>
    <h1>Operation pointage</h1>
    <p>Employe de bureau [ 7h - 12h, 14h - 17h] <button formaction="get" form="."

        value="Modifier" name="modifier">Modifier</button>&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Employe de nuit [
      18h - 6h] <span style="font-family: MS Shell Dlg \32 ;"></span><button formaction="get"

        form="Modifier" value="Modifier" name="Modifier">Modifier</button></p>
<form action="EnregistrementPointage.jsp">
    <p>&nbsp;<input required="required" name="poste" type="radio" value="bureau">
    Employe de bureau&nbsp;&nbsp; <input required="required" value="nuit" name="poste" type="radio">Employe de nuit</p>
    <fieldset>
        Matricule:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
        <input name="saisiMatricule" type="text">
        &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 
        Date :&nbsp;<input name="datepointage" type="text"> <br>
      <br>
      Heure :&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
      <input name="heure" type="text"><br>
      <p>&nbsp;<input required="required" value="entree" name="etat" type="radio">
    Entree&nbsp;&nbsp; <input required="required" value="sortie" name="etat" type="radio">Sortie</p>
      <input value="Valider" name="valider" type="submit"><br>
      <legend>POINTAGE ENTREE / SORTIE&nbsp;</legend> </fieldset>
</form>
<!--    <br>
    <fieldset form="permission" name="">Matricule:&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp; <input name="saisiMatricule"

        type="text">&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Nom et prenom : <br>
      <br>
      <input required="required" form="permission" value="Permission" name="Permission"

        type="radio">Permission &nbsp;&nbsp;&nbsp; <input required="required" value="Permission"

        name="Permission" type="radio">Recuperation &nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp; Date debut : <input autocomplete="on" step="1" max="2999"

        min="2016" form="datepr" name="datepr" type="datetime-local">&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp; Date reprise : <input autocomplete="on" max="2999" min="2016" name="datepr" type="datetime-local">&nbsp; <br>
      <br>
      <button formaction="get" form="pointage" value="Valider" name="validerpointage">VALIDER</button><br>
      <legend>Permission / Recuperation&nbsp;</legend> </fieldset>
    <br>
    <fieldset form="hs" name="heure supplementaire">Matricule:
      &nbsp;&nbsp;&nbsp; &nbsp; &nbsp; <input name="saisiMatricule" type="text">&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Nom et prenom : <br>
      <br>
      Date :&nbsp;&nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp; <input autocomplete="on" max="2999" min="2016" name="datepr" type="datetime-local">&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp; Nombre d'heure :&nbsp; <input name="saisiMatricule"

        type="text">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
      40%&nbsp; :&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 50% :<br>
      &nbsp;<br>
      <button formaction="get" form="retard" value="Valider" name="valider">VALIDER</button><br>
      <legend>Heure supplementaire</legend> </fieldset>-->
  </body>
</html>
