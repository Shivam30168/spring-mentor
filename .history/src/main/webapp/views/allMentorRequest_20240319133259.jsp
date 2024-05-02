<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>All Mentor Requests</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>All Mentor Requests</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Mobile No</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Job Role</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${mentorRequests}" var="mentorRequest">
                <tr>
                    <td>${mentorRequest.getMentorId()}</td>
                    <td>${mentorRequest.getName()}</td>
                    <td>${mentorRequest.mobileno}</td>
                    <td>${mentorRequest.age}</td>
                    <td>${mentorRequest.gender}</td>
                    <td>${mentorRequest.jobrole}</td>
                    <td>${mentorRequest.status}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
