package singletome.ase.cts;

public class Director {

	private String name;
	private int age;
	
	public static Director director=null;
	
	private Director(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Director [name=" + name + ", age=" + age + "]";
	}

	
	public synchronized static Director getInstance(String name) {
		if (director==null) {
			director=new Director(name, 30);
		}
		return Director.director; //lazy initialization
	}


	
}
