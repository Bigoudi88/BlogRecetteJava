/**
 * 
 */
package fr.blog.pojos;

/**
 * @author Groupe
 *
 */
public class Ingredient {
	
	private int id;
	private int idRecette;
	private String nom;
	private int quantite;
	private String unit;
	
	/**
	 * 
	 */
	public Ingredient() {
		super();
	}

	/**
	 * @param id
	 * @param idRecette
	 * @param nom
	 * @param quantite
	 * @param unit
	 */
	public Ingredient(int id, int idRecette, String nom, int quantite, String unit) {
		super();
		this.id = id;
		this.idRecette = idRecette;
		this.nom = nom;
		this.quantite = quantite;
		this.unit = unit;
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
	 * @return the idRecette
	 */
	public int getIdRecette() {
		return idRecette;
	}

	/**
	 * @param idRecette the idRecette to set
	 */
	public void setIdRecette(int idRecette) {
		this.idRecette = idRecette;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", idRecette=" + idRecette + ", nom=" + nom + ", quantite=" + quantite
				+ ", unit=" + unit + "]";
	}
	
}
