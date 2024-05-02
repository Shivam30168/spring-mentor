<%@ page import="com.example.mentor.Models.Mentor" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>   
<head>
    <title>All Mentor Requests</title>
    <jsp:include page="components/allcdn.jsp" />
    <style>
      .container{
        margin-top: 10px;
      }
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
    <form id="searchForm">
      <label for="name">Search By Name</label>
      <input type="search" id="searchInput" name="name">
      <button type="submit">Search</button>
  </form>
    <div class="container">
        <table id="mentorTable" class="table table-striped table-hover">
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
                      <button class="btn btn-danger">Delete</button></a>              
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
  <script>
    // Get reference to the search form and table
    const searchForm = document.getElementById('searchForm');
    const mentorTableBody = document.querySelector('#mentorTable tbody');

    // Add an event listener to the search form
    searchForm.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent default form submission

        // Get the search query
        const searchName = document.getElementById('searchInput').value;

        // Perform AJAX request to fetch search results
        fetch(`/searchMentor?name=${searchName}`)
            .then(response => response.json())
            .then(data => {
                // Clear previous search results
                mentorTableBody.innerHTML = '';

                // Populate table with search results
                data.forEach(mentor => {
                    const row = document.createElement('tr');
                    row.innerHTML = `
                        <td>${mentor.id}</td>
                        <td>${mentor.name}</td>
                        <td>${mentor.age}</td>
                        <td>${mentor.gender}</td>
                        <td>${mentor.jobrole}</td>
                        <td>${mentor.mobileno}</td>
                        <td>
                            <a href="/deletementor?id=${mentor.id}">
                                <button class="btn btn-danger">Delete</button>
                            </a>
                        </td>
                    `;
                    mentorTableBody.appendChild(row);
                });
            })
            .catch(error => console.error('Error fetching search results:', error));
    });
</script>
</body>
</html>
