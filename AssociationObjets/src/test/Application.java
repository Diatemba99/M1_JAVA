package test;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Administrateur> listeadmin = new ArrayList<Administrateur>();
		ArrayList<Serveur> listeserv= new ArrayList<Serveur>();
		
		int choix=0;
		String numero,ip,nomserv,nom,prenom;
		int matr,port;
		Administrateur adm=null;
		do {
			System.out.println("1-Ajouter un administrateur");
			System.out.println("2-Lister les admins");
			System.out.println("3-Ajouter un serveur");
			System.out.println("4-Lister les serveurs");
			System.out.println("5-Lister serveurs et admin");
			System.out.println("6-Quitter ?");
			choix=sc.nextInt();
			switch(choix)
			{
				case 1:
					System.out.println("Saisir matricule ");
					matr=sc.nextInt();
					
					System.out.println("Saisir le nom: ");
					nom=sc.nextLine();
					
					System.out.println("Saisir le prenom : ");
					prenom=sc.nextLine();
					
					Administrateur admin =  new Administrateur(matr, nom, prenom);
					listeadmin.add(admin);
					break;
					
				case 2:
					for (Administrateur x : listeadmin) 
					{
						System.out.println("____________________________");
						System.out.println("Matricule :" +x.getMatr());
						System.out.println("Nom :" +x.getNom());
						System.out.println("Prenom :" +x.getPrenom());
					}
					
					System.out.println("_______________________________");
					break;
					
				case 3:
					System.out.println("Ce serveur est-il géré ? [O/N]");
					String reponse = sc.nextLine();
					reponse=reponse.toUpperCase();
					if(reponse.equals("N"))
					{
						adm=null;
					}else {
						System.out.println("Numéro de l'administrateur ?");
						int num = sc.nextInt();
						sc.nextLine();
						adm=null;
						for (Administrateur y: listeadmin)
						{
							if(y.getMatr()==num)
							{
								adm = y;
								break;
							}
						}
						if(adm==null)
						{
							System.out.println("Numéro de l'administrateur inexistant ");
						}else {
							System.out.println("Numéro du serveur ?");
							numero=sc.nextLine();
							
							System.out.println("IP du serveur ?");
							ip=sc.nextLine();
							
							System.out.println("Nom du serveur ?");
							nomserv=sc.nextLine();
							
							System.out.println("Port du serveur ?");
							port=sc.nextInt();
							
							Serveur sv = new Serveur(numero, nomserv, ip, port, adm);
							listeserv.add(sv);
							
						}
					}
					
					break;
				case 4:
					for (Serveur t : listeserv)
					{
						System.out.println("______________________");
						System.out.println("Numéro du serveur"+ t.getNumero());
						System.out.println("IP serveur"+ t.getIp());
						System.out.println("Nom du serveur" +t.getNom());
						System.out.println("Port du serveur"+ t.getPort());
						
					}
						
					break;
				case 5:
					for (Serveur t : listeserv)
					{
						System.out.println("______________________");
						System.out.println("Numéro du serveur"+ t.getNumero());
						System.out.println("IP serveur"+ t.getIp());
						System.out.println("Nom du serveur" +t.getNom());
						System.out.println("Port du serveur"+ t.getPort());
						if(t.getAdmin()==null)
							System.out.println("Administrateur inexistant !");
						else {
							System.out.println("Matricule, Admin"+t.getAdmin().getMatr());
							System.out.println("Nom Admin"+t.getAdmin().getNom());
							System.out.println("Prenom Admin"+t.getAdmin().getPrenom());
						}
					}
					break;
					
					
				case 6:
					break;
				default:
					System.out.println("Choix indosponible !!");
					break;
			
			}
			
		}while(choix!=6);
		System.out.println("Fin du programme");

	}

}
