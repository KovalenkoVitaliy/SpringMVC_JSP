<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!Doctype html>
<html>
<body>
<h2>Dear, Please enter your details</h2>
<br>
<br>
<form:form action="/emp1/showDetails1" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
<%--    <form:option value="Information technology" label="IT"/>--%>
<%--    <form:option value="Human resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which car do you want?
<%--    BMW<form:radiobutton path="carbrend" value="BMW"/>--%>
<%--    Lada<form:radiobutton path="carbrend" value="Lada"/>--%>
<%--    Audi<form:radiobutton path="carbrend" value="Audi"/>--%>
    <form:radiobuttons path="carbrend" items="${employee.carBrends}"/>
    <br><br>
    Foreign languages
<%--    EN <form:checkbox path="languges" value="English"/>--%>
<%--    DE <form:checkbox path="languges" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languges" value="French"/>--%>
    <form:checkboxes path="languges" items="${employee.languageList}"/>
    <br><br>
    PhoneNumber <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    <input type="submit" value="OK">
    <br><br>
</form:form>

</body>
</html>