<%@ page import="com.example.mentor.Models.Mentor" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>   
<head>
    <title>All Mentor Requests</title>
    <jsp:include page="components/allcdn.jsp" />
    <style>
      body{
        background: linear-gradient(45deg, #b7eaff, #e1f5fe);;
      }
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
    <form action="searchMentor" method="GET">
      <label for="name">Search By Name</label>
      <input type="search" name="name">
      <button type="submit">Search</button>
  </form>
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
          <% 
          List<Mentor> allMentors = (List<Mentor>) request.getAttribute("allMentors");
          for (Mentor mentor : allMentors) { 
          %>
          <tr>
              <td><%= mentor.getId() %></td>
              <td><%= mentor.getName() %></td>
              <td><%= mentor.getAge() %></td>
              <td><%= mentor.getGender() %></td>
              <td><%= mentor.getJobrole() %></td>
              <td><%= mentor.getMobileno() %></td>
              <td>
                  <a href="/deletementor?id=<%= mentor.getId() %>">
                      <button class="btn btn-danger">Delete</button>
                  </a>
              </td>
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
