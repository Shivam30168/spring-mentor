<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <!-- Include your CSS stylesheets here -->
</head>
<body>
    <h1>Welcome to Your Dashboard</h1>
    
    <h2>Mentor Section</h2>
    <p>If you are a mentor, you can see mentor-specific content here:</p>
    <ul>
        <li><a href="mentor_profile.jsp">View/Edit Profile</a></li>
        <li><a href="mentor_requests.jsp">View Mentor Requests</a></li>
        <li><a href="mentor_calendar.jsp">View Calendar</a></li>
        <!-- Add more mentor-specific links as needed -->
    </ul>
    
    <h2>Client Section</h2>
    <p>If you are a client, you can see client-specific content here:</p>
    <ul>
        <li><a href="client_profile.jsp">View/Edit Profile</a></li>
        <li><a href="client_requests.jsp">View Client Requests</a></li>
        <li><a href="client_calendar.jsp">View Calendar</a></li>
        <!-- Add more client-specific links as needed -->
    </ul>
    
    <!-- Include any other content or functionality common to both mentors and clients here -->
</body>
</html>
