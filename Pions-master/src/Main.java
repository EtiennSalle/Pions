import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("please enter the perspective and size of your set!");
		Scanner entree = new Scanner (System.in);
		int dim = entree.nextInt();
		int size = entree.nextInt();
		
		
		Modal dam = new Modal(dim,size); // Création de la matrice suivant les choix initiaux.
		
		
		
	
		
		
		
		System.out.println(dam);
		
		entree.close();
		
		//use the id Player to remplace the default value of the damier 

	}

}
