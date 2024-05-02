<%@ page import="com.example.mentor.Models.Mentor" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Results</title>
    <!-- Include your CSS and JavaScript files -->
</head>
<body>
    <h1>Search Results</h1>
    <div class="container">
        <table class="table table-striped table-hover">
            <!-- Table header -->
            <!-- Iterate over searchResults -->
            <% List<Mentor> searchResults = (List<Mentor>) request.getAttribute("searchResults");
               for (Mentor m : searchResults) { %>
            <tr>
                <!-- Table rows for search results -->
            </tr>
            <% } %>
        </table>
    </div>
</body>
</html>
