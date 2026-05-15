<%@ page language="java" %>

<%
    String course = (String) session.getAttribute("course");
    String name = (String) session.getAttribute("name");
    String roll = (String) session.getAttribute("roll");
    Integer semester = (Integer) session.getAttribute("semester");
    String gender = (String) session.getAttribute("gender");
    String address = (String) session.getAttribute("address");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Submitted Data</title>

    <style>
        body{
            margin:0;
            font-family:Arial;
            min-height:100vh;
            display:flex;
            justify-content:center;
            align-items:center;
            background:linear-gradient(135deg,#1d2671,#c33764);
        }

        .box{
            width:450px;
            background:white;
            padding:30px;
            border-radius:20px;
            box-shadow:0 10px 25px rgba(0,0,0,0.3);
        }

        h2{
            text-align:center;
            color:green;
        }

        p{
            font-size:18px;
            border-bottom:1px solid #ddd;
            padding:10px;
        }

        a{
            display:block;
            text-align:center;
            text-decoration:none;
            background:blue;
            color:white;
            padding:12px;
            margin-top:20px;
            border-radius:10px;
        }
    </style>
</head>
<body>

<div class="box">
    <h2>Data Saved Successfully</h2>

    <p><b>Course:</b> <%= course %></p>
    <p><b>Name:</b> <%= name %></p>
    <p><b>Roll:</b> <%= roll %></p>
    <p><b>Semester:</b> <%= semester %></p>
    <p><b>Gender:</b> <%= gender %></p>
    <p><b>Address:</b> <%= address %></p>

    <a href="index.html">Back</a>
</div>

</body>
</html>
