package test;

public class Serveur {
	private String numero;
	private String nom;
	private String ip;
	private int port;
	private Administrateur admin;
	
	//Constructor 
	public Serveur(String numero, String nom, String ip, int port, Administrateur admin) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.ip = ip;
		this.port = port;
		this.admin = admin;
	}

	
	//Getters and Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Administrateur getAdmin() {
		return admin;
	}

	public void setAdmin(Administrateur admin) {
		this.admin = admin;
	}
	
	
	
	
	
	
	
	

}
