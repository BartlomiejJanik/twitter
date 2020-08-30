<%@ page import="java.util.List" %>
<%@ page import="pl.sda.twitter.persistance.entiities.TbArticle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="articleService" scope="request" class="pl.sda.twitter.services.ArticleService"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <jsp:include page="include/meta.jsp"/>
    <title>SDA Twitter lista artykułów</title>
    <meta name="description" content="lista artykułów">
    <meta name="keyword" content="lista, artykuł">
</head>
<body>
<jsp:include page="include/header.jsp"/>

<main role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">Hello, world!</h1>
            <p>This is a template for a simple marketing or informational website. It includes a large callout called a
                jumbotron and three supporting pieces of content. Use it as a starting point to create something more
                unique.</p>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p>
        </div>
    </div>
    <%
        List<TbArticle> articles = articleService.getArticles();
        pageContext.setAttribute("articles", articles);
    %>


    <c:forEach items="${articles}" var="article">
        <div class="container">
            <div class="row">
                <div>
                    <h2>Heading</h2>
                    <p>${article.getContent()} </p>
                    <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
                </div>
            </div>
        </div>
    </c:forEach>

</main>
<jsp:include page="include/footer.jsp"/>
</body>
</html>

