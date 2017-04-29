<%-- 
    Document   : register
    Created on : 2017-04-07, 13:09:40
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>Register</title>
    </head>
    <body>
        <header>
        </header>
        <main>
            <section>
                <form method="post" action="register">
                    <label>Login </label>
                    <input type="text" name="username"/>
                    <label> Haslo</label>
                    <input type="text" name="password"/>
                    <label>Potwierdz haslo</label>
                    <input type="text" name="confirmPassword"/>
                    <label>Email<label>
                    <input type="email" name="email"/>
                    <button type="submit">
                        Zarejestruj sie
                    </button>
                </form>
            </section>
        </main>
        <footer>
            
        </footer>
    </body>
</html>
