
public interface Gestion {
	
	public int calculNorme(int x1, int x2);
	
	public boolean isColinear();
	
	public void afficheTab(int row , int column);
	
	public void placePion(int id, int x, int y, int z);
	
	public boolean isValable(int i, int j,int k);
	
	
	public boolean nextTo(int x1 , int y1 , int z1 , int x2, int y2 , int z2);
	
	

}
