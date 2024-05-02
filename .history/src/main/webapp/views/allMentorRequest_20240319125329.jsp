<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Mentor Request</title>
    <jsp:include page="components/allcdn.jsp" />
    <style>
        h1{
            text-align: center;
        }
    </style>
</head>
<body>
    <jsp:include page="components/Navbar.jsp" />
    <h1>All Mentor Request</h1>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">S.No.</th>
            <th scope="col">Mentor Id</th>
            <th scope="col">Name</th>
            <th scope="col">Mobile No.</th>
            <th scope="col">Age</th>
            <th scope="col">Gender</th>
            <th scope="col">Job Role</th>
          </tr>
        </thead>
        <tbody>
            <% int count = 1; %>
            <c:forEach var="mentorRequest" items="${mentorRequests}">
              <tr>
                <td><%= count++ %></td>
                <td>${mentorRequest.mentorId}</td>
                <td>${mentorRequest.name}</td>
                <td>${mentorRequest.mobileNo}</td>
                <td>${mentorRequest.age}</td>
                <td>${mentorRequest.gender}</td>
                <td>${mentorRequest.jobRole}</td>
              </tr>
            </c:forEach>
          
        </tbody>
      </table>
</body>
</html>