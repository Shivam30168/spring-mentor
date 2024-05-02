<%@ page import="com.example.mentor.Models.MentorRequest" %>
<%@ page import="java.util.List" %>

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
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <% List<MentorRequest> mentorRequests=(List<MentorRequest>)request.getAttribute("allmentorrequests");
                for(MentorRequest m:mentorRequests)
                {
                %>
                <tr>
                  <td>
                    <%=m.getMentorid()%>
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
                    <%=m.getStatus()%>
                  </td>
                  
                  <td>
                    <a href="/approverequest?mentorid=<%=m.getMentorId()%>">
                      <button class="btn btn-success">Approve!</button></a>
                    <a href="/rejectrequest?mentorid=<%=m.getMentorId()%>">
                      <button class="btn btn-warning">Reject!</button></a>
                  </td>
                </tr>
                <% } %>
        </tbody>
    </table>
</body>
</html>
