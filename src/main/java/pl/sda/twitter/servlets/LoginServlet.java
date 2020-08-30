package pl.sda.twitter.servlets;

import pl.sda.twitter.persistance.entities.TbUser;
import pl.sda.twitter.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private UserService userService;
    private final static String CURRENT_PAGE = "currentPage";

    @Override
    public void init() {
        userService = new UserService();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        TbUser tbUser = userService.getUser(login, password);
        HttpSession session = req.getSession();
        if (tbUser == null) {
            session.setAttribute("message", "Niepoprawne dane logowania, spróbuj ponownie.");
            resp.sendRedirect("login.jsp");
        } else {
            session.setAttribute("user", tbUser);

            final String currentPage = (String) session.getAttribute(CURRENT_PAGE);
            if (currentPage != null) {
                session.removeAttribute(CURRENT_PAGE);
                resp.sendRedirect(currentPage);
            }else {
                resp.sendRedirect("index.jsp");
            }
        }
    }
}
