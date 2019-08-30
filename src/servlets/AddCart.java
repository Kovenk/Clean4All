package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Cart;

/**
 * Servlet implementation class AddCart
 */
@WebServlet("/addCart")
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int idProduit = Integer.parseInt(request.getParameter("idProduit"));
		int qttProduit = Integer.parseInt(request.getParameter("qttProduit"));
		
		Cart cart = null;
		
		if(request.getSession().getAttribute("cart") != null) {
			
			cart = (Cart) request.getSession().getAttribute("cart");
		}
		else {
			cart = new Cart();
		}
		
		cart.addCart(idProduit, qttProduit);
		
		request.getSession().setAttribute("cart", cart);
		
		response.sendRedirect("produit");
		
	}

}
