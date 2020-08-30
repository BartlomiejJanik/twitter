package pl.sda.twitter.filters;


import pl.sda.twitter.persistance.entities.TbUser;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter({"/add-article.jsp","/add-article"})
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        final HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        final HttpSession session = httpServletRequest.getSession();
        final TbUser user = (TbUser) session.getAttribute("user");
        if (user == null){
            final String servletPath = httpServletRequest.getServletPath().replace("/", "");
            session.setAttribute("currentPage",servletPath);
            final RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request,response);
        }
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
