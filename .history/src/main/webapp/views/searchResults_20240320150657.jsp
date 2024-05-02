<%@ page import="com.example.mentor.Models.Mentor" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Results</title>
    <!-- Include your CSS and JavaScript files -->
</head>
<body>
    <h1>Search Results</h1>
    <div class="container">
        <table class="table table-striped table-hover">
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
            <% List<Mentor> searchResults = (List<Mentor>) request.getAttribute("searchResults");
               for (Mentor m : searchResults) { %>
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
                      <button class="btn btn-danger">Delete</button></a>              
                
            </tr>
            <% } %>
        </table>
    </div>
</body>
</html>
