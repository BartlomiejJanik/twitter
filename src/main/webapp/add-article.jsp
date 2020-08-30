<%@ page import="java.util.List" %>
<%@ page import="pl.sda.twitter.persistance.entities.TbArticle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="articleService" scope="request" class="pl.sda.twitter.services.ArticleService"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <jsp:include page="include/meta.jsp"/>
    <title>SDA Twitter dodaj artykuł</title>
    <meta name="description" content="dodawanie artykułów">
    <meta name="keyword" content="dodanie, artykuł, sda, twitter">
</head>
<body>
<jsp:include page="include/header.jsp"/>
<main class="container">
    <div class="row text-center">
        <div class="col-md-8 pt-4 m-auto text-left">
            <h4 class="mb-3">Dodaj nowy wpis</h4>
            <form name="addArticle" class="needs-validation" action="add-article" method="post">
                <div class="mb-3">
                    <div class="form-group">
                        <label for="textArea">Wprowadź tekst</label>
                        <textarea class="form-control" name="content" id="textArea" rows="3"></textarea>
                    </div>
                    <hr class="mb-4"/>
                    <button class="btn btn-primary btn-lg btn-block" type="submit">Dodaj artykuł</button>
                </div>
            </form>
        </div>
    </div>
</main>
<jsp:include page="include/footer.jsp"/>
</body>
</html>