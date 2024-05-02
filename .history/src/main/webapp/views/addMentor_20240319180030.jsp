<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Mentor Request</title>
    <jsp:include page="components/allcdn.jsp" />
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            background: linear-gradient(to right, #4e73df, #224abe);
        }

        .container {
            max-width: 600px; 
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .form-header {
            text-align: center;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            font-weight: bold;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        .form-group input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }

        .message {
            margin-top: 10px;
            padding: 10px;
            border-radius: 4px;
            width: fit-content;
            color: green;
            background-color: #e9f7ef;
            border: 1px solid #3ac569;
        }

        h1 {
            text-align: center;
        }
    </style>
</head>
<body>
    <jsp:include page="components/Navbar.jsp" />
    <div class="container">
        <h1 class="form-header">Request to Become a Mentor/Consultant</h1>
        <form action="addmentor" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" name="name" required>
            </div>
            <div class="form-group">
                <label for="mobileno">Mobile No:</label>
                <input type="tel" name="mobileno" pattern="[0-9]{10}" required>
            </div>
            <div class="form-group">
                <label for="age">Age:</label>
                <input type="number" name="age" required>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <input type="text" name="gender">
            </div>
            <div class="form-group">
                <label for="jobrole">Job Role:</label>
                <input type="text" name="jobrole" required>
            </div>
            <div class="form-group">
                <input type="submit" value="Submit">
            </div>
            <% if (request.getAttribute("message") != null) { 
                String message = (String) request.getAttribute("message");
                String messageClass = (String) request.getAttribute("messageClass");
            %>
                <div class="message">
                    <%= message %>
                </div>
            <% } %>
        </form>
    </div>
</body>
</html>
