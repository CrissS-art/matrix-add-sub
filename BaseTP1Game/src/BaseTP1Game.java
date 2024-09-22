import java.util.Scanner;
import java.util.Random;

public class BaseTP1Game {

	public static void main(String[] args) {
//		 Écrire un programme demandant à l'utilisateur s'il souhaite jouer à notre 
//		 jeu, si non alors sortir du programme, si oui, alors proposer de saisir un chiffre entre 1 et 100 et dire 
//		 à chaque itération si le chiffre est plus petit ou plus grand. Une fois le chiffre trouvé, afficher un 
//		 message : vous avez trouvé en x coups !

		System.out.println("Bonjour, souhaitez-vous jouer à mon jeu ? O/N");
		
		Scanner scan = new Scanner(System.in);
		String yesOrNo = scan.next();
		
		if(yesOrNo.equalsIgnoreCase("o")) {
			int min = 1;
			int max = 100;
			int randomNumber = (int) (Math.random()*100 + 1);
			int userNumber = 0;
			int numberOfTries = 1;
			
			System.out.println("Saisissez une valeur comprise entre 1 et 100");
			userNumber = scan.nextInt();
			while(userNumber != randomNumber) {
				numberOfTries ++;
				if(userNumber < randomNumber) {
					System.out.println("Saisissez une valeur plus grande");
					userNumber = scan.nextInt();
				} else if(userNumber > randomNumber) {
					System.out.println("Saisissez une valeur plus petite");	
					userNumber = scan.nextInt();
				} else 
					System.out.println("Bravo! Vous avez trouvé en " + numberOfTries + " coups");	
				}
			System.out.println("Voulez-vous rejouer ?  O/N");
			yesOrNo = scan.next();
		} else {
			System.out.println("Tant pis pour toi. A bientôt.");
			}
		scan.close();
		}
}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Souhaitez jouer à notre jeu? Répondre (oui/non)");
		Scanner wannaPlay = new Scanner(System.in);
		String userResponse = wannaPlay.next();
		
//		faire passer oui en premier
			while(userResponse.equalsIgnoreCase("non")) {
				System.out.println("Tant pis pour toi. A bientôt.");
			}
			else if(userResponse.equalsIgnoreCase("oui")) {
// créer le nmbre aléatoire
				int min = 1;
				int max = 100;
				int randomNum = (int)(Math.random()*100) + 1;
				int givenNumber = 0;
				int numberOfTries = 1;
//Deamnde de nombre à l'util
				System.out.println("Saisir un chiffre entre 1 et 100");

//récupérer le nombre rentré par l'util	
				Scanner number = new Scanner(System.in);
				givenNumber = number.nextInt();
				
//condition pour comparer le nombre util à nmbre aléatoire
				while ( givenNumber != randomNum ) {
					numberOfTries++;
					System.out.println("Réessayez!");	
					if (givenNumber < randomNum) {	
						System.out.println("Saisissez une valeur plus grande");
						givenNumber = number.nextInt();
					} else if (givenNumber > randomNum) {
							System.out.println("Saisissez une valeur plus petite");
						givenNumber = number.nextInt();
							System.out.println("Bravo, vous avez trouvé en " + numberOfTries + " coups!");
						
					System.out.println("Voulez-vous rejouer?");
						}
					}
					}

			wannaPlay.close();*/
