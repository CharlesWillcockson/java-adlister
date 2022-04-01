import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "pizzaOrderServlet", value = "/pizzaorder")
public class pizzaOrderServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String crust = request.getParameter("crust");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");

        request.setAttribute("crust", crust);
        request.setAttribute("sauce", sauce);
        request.setAttribute("size", size);
        request.setAttribute("toppings", Arrays.toString(toppings));
        request.setAttribute("address", address);
        request.getRequestDispatcher("/pizzaorder.jsp").forward(request, response);
    }
}
