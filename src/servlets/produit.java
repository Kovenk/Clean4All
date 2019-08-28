package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Produit;
import database.DBConnect;

/**
 * Servlet implementation class Login
 */
@WebServlet({"/produit"})
public class produit extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		Produit produit = null;

		try {

			Connection con = DBConnect.connect();

			PreparedStatement stmt = con.prepareStatement(
					"SELECT nomProduit, prixProduit, imgProduit, descProduit "
					+ "FROM produit "
					+ "WHERE id = 1 "
			);

			ResultSet rs = stmt.executeQuery();
			
				
			if(rs.next()) {
				
				produit = new Produit(rs.getString("nomProduit"), rs.getInt("prixProduit"), rs.getString("imgProduit"),rs.getString("descProduit"));
				request.setAttribute("produit", produit);
			}
			
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/produit.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		
		
	}

}