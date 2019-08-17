<%-- 
    Document   : NettechWeb.jsp
    Created on : 02 Jul 2019, 10:26:44 AM
    Author     : Nicole
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Add Client Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <h1> Add Client</h1>
    <p>
        Please enter the details of the client below
    </p>
    <form action ="AddPerson.do" method="POST">
        <table>
            
        <tr> 
        <td> Customer Number: </td>
        <td><input type="text" name="id"/></td>
        </tr>
        
        <tr>
        <td> Name: </td>
        <td><input type="text" name="name"/></td>
        </tr>
        
        
        <tr>
        <td> Website: </td>
        <td><input type="text" name="software"/></td>
             </tr>
          </table>
        </form>
    </body>
</html>