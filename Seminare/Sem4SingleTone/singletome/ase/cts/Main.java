package singletome.ase.cts;


public class Main {

	public static void main(String[] args) {
		
		Papa papa1=Papa.getInstance();
		Papa papa2=Papa.getInstance();
	    System.out.println(papa1);
	    System.out.println(papa2);
	 
	    
	    Director dir1=Director.getInstance("Victor");
	    Director dir2=Director.getInstance("Gigi");
	    System.out.println(dir1.toString());
	    System.out.println(dir2.toString());
	}
}
