
public class BaseEx64Operation {
	/*6.4 : Dans une classe Matrix censé représenté une matrice, on souhaite additionner 2 
	matrices via une méthode, assurez-vous qu’elles ont bien le même nombre de colonnes et 
	lignes avant tout pour respecter la formule.
	*/
	public static void main(String[] args) {
		// création des matrices
		int row=2;
		int column=3;
		int [][] matrix1 = {{1, 2, 0}, {4, 3,-1}};
		int [][] matrix2 = {{4, 3, -1}, {1, 3, 4}};
		
		int [][] sum = new int[row][column];
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
//		print it
		System.out.println("La somme des matrices est : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}

/*1 création des matrices
 * 2 créer méthode pour additionner des matrices
 * 	comment itérer pour additionner les 2 matrices avec le même élément?
 * 3 créer méthode pour soustraire des matrices	
 * 4 print it
 */
