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
 * Servlet implementation class Panier
 */
@WebServlet("/Panier")
public class Panier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Panier() {
    
    	
        super();
        // TODO Auto-generated constructor stub
    }
    
    public Produit ProduitbyID(int idProduit, HttpServletRequest request, HttpServletResponse response) {
    	
	Produit produit = null;

	
	try {

		Connection con = DBConnect.connect();

		PreparedStatement stmt = con.prepareStatement(
				"SELECT id, nomProduit, prixProduit, imgProduit, descProduit "
				+ "FROM produit "
				+ "WHERE id = ? "
		);
		stmt.setInt(1, idProduit);
		
		
		
		ResultSet rs = stmt.executeQuery();
		
			
		if(rs.next()) {
			
			produit = new Produit(
					rs.getInt("id"),
					rs.getString("nomProduit"), 
					rs.getInt("prixProduit"), 
					rs.getString("imgProduit"),
					rs.getString("descProduit")
			);
			

			
			request.setAttribute("produit", produit);
		}
		
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return produit;
	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/panier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
