package fr.blog.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import fr.blog.pojos.Ingredient;
import fr.blog.pojos.Membre;
import fr.blog.pojos.Recette;



public class RecetteService {
	
	Hashtable<Integer, Recette> recettesDict = new Hashtable<Integer, Recette>();
	
	public RecetteService() {
		// Création du membre qui a créer les recettes
		Membre membre = new Membre("Chevalier", "nicolas", "nicolas.chevalier@epsi.fr", "12345", new Date("2019/11/13"));
		membre.setId(1);
		
		// Création de la recette tartiflette
		Recette tartiflette = new Recette(membre, 
				"Tartiflette", 
				"La tartiflette savoyarde est un gratin de pommes de terre avec du Reblochon fondu dessus",
				"tartiflette.jpg", 
				new Date("2019/11/13"));
		tartiflette.setId(1);
		
		// Ajoute les ingrédients à la recette
		tartiflette.setIngredients(new ArrayList<Ingredient>() { 
            { 
                add(new Ingredient(1, tartiflette.getId(), "Pommes de  terre", 750, "g")); 
                add(new Ingredient(2, tartiflette.getId(), "Reblochon", 1, "u")); 
                add(new Ingredient(3, tartiflette.getId(), "Lardons", 200, "g")); 
                add(new Ingredient(4, tartiflette.getId(), "Crème fraîche épaisse", 3, "cs")); 
                add(new Ingredient(5, tartiflette.getId(), "Oignons", 2, "u")); 
                add(new Ingredient(6, tartiflette.getId(), "Beurre", 20, "g")); 
                add(new Ingredient(7, tartiflette.getId(), "Sel", 1, "cc")); 
                add(new Ingredient(8, tartiflette.getId(), "Poivre", 1, "p")); 
            } 
        });
		
		// Ajoute la recette au dictionnaire
		recettesDict.put(1, tartiflette);
		
		// Création de la recette velouter de carotte
		Recette velouterCarotte = new Recette(membre, 
				"Velouté de carottes au cumin", 
				"Un velouté de carotte au cumin", 
				"veloute-de-carotte-au-cumin.jpg",
				new Date("2019/11/13"));
		velouterCarotte.setId(2);

		// Ajoute les ingrédients à la recette
        velouterCarotte.setIngredients(new ArrayList<Ingredient>() { 
            { 
                add(new Ingredient(9, velouterCarotte.getId(), "Carottes", 800, "g")); 
                add(new Ingredient(10, velouterCarotte.getId(), "Oignon", 1, "u")); 
                add(new Ingredient(11, velouterCarotte.getId(), "Bouillon de volaille", 1, "l")); 
                add(new Ingredient(12, velouterCarotte.getId(), "Cumin", 1, "cs")); 
                add(new Ingredient(13, velouterCarotte.getId(), "Crème fraîche épaisse", 2, "cs")); 
                add(new Ingredient(14, velouterCarotte.getId(), "Huile d’olive", 2, "cs")); 
                add(new Ingredient(15, velouterCarotte.getId(), "Sel", 1, "cc")); 
                add(new Ingredient(16, velouterCarotte.getId(), "Poivre", 1, "p")); 
            } 
        });

		// Ajoute la recette au dictionnaire
		recettesDict.put(2, velouterCarotte);
	}
	
	// Récupère la liste des recettes
	public List<Recette> getRecettes() {
		
		List<Recette> recettes = new ArrayList<Recette>();
		
		for(Map.Entry<Integer, Recette> pair : recettesDict.entrySet()) {
			recettes.add(pair.getValue());
		}
		
		return recettes;
	}
	
	// Récupère une recette à partir de son id
	public Recette getRecetteFromId(int id) {
		
		return recettesDict.get(id);
		
	}

}
