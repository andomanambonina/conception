<%-- 
    Document   : pointageMultiple
    Created on : 11 janv. 2017, 08:22:01
    Author     : Bae
--%>

<%@page import="metier.Exam13"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.Date"%>
<%@page import="mapping.Personnel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="metier.InsertionMultipleService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta content="text/html; charset=UTF-8" http-equiv="content-type">
        <title></title>
    </head>
    <body>
        <h1>POINTAGE INSERTION MULTIPLE</h1>
        <form action="">
            <label>Direction : </label>
            <!--style="width="100px"; height="30px;"-->
            <select name="selection">
                <option value="1">Commerciale</option>
                <option value="2">Financiere</option>
                <option value="3">Technique</option>
            </select>
            <label>Semaine :</label>
            <input type="date" name="datename">
            <input type="submit" value="Editer">
            <%
                if (request.getParameter("datename") != null) {
                    String dt = request.getParameter("datename");
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date d = formatter.parse(dt); //86400000
                    long ld = d.getTime();
                    long lun = ld;
                    long mar = ld + 86400000;
                    long merc = ld + (86400000 * 2);
                    long jeud = ld + (86400000 * 3);
                    long vend = ld + (86400000 * 4);
                    long sam = ld + (86400000 * 5);
                    long dim = ld + (86400000 * 6);
                    Date l = new Date(lun);
                    Date m = new Date(mar);
                    Date me = new Date(merc);
                    Date j = new Date(jeud);
                    Date v = new Date(vend);
                    Date s = new Date(sam);
                    Date di = new Date(dim);
            %>
            <br><br><br>
        </form>
        <form action="servicePointage.jsp">
            <input type="hidden" value="<%out.print(request.getParameter("datename"));%>" name="datepointage">
            <input type="hidden" value="<%out.print(l.toString());%>" name="lundi">
            <input type="hidden" value="<%out.print(m.toString());%>" name="mardi">
            <input type="hidden" value="<%out.print(me.toString());%>" name="mercredi">
            <input type="hidden" value="<%out.print(j.toString());%>" name="jeudi">
            <input type="hidden" value="<%out.print(v.toString());%>" name="vendredi">
            <input type="hidden" value="<%out.print(s.toString());%>" name="samedi">
            <input type="hidden" value="<%out.print(di.toString());%>" name="dimanche">
            <input type="hidden" value="<%out.print(request.getParameter("selection"));%>" name="select">
            <div>
                <table border="1px" style="margin:auto;">
                    <thead >
                    <th >Matricule</th>
                    <th >Nom et Prenom</th> 
                    <th colspan="2"><%out.print(l.toString());%></th>
                    <th colspan="2"><%out.print(m.toString());%></th>
                    <th colspan="2"><%out.print(me.toString());%></th>
                    <th colspan="2"><%out.print(j.toString());%></th>
                    <th colspan="2"><%out.print(v.toString());%></th>
                    <th colspan="2"><%out.print(s.toString());%></th>
                    <th colspan="2"><%out.print(di.toString());%></th>
                    <th>Temps reparties</th>
                    <th>Modele</th>
                    </thead>
                    <%
                        InsertionMultipleService ims = new InsertionMultipleService();

                        String select = request.getParameter("selection");
                        System.out.println("====select " + select);
                        if (select != null) {
                            int slct = Integer.parseInt(select);
                            ArrayList<Personnel> ap = ims.findPersonnel(slct);

                            for (int i = 0; i < ims.nbrPersParDepart(slct); i++) {
                    %>
                    <input type="hidden" value="<%out.print(ap.size());%>" name="size">
                    <tbody>
                        <tr>
                            <td ><input name="matricule[<%out.print(i);%>]" type="text" style=" width: 90px;" value="<% out.print(ap.get(i).getIdpers());%>"></td>
                            <td><input name="nomprenom[<%out.print(i);%>]" type="text" style=" width: 200px;" value="<% out.print(ap.get(i).getNom() + " " + ap.get(i).getPrenom());%>"></td>
                            <td ><input name="hlundi[<%out.print(i);%>]"  type="text" style=" width: 70px;"></td>
                            <td><input name="retlundi<%out.print(i);%>" type="text" value="" placeholder="retard" style="width: 40px;"></td>
                            <td ><input name="hmardi[<%out.print(i);%>]"  type="text" style=" width: 70px;"></td>
                            <td><input name="retmardi<%out.print(i);%>" type="text" value="" placeholder="retard" style="width: 40px;"></td>
                            <td ><input name="hmercredi[<%out.print(i);%>]"  type="text" style=" width: 70px;"></td>
                            <td><input name="retmercredi<%out.print(i);%>" type="text" value="" placeholder="retard" style="width: 40px;"></td>
                            <td ><input name="hjeudi[<%out.print(i);%>]"  type="text" style=" width: 70px;"></td>
                            <td><input name="retjeudi<%out.print(i);%>" type="text" value="" placeholder="retard" style="width: 40px;"></td>
                            <td ><input name="hvendredi[<%out.print(i);%>]"  type="text" style=" width: 70px;"></td>
                            <td><input name="retvendredi<%out.print(i);%>" type="text" value="" placeholder="retard" style="width: 40px;"></td>
                            <td><input name="hsamedi[<%out.print(i);%>]"  type="text" style=" width: 70px;"></td>
                            <td><input name="retsamedi<%out.print(i);%>" type="text" value="" placeholder="retard" style="width: 40px;"></td>
                            <td ><input name="hdimanche[<%out.print(i);%>]"  type="text" style=" width: 70px;"></td>
                            <td><input name="retdimanche<%out.print(i);%>" type="text" value="" placeholder="retard" style="width: 40px;"></td>
                            <td><input type="text" name="temps" style=" width: 120px;"></td>
                            <td><input type="text" name="modele" style=" width: 70px;"></td>             
                        </tr>
                    </tbody>
                    <%}
                            }
                        }
                    %>
                </table>

                <input type="submit" value="POINTER">
                </form>

                </body>
            </div>
</html>

