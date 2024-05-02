<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Mentor Request</title>
    <jsp:include page="components/allcdn.jsp" />
</head>
<body>
    <h1>Request to become mentor/consultant</h1>
    <jsp:include page="components/Navbar.jsp" />

    <form action="addmentor" method="post">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="mobileno">Mobile No:</label><br>
        <input type="tel" id="mobileno" name="mobileno" pattern="[0-9]{10}" required><br><br>
        
        <label for="age">Age:</label><br>
        <input type="number" id="age" name="age" min="18" required><br><br>
        
        <label for="gender">Gender:</label><br>
        <input type="radio" id="male" name="gender" value="M" required>
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="F">
        <label for="female">Female</label><br><br>
        
        <label for="jobrole">Job Role:</label><br>
        <input type="text" id="jobrole" name="jobrole" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>