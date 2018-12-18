
public class Modal implements Gestion{
	
	int[][][] Tab;
	
	
	public Modal(int dim,int size) {
		
		if(dim==2) {
			
			this.Tab= new int[size][size][1];
		}
		else if(dim==3){
			
			this.Tab= new int[size][size][size];
			
		}
		else {
		 System.out.println("Only dim of 2 or 3 is possible");
		}
		
	}
	
	
	
	
	public boolean isValable(int i, int j,int k) {
		
		if(Tab[i][j][k]>0) {
			return false;
		}
		else {
			return true; 
		}
		
	
	}

	//Permet de mettre l'id du joueur sur la case qu'il a selectionnée
	public void placePion(int id, int x, int y, int z) {	
		
		if(isValable(x,y,z)) {
		Tab[x][y][z]=id;
		}else {
		System.out.println("Cette case est déjà prise");
		}
	}
	
	public void afficheTab(int row , int column) {
		String cases="";	
		for (int x = 0; x < row; x++) {
			for ( int y = 0; y < column; y++) {
				cases=cases+" "+Integer.valueOf(Tab[x][y][0]);
			}
			System.out.println(cases);
			System.out.println("\n");
			cases="";
			
		}
	}
	
	public int[][] backupTab(int [][] tab ) {
		int[][] oldtab = tab.clone();
		return  oldtab;
	}
	
	


	@Override
	public int calculNorme(int x1, int x2) {
		// TODO Auto-generated method stub
		
		return Math.abs(x1-x2);
	}


	@Override
	public boolean isColinear() {
		// TODO Auto-generatedmethod stub
		
		return false;
	}




	@Override
	public boolean nextTo(int x1, int y1, int z1, int x2, int y2, int z2) {
		// TODO Stub de la méthode généré automatiquement
		if((calculNorme(x1,x2)<2)&&(calculNorme(y1,y2)<2)&&(calculNorme(z1,z2)<2)) {
		return true;
		
		}else {
			return false;
		}
	}
}
