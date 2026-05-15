<%@ page language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>

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

        .card{
            width:450px;
            padding:30px;
            border-radius:20px;
            background:white;
            box-shadow:0 10px 25px rgba(0,0,0,0.3);
        }

        h2{
            text-align:center;
            color:#333;
        }

        p{
            font-size:18px;
            padding:8px;
            border-bottom:1px solid #ddd;
        }

        .btn{
            display:block;
            text-align:center;
            text-decoration:none;
            background:#0072ff;
            color:white;
            padding:12px;
            border-radius:10px;
            margin-top:20px;
        }
    </style>
</head>
<body>

<div class="card">
    <h2>Submitted Data</h2>

    <p><b>Course:</b> <%= request.getAttribute("course") %></p>
    <p><b>Name:</b> <%= request.getAttribute("name") %></p>
    <p><b>Roll Number:</b> <%= request.getAttribute("roll") %></p>
    <p><b>Semester:</b> <%= request.getAttribute("semester") %></p>
    <p><b>Gender:</b> <%= request.getAttribute("gender") %></p>
    <p><b>Address:</b> <%= request.getAttribute("address") %></p>

    <a href="index.html" class="btn">Back to Form</a>
</div>

</body>
</html>
