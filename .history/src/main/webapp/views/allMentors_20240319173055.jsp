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
        .message {
            margin-top: 10px;
            padding: 10px;
            border-radius: 4px;
            width: fit-content;
            color: green;
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
                <th>Action</th>
                
            </tr>
        </thead>
        <tbody>
            <% List<Mentor> mr=(List<Mentor>)request.getAttribute("allmentor");
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
                  <td>
                    <a href="/deletementor?id=<%=m.getId()%>">
                      <button class="btn btn-warning">Delete</button></a>              
                </tr>
                <% } %>
        </tbody>
    </table>
    </div>
    <% if (request.getAttribute("deletemessage") != null) { 
      String message = (String) request.getAttribute("deletemessage");
  %>
      <div class="message " >
          <%= message %>
      </div>
  <% } %>
</body>
</html>
