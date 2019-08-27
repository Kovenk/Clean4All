package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DBConnect;

/**
 * Servlet implementation class Login
 */
@WebServlet({"/register"})
public class register extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//récupère les infos du formulaire ($_POST en php)
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//si aucun des deux n'est vide
		if(username != null && password != null && email != null){


			try {
				//connexion à la BDD
				Connection con = DBConnect.connect();
				//je créé une requète préparée (avec paramètres '?') en attente d'exécution
				PreparedStatement stmt = con.prepareStatement(
						"INSERT INTO user (username, email, password)"
						+ "VALUES (?,?,?)"
				);
				//j'affecte à la place des '?' les bonnes valeurs
				stmt.setString(1, username);
				stmt.setString(2, email);
				stmt.setString(3, password);
				
				//j'exécute la requète et récupère les résultats dans un ResultSet
				stmt.executeUpdate();
				
				//je ferme la connexion à la BDD (a pu besoin)
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else {
			request.setAttribute("msg", "Veuillez enter tout les champs!");
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
		}
		
		response.sendRedirect("home");
		
	}

}
