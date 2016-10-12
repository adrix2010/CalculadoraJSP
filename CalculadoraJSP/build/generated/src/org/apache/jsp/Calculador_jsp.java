package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Calculador_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

double numA,numB,resS,resR,resM,resD;
 numA=0;
 numB=0;
 resS=0;
 resR=0;
 resM=0;
 resD=0;
 
 if(request.getParameter("suma") != null){
        numA=Double.parseDouble(request.getParameter("numero1"));
        numB=Double.parseDouble(request.getParameter("numero2"));
        resS=numA+numB;
    }
 if(request.getParameter("resta") != null){
      numA=Double.parseDouble(request.getParameter("numero1"));
      numB=Double.parseDouble(request.getParameter("numero2"));
      resR=numA-numB;
 }
  if(request.getParameter("multiplicacion") != null){
       numA=Double.parseDouble(request.getParameter("numero1"));
       numB=Double.parseDouble(request.getParameter("numero2"));
       resM=numA*numB;
  }
  if(request.getParameter("division") != null){
       numA=Double.parseDouble(request.getParameter("numero1"));
       numB=Double.parseDouble(request.getParameter("numero2"));
       resD=numA/numB;
  }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t\n");
      out.write("\t<title>Calculadora</title>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"content\">\n");
      out.write("\t<h2>CalculadoraconJSP</h2>\n");
      out.write("        <div id=\"formularioCalculadora\">\n");
      out.write("\t<form method=\"POST\" action=\"Calculador.jsp\">\n");
      out.write("            Primer número <input type=\"text\" name=\"numero1\" value=\"");
      out.print(numA);
      out.write("\" /><br/>\n");
      out.write("            Segundo número <input type=\"text\" name=\"numero2\" value=\"");
      out.print(numB);
      out.write("\"/><BR/>\n");
      out.write("            <input type=\"submit\" name=\"suma\" value=\"Suma\"/>\n");
      out.write("            <input type=\"submit\" name=\"resta\" value=\"Resta\"/>\n");
      out.write("            <input type=\"submit\" name=\"multiplicacion\" value=\"Multiplicacion\"/>\n");
      out.write("            <input type=\"submit\" name=\"division\" value=\"Division\"/>\n");
      out.write("            ");
if(request.getParameter("suma") != null) {
      out.write("\n");
      out.write("            <div id=\"resultado\">\n");
      out.write("\t\t\t\t<p>El resultado es:<br/>\n");
      out.write("                                    <span >");
      out.print(resS);
      out.write("</span>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("             ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </body>\n");
      out.write("        </html>\n");
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
