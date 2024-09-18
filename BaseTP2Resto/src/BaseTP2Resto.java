import java.util.Scanner;

public class BaseTP2Resto {
//	simuler la prise d’une commande d'un restaurant
//	1 créer les tableaux de différents plats avec les choix possibles
	String[][] mealStarter = {{"1", "Salade"}, {"2", "Soupe"}, {"3", "Quiche"}, {"4", "Aucune"}};
	String[][] mainCourse = {{"1", "Poulet"}, {"2", "Boeuf"}, {"3", "Poisson"}, {"4", "Végétarien"}, {"5", "Vegan"}, {"6", "Aucun"}};
	String[][] sideDish = {{"1", "Riz"}, {"2", "Pâtes"}, {"3", "Frites"}, {"4", "Légumes"}, {"5", "Aucun"}};
	String[][] drinks = {{"1", "Eau plate"}, {"2", "Eau gazeuse"}, {"3", "Soda"}, {"4", "Vin"}, {"5", "Aucune"}};
	String[][] dessert = {{"1", "Tarte maison"}, {"2", "Mousse au cholocat"}, {"3", "Tiramisu"}, {"4", "Aucune"}};
	
	private void syso() {

//	2 demander le nombre de menus souhaités
		Scanner scan = new Scanner(System.in);
		System.out.println("Combien de menus souhaitez-vous?");
		int temp = scan.nextInt();
		
//		3 écrire: "Vous avez demandé " x "menus"
		for(int i=0; i<temp; i++) {
			System.out.println("Vous avez demandé " + temp + "menus");
			
			
		}
	}
	
	

//	4 écrire: "Commande numéro " x
//	5 écrire le "choix entrée :"
//	proposer le choix "Entrée :" avec les possibilités([1 - Salade][2 - Soupe][3 - Quiche][4 - Aucune]
//	en écrivant: "Que souhaitez-vous comme entrée ? [Saisir le chiffre correspondant]"
//	6 écrire le "choix plat :"
//	proposer le choix "Plat :" avec les possibilités([1 - Poulet][2 - Boeuf][3 - Poisson][4 - Végétarien][5 - Vegan][6 - Aucun]
//	en écrivant: "Que souhaitez-vous comme plat ? [Saisir le chiffre correspondant]"
//	7 écrire le "choix accompagnement :"
//	proposer le choix "Accompagnement :" avec les possibilités([1 - Riz][2 - Pâtes][3 - Frites][4 - Légumes][5 - Aucun]
//	en écrivant: "Que souhaitez-vous comme accompagnement ? [Saisir le chiffre correspondant]"
//	8 écrire le "choix boissons :"
//	proposer le choix "Boissons :" avec les possibilités([1 - Eau plate][2 - Eau gazeuse][3 - Soda][4 - Vin][5 - Aucune]
//	en écrivant: "Que souhaitez-vous comme boissons ? [Saisir le chiffre correspondant]"
//	9 écrire le "choix dessert :"
//	proposer le choix "Dessert :" avec les possibilités([1 - Tarte maison][2 - Mousse au cholocat][3 - Tiramisu][4 - Aucune]
//	en écrivant: "Que souhaitez-vous comme dessert ? [Saisir le chiffre correspondant]"
//	10 écrire: "Résumé de la commande : " x \n
//	11 écrire le "Résumé de la commande : " x
//	12 même chose pour la commande suivante, jusqu'à ce que toutes les commandes soient passées
}
