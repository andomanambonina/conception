package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.sql.Date;
import mapping.Personnel;
import java.util.ArrayList;
import metier.InsertionMultipleService;

public final class pointageMultiple_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta content=\"text/html; charset=UTF-8\" http-equiv=\"content-type\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>POINTAGE INSERTION MULTIPLE</h1>\n");
      out.write("        <form action=\"\">\n");
      out.write("            <label>Direction : </label>\n");
      out.write("            <!--style=\"width=\"100px\"; height=\"30px;\"-->\n");
      out.write("            <select name=\"selection\">\n");
      out.write("                <option value=\"1\">Commerciale</option>\n");
      out.write("                <option value=\"2\">Financiere</option>\n");
      out.write("                <option value=\"3\">Technique</option>\n");
      out.write("            </select>\n");
      out.write("            <label>Semaine :</label>\n");
      out.write("            <input type=\"date\" name=\"datename\">\n");
      out.write("            <input type=\"submit\" value=\"Editer\">\n");
      out.write("            ");

                if (request.getParameter("datename") != "") {
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
            
      out.write("\n");
      out.write("            <br><br><br>\n");
      out.write("            <div>\n");
      out.write("                <table border=\"1px\" style=\"margin:auto;\">\n");
      out.write("                    <thead >\n");
      out.write("                    <th >Matricule</th>\n");
      out.write("                    <th >Nom et Prenom</th> \n");
      out.write("                    <th >");
out.print(l.toString());
      out.write("</th>\n");
      out.write("                    <th >");
out.print(m.toString());
      out.write("</th>\n");
      out.write("                    <th >");
out.print(me.toString());
      out.write("</th>\n");
      out.write("                    <th >");
out.print(j.toString());
      out.write("</th>\n");
      out.write("                    <th >");
out.print(v.toString());
      out.write("</th>\n");
      out.write("                    <th >");
out.print(s.toString());
      out.write("</th>\n");
      out.write("                    <th >");
out.print(di.toString());
      out.write("</th>\n");
      out.write("                    </thead>\n");
      out.write("                    \n");
      out.write("                    ");

                        InsertionMultipleService ims = new InsertionMultipleService();

                        String select = request.getParameter("selection");
                        if (select != null) {
                            int slct = Integer.parseInt(select);
                            ArrayList<Personnel> ap = ims.findPersonnel(slct);

                            for (int i = 0; i < ims.nbrPersParDepart(slct); i++) {
                    
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"matricule[");
out.print(i);
      out.write("]\" type=\"text\" style=\" width: 110px;\" value=\"");
 out.print(ap.get(i).getIdpers());
      out.write("\"></td>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"nomprenom[");
out.print(i);
      out.write("]\" type=\"text\" style=\" width: 350px;\" value=\"");
 out.print(ap.get(i).getNom() + " " + ap.get(i).getPrenom());
      out.write("\"></td>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"hlundi[");
out.print(i);
      out.write("]\" value=\"");
out.print(i);
      out.write("\" type=\"text\" style=\" width: 110px;\"></td>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"hmardi[");
out.print(i);
      out.write("]\" value=\"");
out.print(i);
      out.write("\" type=\"text\" style=\" width: 110px;\"></td>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"hmercredi[");
out.print(i);
      out.write("]\" value=\"");
out.print(i);
      out.write("\" type=\"text\" style=\" width: 110px;\"></td>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"hjeudi[");
out.print(i);
      out.write("]\" value=\"");
out.print(i);
      out.write("\" type=\"text\" style=\" width: 110px;\"></td>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"hvendredi[");
out.print(i);
      out.write("]\" value=\"");
out.print(i);
      out.write("\" type=\"text\" style=\" width: 110px;\"></td>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"hsamedi[");
out.print(i);
      out.write("]\" value=\"");
out.print(i);
      out.write("\" type=\"text\" style=\" width: 110px;\"></td>\n");
      out.write("                            <td contenteditable=\"true\"><input name=\"hdimanche[");
out.print(i);
      out.write("]\" value=\"");
out.print(i);
      out.write("\" type=\"text\" style=\" width: 110px;\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");
}
                        }
                        }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</div>\n");
      out.write("</html>\n");
      out.write("\n");
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
