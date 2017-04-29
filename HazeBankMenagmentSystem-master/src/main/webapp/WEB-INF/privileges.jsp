<%@page import="java.util.List"%>
<%@page import="com.domain.AccessSystemApplication.User.iRegisterUser"%>
<%@page import="com.Models.UserRepository"%>
<%
    UserRepository userRepository = new UserRepository();
    List<iRegisterUser> userList  = userRepository.getUserRepository().getUserList();
%>
<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>Privileges</title>
    </head>
    <body>
        <table>
         <%
    for (iRegisterUser user : userList ) {
        %>
        <TR>
        <TD><%= user.getName() %></TD>
        <%
    if (user.getTypeUser().equals("Premium") ) {
        %>
        <td>Posiada status Premium</td>
        <%
    } else {
        %>
        <td><%= user.getTypeUser() %></td>
        <%
    }
%>
        </TR>
        <%
    }
%>
        </table>
        <section>
            <form auction="changePrivileges" method="post">
            <p>Zmien uprawnienia</p>
            <select name="userid">
                <%
        for (iRegisterUser user: userList ) {
        %>
        <option value=<%=user.getId() %> > <%=user.getName()%></option>
        <%
    }
%>
            </select>
            <button value="add"name="change" type="submit">Dodaj uprawnienia</button>
            <button  value="remove" name="change" type="submit">Usun uprawnienia</button>
            </form>
        </section>
    
    </body>
</html>
