package test;

public class Administrateur {
	private int matr;
	private String nom;
	private String prenom;
	
	//Constructor
	public Administrateur(int matr, String nom, String prenom) {
		super();
		this.matr = matr;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	
	//Getters and Setters
	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	

}
