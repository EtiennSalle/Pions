import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nbTours=1;
		
		System.out.println("please enter the perspective and size of your set!");
		Scanner entree = new Scanner (System.in);
		int dim = entree.nextInt();
		int size = entree.nextInt();
		Modal dam = new Modal(dim,size);
		
		Player player1= new Player(1);
		Player player2= new Player(2);
		dam.afficheTab(size,size);
		while(dam.isColinear()==false)
		{
			if ( nbTours %2 == 0) {
				
				int x = entree.nextInt();
				int y = entree.nextInt();
				dam.placePion(player1.getId(), x, y, 0);
				dam.afficheTab(size,size);
			}else {
				int x = entree.nextInt();
				int y = entree.nextInt();
				dam.placePion(player2.getId(), x, y, 0);
				dam.afficheTab(size,size);
			
				
			}
		}
		
		
		 // Création de la matrice suivant les choix initiaux.
		
		
		
	
		
		
		
		System.out.println(dam);
		
		entree.close();
		
		//use the id Player to remplace the default value of the damier 

	}

}
