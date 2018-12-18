import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nbTours=1;
		
		
		System.out.println("Appuyer sur entrée pour commencer la partie");
		
		Scanner entree = new Scanner (System.in);
		
		System.out.print("Dimension de votre jeu ( 2 ou 3) : ");
		int dim = entree.nextInt();
		
		entree.nextLine();
		
		System.out.print("La taille du plateau : ");
		int size = entree.nextInt();
		
		System.out.println();
		
		Modal dam = new Modal(dim,size);
		
		Player player1= new Player(1);
		Player player2= new Player(2);
		
		dam.afficheTab(size,size);
		
		while((dam.isColinear()==false)&&(nbTours<size*size+1))
		{
			if ( (nbTours %2 == 1)) {
				System.out.println("Joueur 1, rentrer les coordonnées de votre pion : ");
				System.out.print("Abscisse : ");
				int x = entree.nextInt() -1;
				entree.nextLine();
				
				System.out.print("Ordonnée : ");
				int y = entree.nextInt() -1;
				entree.nextLine();
				
				dam.placePion(player1.getId(), x, y, 0);
				dam.afficheTab(size,size);
				
			}else {
				
				System.out.println("Joueur 2, rentrer les coordonnées de votre pion : ");
				System.out.print("Abscisse : ");
				int x = entree.nextInt() -1;
				
				System.out.print("Ordonnée : ");
				int y = entree.nextInt() -1;
				
				dam.placePion(player2.getId(), x, y, 0);
				dam.afficheTab(size,size);
			
				
			}
			nbTours++;
		}
		
		
		 // Création de la matrice suivant les choix initiaux.
		
		
		
	
		
		
		
		System.out.println(dam);
		
		entree.close();
		
		//use the id Player to remplace the default value of the damier 

	}

}
