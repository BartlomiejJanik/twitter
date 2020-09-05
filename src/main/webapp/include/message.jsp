<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--message--%>
<c:choose>
    <c:when test="${sessionScope.message != null}">
        <div class="text-center fixed-top mx-auto mt-5 w-25 alert alert-danger alert-dismissible fade show">
            <strong>${sessionScope.message}</strong>
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <% session.removeAttribute("message"); %>

    </c:when>
</c:choose>
<%--message--%>
