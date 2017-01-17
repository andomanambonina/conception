<%-- 
    Document   : EnregistrementPointage
    Created on : 17 nov. 2016, 11:17:38
    Author     : Bae
--%>

<%@page import="metier.TestEntreeEtSortieEmploye"%>
<%@page import="metier.InsertPointages"%>
<%@page import="mapping.Pointage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enregistrement pointage jsp</title>
    </head>
    <body>
        <%
            Pointage p = new Pointage();
            InsertPointages ip = new InsertPointages();
            p.setPoste(request.getParameter("poste"));
            p.setMatricule(request.getParameter("saisiMatricule"));
            p.setDatepointage(request.getParameter("datepointage"));
            p.setHeurepointage(request.getParameter("heure"));
            p.setEtat(request.getParameter("etat"));
            //////insertion
            ip.insertionPointage(p);
            try{
                TestEntreeEtSortieEmploye tep = new TestEntreeEtSortieEmploye();
                tep.test_horaire(p.getPoste(), p);
            }catch(Exception e){
                out.print("<h1>"+e.getMessage()+"</h1>");
            }
            
            
//            response.sendRedirect("pointage.jsp");
        %>
        <h1>tafa le pointage eeeee</h1>
    </body>
</html>
