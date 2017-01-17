package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pointage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta content=\"text/html; charset=UTF-8\" http-equiv=\"content-type\">\n");
      out.write("    <title>pointage</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Operation pointage</h1>\n");
      out.write("    <p>Employe de bureau [ 7h - 12h, 14h - 17h] <button formaction=\"get\" form=\".\"\n");
      out.write("\n");
      out.write("        value=\"Modifier\" name=\"modifier\">Modifier</button>&nbsp;&nbsp;&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Employe de nuit [\n");
      out.write("      18h - 6h] <span style=\"font-family: MS Shell Dlg \\32 ;\"></span><button formaction=\"get\"\n");
      out.write("\n");
      out.write("        form=\"Modifier\" value=\"Modifier\" name=\"Modifier\">Modifier</button></p>\n");
      out.write("<form action=\"EnregistrementPointage.jsp\">\n");
      out.write("    <p>&nbsp;<input required=\"required\" name=\"poste\" type=\"radio\" value=\"bureau\">\n");
      out.write("    Employe de bureau&nbsp;&nbsp; <input required=\"required\" value=\"nuit\" name=\"poste\" type=\"radio\">Employe de nuit</p>\n");
      out.write("    <fieldset>\n");
      out.write("        Matricule:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;\n");
      out.write("        <input name=\"saisiMatricule\" type=\"text\">\n");
      out.write("        &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("        Date :&nbsp;<input name=\"datepointage\" type=\"text\"> <br>\n");
      out.write("      <br>\n");
      out.write("      Heure :&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("      <input name=\"heure\" type=\"text\"><br>\n");
      out.write("      <p>&nbsp;<input required=\"required\" value=\"entree\" name=\"etat\" type=\"radio\">\n");
      out.write("    Entree&nbsp;&nbsp; <input required=\"required\" value=\"sortie\" name=\"etat\" type=\"radio\">Sortie</p>\n");
      out.write("      <input value=\"Valider\" name=\"valider\" type=\"submit\"><br>\n");
      out.write("      <legend>POINTAGE ENTREE / SORTIE&nbsp;</legend> </fieldset>\n");
      out.write("</form>\n");
      out.write("<!--    <br>\n");
      out.write("    <fieldset form=\"permission\" name=\"\">Matricule:&nbsp;&nbsp;&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp; <input name=\"saisiMatricule\"\n");
      out.write("\n");
      out.write("        type=\"text\">&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Nom et prenom : <br>\n");
      out.write("      <br>\n");
      out.write("      <input required=\"required\" form=\"permission\" value=\"Permission\" name=\"Permission\"\n");
      out.write("\n");
      out.write("        type=\"radio\">Permission &nbsp;&nbsp;&nbsp; <input required=\"required\" value=\"Permission\"\n");
      out.write("\n");
      out.write("        name=\"Permission\" type=\"radio\">Recuperation &nbsp;&nbsp;&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp; Date debut : <input autocomplete=\"on\" step=\"1\" max=\"2999\"\n");
      out.write("\n");
      out.write("        min=\"2016\" form=\"datepr\" name=\"datepr\" type=\"datetime-local\">&nbsp;&nbsp;&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp; Date reprise : <input autocomplete=\"on\" max=\"2999\" min=\"2016\" name=\"datepr\" type=\"datetime-local\">&nbsp; <br>\n");
      out.write("      <br>\n");
      out.write("      <button formaction=\"get\" form=\"pointage\" value=\"Valider\" name=\"validerpointage\">VALIDER</button><br>\n");
      out.write("      <legend>Permission / Recuperation&nbsp;</legend> </fieldset>\n");
      out.write("    <br>\n");
      out.write("    <fieldset form=\"hs\" name=\"heure supplementaire\">Matricule:\n");
      out.write("      &nbsp;&nbsp;&nbsp; &nbsp; &nbsp; <input name=\"saisiMatricule\" type=\"text\">&nbsp;&nbsp;&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Nom et prenom : <br>\n");
      out.write("      <br>\n");
      out.write("      Date :&nbsp;&nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      &nbsp; <input autocomplete=\"on\" max=\"2999\" min=\"2016\" name=\"datepr\" type=\"datetime-local\">&nbsp;&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp;&nbsp; Nombre d'heure :&nbsp; <input name=\"saisiMatricule\"\n");
      out.write("\n");
      out.write("        type=\"text\">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      40%&nbsp; :&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 50% :<br>\n");
      out.write("      &nbsp;<br>\n");
      out.write("      <button formaction=\"get\" form=\"retard\" value=\"Valider\" name=\"valider\">VALIDER</button><br>\n");
      out.write("      <legend>Heure supplementaire</legend> </fieldset>-->\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
