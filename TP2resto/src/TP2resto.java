import java.util.Scanner;
import java.util.ArrayList;

public class TP2resto {
	static final String[][] menu = {
		    {"Entrée : ", "Salade", "Soupe", "Quiche", "Aucune"},
		    {"Plats : ", "Poulet", "Boeuf", "Poisson", "Végétarien", "Vegan", "Aucun"},
		    {"Accompagnement :", "Riz", "Pâtes", "Frites", "Légumes", "Aucun"},
		    {"Boissons : ", "Eau plate", "Eau gazeuse", "Soda", "Vin", "Aucune"},
		    {"Desserts : ", "Tarte maison", "Mousse au chocolat", "Tiramisu", "Aucune"}
		};
	
	public static int getChoice(String table[], Scanner scan) {
//		table[0] rappelle chaque index de chaque tableau
		System.out.println("Que souhaitez-vous comme " + table[]);
		for(int i=0; i < table.length; i++) {
			System.out.print("[" + i + "-" + table[i] + "]");
		}
		int choice = scan.nextInt();
		return choice;
		}
	
	public static void main(String[] args) {
		
//		créer un tableau
		String[][] yourOrders = {};
				
		// 1 - Afficher un texte " Bonjour, combien de menus souhaitez-vous ? "
		System.out.println("Bonjour, combien de menus souhaitez-vous ?");

//			créer le scanner
		Scanner scan = new Scanner(System.in);

		// 2 - Lecture, vérification et enregistrement de la réponse
		int orderNumber = scan.nextInt();
		
//		création de variables pour récupérer le choix de l'UI 
		int choice = getChoice(menu[0], scan);
		String menuItem = menu[0][choice];	
//			3 répéter un ensemble d'action: menu par commande
		for(int i = 1; i < orderNumber + 1; i++) {
// 		3.1 - Afficher le numéro de la commande		
			System.out.println("\n Commande numéro : " + (i));
			
			
//	 	3.2 - Gestion du sous-menu de l'entrée 
			
			// 3.2.1 - Affichage des choix


			System.out.println("Vous avez séléctionné" + choice);

			// 3.2.2 - Selection et stockage du choix	

			
//			récupérer les commandes:

			
			// 3.3 - Gestion du sous-menu des plats 
			
			// 3.3.1 - Affichage des choix
		
		
			// 3.3.2 - Selection et stockage du choix
		
	
		// 3.4 
	
		// 3.5
	
		// 3.6
	
		// 3.7 - Afficher le résumé de la commande

			// 4 - Programme fini.
			System.out.println("Merci pour vos commandes, et à bientôt !");
		}

			
			

	
//		5 écrire le "choix entrée :"
//		proposer le choix "Entrée :" avec les possibilités([1 - Salade][2 - Soupe][3 - Quiche][4 - Aucune]
//		en écrivant: "Que souhaitez-vous comme entrée ? [Saisir le chiffre correspondant]"
//		System.out.println("choix entrée :\n[1 - Salade][2 - Soupe][3 - Quiche][4 - Aucune]\n"
//				+ "Que souhaitez-vous comme entrée ? [Saisir le chiffre correspondant]");
//		création de la variable temp
		int choiceMealStarter = scan.nextInt();
//		switch(choiceMealStarter) {
//		case 1 : 
//			entrance[i] = "Salade";
//				break;
//		case 2 : 
//			entrance[i] = "Salade";
//				break;
//		case 3 : 
//			entrance[i] = "Salade";
//				break;
//		case 4 : 
//			entrance[i] = "Salade";
//				break;
//		default :
//				entrance[i] = "Saisir un chiffre en 1 et 4";
//		}
		
//		le integer entré devient string
//		String tempStr = Integer.toString(choiceMealStarter);
//		méthode pour aller chercher  le plat et l'insérer dans le tableau menus
//				: utiliser string contains et ressortir l'index 1 pour l'ajouter au tableau menu
//		: index de la valeur de temp - 1
//				pour mealStarter[], rechercher l'emplacement de temp
//		int index = -1;
//		for(int k=0; k<mealStarter.length; k++) {
//			if(mealStarter[k].equals(tempStr)) {
//				index = k-1;
//				break;
//			}
//			index me permet de retrouver le plat
//		}
//		if(index != -1) {
//			list.add(mealStarter[index][1]);
//			
//		} else {
//			System.out.println("Entrer un nombre valide");
		}
	}

//	3 répéter un ensemble d'action: menu par commande
//		4.1 afficher le numéro de commande
//		4.2 Gestion du sous menu entrée
//			4.2.1 Affichage des choix
//			4.2.2 sélection et stockage du choix
//		4.3 Gestion du sous menu plat
//			4.2.1 Affichage des choix
//			4.2.2 sélection et stockage du choix
//		4.4 Gestion du sous menu accompagnement
//			4.2.1 Affichage des choix
//			4.2.2 sélection et stockage du choix etc
//		getChoice(starter, scan);
//		4.5
//		4.6
//		4.7 Afficher le résumé de la commande
//	4 Programme fini

//String[] yourOrders = new String[n];
//
//for (int i = 0; i < n; i++) {
//    System.out.print("Entrez l'élément " + (i + 1) + ": ");
//    yourOrders[i] = scanner.nextLine();
//}
//
//System.out.println("Vos commandes:");
//for (String order : yourOrders) {
//    System.out.println(order);
}

