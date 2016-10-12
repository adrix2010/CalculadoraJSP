
<%
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
%>
<%@ page pageEncoding="UTF-8"%>

<head>
	
	<title>Calculadora</title>
	<style type="text/css">
  body {
    color: purple;
    text-align: center;
    align-content: center;  
  }
  </style>
</head>

<body>
<div class="content">
	<h2>CalculadoraconJSP</h2>
        <div id="formularioCalculadora">
	<form method="POST" action="Calculador.jsp">
            Primer número <input type="text" name="numero1" value="<%=numA%>" /><br/>
            Segundo número <input type="text" name="numero2" value="<%=numB%>"/><BR/>
            <input type="submit" name="suma" value="Suma"/>
            <input type="submit" name="resta" value="Resta"/>
            <input type="submit" name="multiplicacion" value="Multiplicacion"/>
            <input type="submit" name="division" value="Division"/>
            <%if(request.getParameter("suma") != null) {%>
            <div id="resultado">
				<p>El resultado es:<br/>
                                    <span ><%=resS%></span>
				</p>
			</div>
             <%}%>
               <%if(request.getParameter("resta") != null) {%>
            <div id="resultado">
				<p>El resultado es:<br/>
                                    <span ><%=resR%></span>
				</p>
			</div>
             <%}%>
              <%if(request.getParameter("multiplicacion") != null) {%>
            <div id="resultado">
				<p>El resultado es:<br/>
                                    <span ><%=resM%></span>
				</p>
			</div>
             <%}%>
              <%if(request.getParameter("division") != null) {%>
            <div id="resultado">
				<p>El resultado es:<br/>
                                    <span ><%=resD%></span>
				</p>
			</div>
             <%}%>
        </div>
        </body>
        </html>
