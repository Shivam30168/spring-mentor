<%@ page import="com.example.mentor.Models.Mentor" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>   
<head>
    <title>All Mentor Requests</title>
    <jsp:include page="components/allcdn.jsp" />
    <style>
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        h1{
            text-align: center;
        }
    </style>
</head>
<body>
    <jsp:include page="components/Navbar.jsp" />
    <h1>All Mentor </h1>
    <div class="container">
        <table class="table table-striped table-hover">
          <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Mobile No</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Job Role</th>
                
            </tr>
        </thead>
        <tbody>
            <% List<Mentor> mr=(List<Mentor>)request.getAttribute("allmentors");
                for(Mentor m:mr)
                {
                %>
                <tr>
                  <td>
                    <%=m.getId()%>
                  </td>
                  <td>
                    <%=m.getName()%>
                  </td>
                  <td>
                    <%=m.getAge()%>
                  </td>
                  <td>
                    <%=m.getGender()%>
                  </td>
                  <td>
                    <%=m.getJobrole()%>
                  </td>
                  <td>
                    <%=m.getMobileno()%>
                  </td>                
                </tr>
                <% } %>
        </tbody>
    </table>
    </div>

</body>
</html>
