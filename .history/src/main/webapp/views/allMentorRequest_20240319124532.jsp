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
          <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>Jacob</td>
            <td>Thornton</td>
            <td>@fat</td>
          </tr>
          <tr>
            <th scope="row">3</th>
            <td colspan="2">Larry the Bird</td>
            <td>@twitter</td>
          </tr>
        </tbody>
      </table>
</body>
</html>