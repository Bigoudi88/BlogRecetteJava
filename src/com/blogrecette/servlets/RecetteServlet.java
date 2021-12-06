package com.blogrecette.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blogrecette.pojos.Recette;
import com.blogrecette.services.RecetteService;

/**
 * Servlet implementation class RecetteServlet
 */
@WebServlet("/recette")
public class RecetteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecetteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getParameter("id");
		
		RecetteService recetteService = new RecetteService();
		
		
		Recette recette = recetteService.getRecetteFromId(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("recette", recette);

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/recette.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
