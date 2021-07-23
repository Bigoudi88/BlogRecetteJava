/**
 * 
 */
package fr.blog.pojos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author Nicolas
 *
 */
public class Recette {
	
	private int id;
	private Membre membre;
	private String titre;
	private String description;
	private String photo;
	private Date dateCreation;
	List<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	/**
	 * 
	 */
	public Recette() {
		super();
	}

	/**
	 * @param membre
	 * @param titre
	 * @param description
	 * @param photo
	 * @param dateCreation
	 */
	public Recette(Membre membre, String titre, String description, String photo, Date dateCreation) {
		super();
		this.membre = membre;
		this.titre = titre;
		this.description = description;
		this.photo = photo;
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the membre
	 */
	public Membre getMembre() {
		return membre;
	}

	/**
	 * @param membre the membre to set
	 */
	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}	

	/**
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Recette [id=" + id + ", membre=" + membre + ", titre=" + titre + ", description=" + description
				+ ", photo=" + photo + ", dateCreation=" + dateCreation + ", ingredients=" + ingredients + "]";
	}
	
}
