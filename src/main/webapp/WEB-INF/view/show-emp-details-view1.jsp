<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<html>
<body>
<h2>
    Dear Employee:
</h2>
<br>
<br>
<%--Your name: ${param.employeeName}--%>
Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department ${employee.department}
<br><br>
Your car ${employee.carbrend}
<br><br>
Languages:
<ul>
    <c:forEach var="lang" items="${employee.languges}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br><br>
Phone number: ${employee.phoneNumber}
<br><br>
Email: ${employee.email}
</body>
</html>