<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to School</title>
</head>
<body>
     <h2>Student Registration page</h2>
     <form action = "saveStudent" method="post">
     <label>Student Name</label>
     <input type= "text" name="name">
     <label>class</label>
     <input type= "text" name="standard">
     <label>Joining Year</label>
     <input type= "text" name="year">
     <label>Mobile</label>
     <input type= "text" name="mobile">
      <input type= "submit" value="submit">
     </form>
     
     <br></br>
     
     <form action="deleteStudent" method ="post">
       <label>Enter student id</label>
       <input type="text" name ="id">
       <input type="submit" value="delete">
       </form>
       
       <form action="searchStudent" method ="post">
       <label>Enter student id</label>
       <input type="text" name ="id">
       <input type="submit" value="search">
       </form>
     
     
     ${message}
     ${delete}
     ${search}
     
</body>
</html>