package com.blogrecette.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blogrecette.pojos.Membre;


/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String titre = "Inscription";
		
		request.setAttribute("titre", titre);

		// récupère la session
		HttpSession session = request.getSession();
		
		String erreurs = "";
		
		String nom = request.getParameter("nom");
		if (nom.isEmpty()) { 
			erreurs += "Merci de remplir le nom <br>";
		}
		
		String pseudo = request.getParameter("pseudo");
		if (pseudo.isEmpty()) { 
			erreurs += "Merci de remplir le pseudo <br>";
		}
		String email = request.getParameter("email");
		if (email.isEmpty()) { 
			erreurs += "Merci de remplir l'email <br>";
		}
		
		String mdp = request.getParameter("mdp");
		if (mdp.isEmpty()) { 
			erreurs += "Merci de choisir un mot de passe <br>";
		}
		
		request.setAttribute("erreurs", erreurs);
		
		Membre membre = new Membre (nom,pseudo,email,mdp,null);
		
		// pas d'erreurs
		if (erreurs.isEmpty() ) {
			// on crée un member
			
		
			// doit aller en BDD
			// on met l'objet membre dans la session 
			session.setAttribute("membre", membre);
			
			// on redige
			response.sendRedirect("index");
		}
		else {
			
			request.setAttribute("membre", membre);
			// on forward car il y a une erreur
			this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
		}
		
	}
}
