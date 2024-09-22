import java.util.Scanner;
import java.util.arrayList;

public class BaseEx3Loop {

	public static void main(String[] args) {
//		 Écrivez une classe "Test.java", ajouter une méthode main qui lit un nombre entier et 
//		 indique s'il est positif, négatif ou s'il vaut zéro (n’oubliez pas de gérer l’interaction)
		System.out.println("Merci d'entrer un nombre entier compris entre -100 et 100");
		Scanner s = new Scanner(System.in);
		int nombre = s.nextInt();
		if(nombre == 0) {
			System.out.println("Le nombre que vous avez entré : " + nombre + " est nul");
		} else if(nombre < 0 && nombre % 2 == 0) {
			System.out.println("Le nombre que vous avez entré : " + nombre + " est négatif et pair");
		} else if(nombre > 0 && nombre % 2 == 0) {
			System.out.println("Le nombre que vous avez entré : " + nombre + " est positif et pair");
		} else if(nombre < 0 && nombre % 2 != 0) {
			System.out.println("Le nombre que vous avez entré : " + nombre + " est négatif et impair");
		} else {
			System.out.println("Le nombre que vous avez entré : " + nombre + " est positif et impair");
		}
	}
		
//		int [] numChain = {5, 10, 3, -4};
//		for(int i = 0; i < numChain.length; i++) {		
//		
//		if (numChain[i] < 0 && numChain[i] % 2 == 0 ) 
//			System.out.println(numChain[i] + " est négatif et pair");
//		 else if (numChain[i] < 0 && numChain[i] % 2 > 0 ) 
//				System.out.println(numChain[i] + " est négatif et impair");
//		 else if (numChain[i] > 0 && numChain[i] % 2 == 0 ) System.out.println(numChain[i] + " est positif et pair");
//		 else if (numChain[i] > 0 && numChain[i] % 2 > 0 ) System.out.println(numChain[i] + " est positif et impair");
//		 else 
//		System.out.println("Ce nombre est égal à 0");
		
	}


