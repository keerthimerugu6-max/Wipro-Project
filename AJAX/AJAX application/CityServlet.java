import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
    private static final Map<String, List<String>> stateCities = new HashMap<>();
    static {
        stateCities.put("AP", Arrays.asList("Vijayawada", "Guntur", "Vizag"));
        stateCities.put("KA", Arrays.asList("Bangalore", "Mysore", "Mangalore"));
        stateCities.put("MH", Arrays.asList("Mumbai", "Pune", "Nagpur"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String state = request.getParameter("state");
        List<String> cities = stateCities.getOrDefault(state, Collections.emptyList());

        PrintWriter out = response.getWriter();
        out.println("<table border='1'><tr><th>City</th></tr>");
        for (String city : cities) {
            out.println("<tr><td>" + city + "</td></tr>");
        }
        out.println("</table>");
    }
}
