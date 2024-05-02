<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Mentor Request</title>
    <jsp:include page="components/allcdn.jsp" />
    <style>
        .fm {
            width: 400px;    
            margin-left: 300px;       
            align-items: center;
            text-align: center;
            margin-top: 20px;
            padding: 20px;
            border: 2px solid black;
        }

        .message {
            margin-top: 10px;
            padding: 10px;
            border-radius: 4px;
            width: fit-content;
        }
       
        .success {
            background-color: #dff0d8;
            border: 1px solid #d6e9c6;
            color: #3c763d;
        }
        
        .error {
            background-color: #f2dede;
            border: 1px solid #ebccd1;
            color: #a94442;
        }
    </style>
</head>
<body>
    <h1>Request to become mentor/consultant</h1>
    <jsp:include page="components/Navbar.jsp" />

    <form action="addmentor" method="post" class="fm">
        <label for="name">Name:</label>
        <input type="text"  name="name" required><br><br>
        
        <label for="mobileno">Mobile No:</label>
        <input type="tel" name="mobileno" pattern="[0-9]{10}" required><br><br>
        
        <label for="age">Age:</label>
        <input type="number" name="age"  required><br><br>
        
        <label for="gender">Gender:</label>
        <input type="text" name="gender"><br><br>
        
        <label for="jobrole">Job Role:</label>
        <input type="text"  name="jobrole" required><br><br>
        
        <input type="submit" value="Submit">
        <% if (request.getAttribute("message") != null) { 
            String message = (String) request.getAttribute("message");
            String messageClass = (String) request.getAttribute("messageClass");
        %>
            <div class="message <%= messageClass %>">
                <%= message %>
            </div>
        <% } %>
    </form>
    <!-- <% if (request.getAttribute("message") != null) { 
        String message = (String) request.getAttribute("message");
        String messageClass = (String) request.getAttribute("messageClass");
    %>
        <div class="message <%= messageClass %>">
            <%= message %>
        </div>
    <% } %> -->
</body>
</html>
