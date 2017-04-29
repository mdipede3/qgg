
<%@page import="com.Models.Renders.HTMLPresenter"%>
<%
   
    HTMLPresenter presenter = new HTMLPresenter(request,response,"user");
    
 %>
 
<%@page import="com.domain.AccessSystemApplication.User.iRegisterUser"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ page contentType="text/html; charset=UTF-8" %>
        <meta name='viewport' content='width=device-width, initial-scale=1.0'>
        <link href="./CSS/style.min.css" rel="stylesheet" />
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>Profile</title>
    </head>
    <body>
       <header class="profile-header-conatainer">
           <a href="logout">LogOut</a>
       </header>
        <main class="profile-container">
            <section class="profile-wrapper">
                <p> Hello</p>
                <table>
                    <tr>
                    <td>UserName</td><td><%=presenter.presentName()%></td>
                    </tr>
                    <tr>
                        <td>Password</td><td><%=presenter.presentPassword()%></td>
                    </tr>
                    <tr>
                        <td>Email</td><td><%=presenter.presentEmail()%></td>
                    </tr>
                </table>
            </section>
             
        </main>
    </body>
</html>
