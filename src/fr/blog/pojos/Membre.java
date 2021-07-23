/**
 * 
 */
package fr.blog.pojos;

import java.util.Date;

/**
 * @author Nicolas
 *
 */
public class Membre {
	
	private int id;
	private String nom;
	private String pseudo;
	private String mdp;
	private String email;
	private Date dateInscription;
	
	/**
	 * 
	 */
	public Membre() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 * @param pseudo
	 * @param mdp
	 * @param email
	 * @param dateInscription
	 */
	public Membre(String nom, String pseudo, String mdp, String email, Date dateInscription) {
		super();
		this.nom = nom;
		this.pseudo = pseudo;
		this.mdp = mdp;
		this.email = email;
		this.dateInscription = dateInscription;
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
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}

	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dateInscription
	 */
	public Date getDateInscription() {
		return dateInscription;
	}

	/**
	 * @param dateInscription the dateInscription to set
	 */
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Membre [id=" + id + ", nom=" + nom + ", pseudo=" + pseudo + ", mdp=" + mdp + ", email=" + email
				+ ", dateInscription=" + dateInscription + "]";
	}
	
}
