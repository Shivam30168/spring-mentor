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
            margin-left: 450px;       
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
            color: green;
        }
        h1{
            text-align: center;
        }        
    </style>
</head>
<body>
    
    <jsp:include page="components/Navbar.jsp" />
    <h1>Request to become mentor/consultant</h1>
    <form action="addmentor" method="post" class="fm">
        <label for="name"><b>Name:</b></label>
        <input type="text"  name="name" required><br><br>
        
        <label for="mobileno"><b>Mobile No:</b></label>
        <input type="tel" name="mobileno" pattern="[0-9]{10}" required><br><br>
        
        <label for="age"><b>Age:</b></label>
        <input type="number" name="age"  required><br><br>
        
        <label for="gender"><b>Gender:</b></label>
        <input type="text" name="gender" min="1"><br><br>
        
        <label for="jobrole"><b>Job Role:</b></label>
        <input type="text"  name="jobrole" required><br><br>
        
        <input type="submit" value="Submit">
        <% if (request.getAttribute("message") != null) { 
            String message = (String) request.getAttribute("message");
            String messageClass = (String) request.getAttribute("messageClass");
        %>
            <div class="message " >
                <%= message %>
            </div>
        <% } %>
    </form>
    
</body>
</html>
