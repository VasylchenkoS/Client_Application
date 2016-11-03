<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>${dish.name}</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link href="<c:url value='/static/css/main-style.css' />" rel="stylesheet"/>

</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
                <a href="${pageContext.request.contextPath}/" class="navbar-brand">Main Page</a>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-4">
            <span class="glyphicon glyphicon-globe logo slideanim"></span>
            <img src="/static/images/dish/${dish.name}.jpg"
                 onerror="if (this.src != '/static/images/dish/default.jpg') this.src = '/static/images/dish/default.jpg';"
                 alt="NO IMAGE">
        </div>
        <div class="col-sm-8">
            <h2>${dish.name}</h2><br>
            <h4><strong> ABOUT: </strong>
                <br>Weight: ${dish.weight}
                <br>Category: ${dish.category}
                <br>Price: ${dish.price}
            </h4>
            <p><strong>Ingredient's:</strong>
                <c:forEach items="${dish.ingredients}" var="ing">
                    <br> ${ing.ingredientName}
                </c:forEach>
            </p>
        </div>
    </div>
</div>

<!-- Placed at the end of the document so the pages load faster -->
<script src="//ajax.aspnetcdn.com/ajax/jQuery/jquery-2.1.1.min.js"></script>
<script src="//ajax.aspnetcdn.com/ajax/bootstrap/3.2.0/bootstrap.min.js"></script>
</body>
</html>
