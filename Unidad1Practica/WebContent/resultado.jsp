<jsp:useBean id="op" class="da2.jmro.u1.Operacion" scope="request"></jsp:useBean>
<h1>El resultado es: </h1>
<jsp:getProperty property="result" name="op"/>