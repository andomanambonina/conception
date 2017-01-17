<%-- 
    Document   : servicePointage
    Created on : 12 janv. 2017, 15:12:18
    Author     : Bae
--%>

<%@page import="metier.Exam13"%>
<%@page import="metier.InsertPointages"%>
<%@page import="mapping.Personnel"%>
<%@page import="metier.InsertionMultipleService"%>
<%@page import="mapping.Pointage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<meta http-equiv="refresh" content="0;url=servicePointage.jsp">-->
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1px">
            <thead >
            <th >Matricule</th>
            <th >Nom et Prenom</th> 
            <th ><%out.print(request.getParameter("lundi"));%></th>
            <th ><%out.print(request.getParameter("mardi"));%></th>
            <th ><%out.print(request.getParameter("mercredi"));%></th>
            <th ><%out.print(request.getParameter("jeudi"));%></th>
            <th ><%out.print(request.getParameter("vendredi"));%></th>
            <th ><%out.print(request.getParameter("samedi"));%></th>
            <th ><%out.print(request.getParameter("dimanche"));%></th>
            <th>Total retard</th>
        </thead>
        <%
            int i = 0;
            String size = request.getParameter("size");
            int taille = Integer.parseInt(size);
            String lundi = request.getParameter("lundi");
            String mardi = request.getParameter("mardi");
            String mercredi = request.getParameter("mercredi");
            String jeudi = request.getParameter("jeudi");
            String vendredi = request.getParameter("vendredi");
            String samedi = request.getParameter("samedi");
            String dimanche = request.getParameter("dimanche");
            out.print("date lundi " + lundi);
            

            for (i = 0; i < taille; i++) {
                String matricule = request.getParameter("matricule[" + i + "]");
                int matr = Integer.parseInt(matricule);
                String nomprenom = request.getParameter("nomprenom[" + i + "]");
                String hlundi = request.getParameter("hlundi[" + i + "]");
                String hmardi = request.getParameter("hmardi[" + i + "]");
                String hmercredi = request.getParameter("hmercredi[" + i + "]");
                String hjeudi = request.getParameter("hjeudi[" + i + "]");
                String hvendredi = request.getParameter("hvendredi[" + i + "]");
                String hsamedi = request.getParameter("hsamedi[" + i + "]");
                String hdimanche = request.getParameter("hdimanche[" + i + "]");
                ///////////////////////////////////////////////////////////////
                String retLundi = request.getParameter("retlundi"+i+"");
                String retMardi = request.getParameter("retmardi"+i+"");
                String retMercredi = request.getParameter("retmercredi"+i+"");
                String retJeudi = request.getParameter("retjeudi"+i+"");
                String retVendredi = request.getParameter("retvendredi"+i+"");
                String retSamedi = request.getParameter("retsamedi"+i+"");
                String retDimanche = request.getParameter("retdimanche"+i+"");
                //////////////////////////////////////////////////////////////
              
                
                ///////////////////////////////////////////////////////////////
                Personnel p = new InsertionMultipleService().getPersonnel(Integer.parseInt(matricule));
                String poste = new InsertionMultipleService().getPost(p.getIddepartement());
                InsertPointages ip = new InsertPointages();
                Exam13 e = new Exam13();
                double ret = e.getRetard(matr, request.getParameter("lundi"), request.getParameter("dimanche"));
                if (hlundi != null && hlundi != "") {
                    ip.insertionPointage(new Pointage(0, poste, matr, lundi, hlundi, "entree"));
                }
                //
                if(retLundi!=null && retLundi!=""){
                    ip.insertionPointage(new Pointage(0, poste, matr, lundi, e.calculRetard(retLundi, p.getIddepartement()), "entree"));
                }
                if (hmardi != null && hmardi != "") {
                    ip.insertionPointage(new Pointage(0, poste, matr, mardi, hmardi, "entree"));
                }
                //
                if(retMardi!=null && retMardi!=""){
                    ip.insertionPointage(new Pointage(0, poste, matr, lundi, e.calculRetard(retMardi, p.getIddepartement()), "entree"));
                }
                if (hmercredi != null && hmercredi != "") {
                    ip.insertionPointage(new Pointage(0, poste, matr, mercredi, hmercredi, "entree"));
                }
                //
                if(retMercredi!=null && retMercredi!=""){
                    ip.insertionPointage(new Pointage(0, poste, matr, lundi, e.calculRetard(retMercredi, p.getIddepartement()), "entree"));
                }
                if (hjeudi != null && hjeudi != "") {
                    ip.insertionPointage(new Pointage(0, poste, matr, jeudi, hjeudi, "entree"));
                }
                //
                if(retJeudi!=null && retJeudi!=""){
                    ip.insertionPointage(new Pointage(0, poste, matr, lundi, e.calculRetard(retJeudi, p.getIddepartement()), "entree"));
                }
                if (hvendredi != null && hvendredi != "") {
                    ip.insertionPointage(new Pointage(0, poste, matr, vendredi, hvendredi, "entree"));
                }
                //
                if(retVendredi!=null && retVendredi!=""){
                    ip.insertionPointage(new Pointage(0, poste, matr, lundi, e.calculRetard(retVendredi, p.getIddepartement()), "entree"));
                }
                if (hsamedi != null && hsamedi != "") {
                    ip.insertionPointage(new Pointage(0, poste, matr, samedi, hsamedi, "entree"));
                }
                //
                if(retSamedi!=null && retSamedi!=""){
                    ip.insertionPointage(new Pointage(0, poste, matr, lundi, e.calculRetard(retSamedi, p.getIddepartement()), "entree"));
                }
                if (hdimanche != null && hdimanche != "") {
                    ip.insertionPointage(new Pointage(0, poste, matr, dimanche, hdimanche, "entree"));
                }
                //
                if(retDimanche!=null && retDimanche!=""){
                    ip.insertionPointage(new Pointage(0, poste, matr, lundi, e.calculRetard(retDimanche, p.getIddepartement()), "entree"));
                }
        %>
        <tbody>
            <tr>
                <td><% out.print(nomprenom);%></td>
                <td><% out.print(matricule);%></td>
                <td ><%out.print(hlundi);%></td>
                <td ><%out.print(hmardi);%></td>
                <td ><%out.print(hmercredi);%></td>
                <td ><%out.print(hjeudi);%></td>
                <td ><%out.print(hvendredi);%></td>
                <td ><%out.print(hsamedi);%></td>
                <td ><%out.print(hdimanche);%></td>
                <td><%out.print(ret);%></td>
                
            </tr>
        </tbody>
        <%
            }
        %>
    </table>



</body>
</html>
