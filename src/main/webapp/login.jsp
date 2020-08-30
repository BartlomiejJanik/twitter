<%--
  Created by IntelliJ IDEA.
  User: yanek
  Date: 23.08.2020
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <jsp:include page="include/meta.jsp"/>
    <title>SDA Twitter - Log In</title>
    <meta name="description" content="strona logowania">
    <meta name="keyword" content="log in">
    <link href="css/login.css" rel="stylesheet">
</head>
<body>
<jsp:include page="include/header.jsp"/>

<main class="container pb-3 mb-3">
     <div class="row text-center">
        <div class="col-md-4 m-auto">
            <div id="login-form" class="container">
                <form class="form-signin" method="post" action="login">
                    <img class="mb-4" src="https://img.freepik.com/darmowe-ikony/twitter-kolkiem_318-10749.jpg?size=338&ext=jpg" alt="" width="72" height="72">
                    <jsp:include page="include/message.jsp"/>
                    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
                    <label for="inputLogin" class="sr-only">Login</label>
                    <input type="text" id="inputLogin" name="login" class="form-control" placeholder="Login" required
                           autofocus>
                    <label for="inputPassword" class="sr-only">Password</label>
                    <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
                    <div class="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                </form>
            </div>
        </div>
    </div>
</main>

<jsp:include page="include/footer.jsp"/>
<script src="js/bootstrap.js">

</script>
</body>
</html>

