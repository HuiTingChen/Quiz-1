package TVSetterGetter;

public class Main {
	public static void main(String[]args) {
		TV a = new TV();
		
		a.setBrand();
		a.setType();
		a.setSize();
		a.setResolution();
		
		System.out.println("");
		System.out.println("TV brand        : " + a.getBrand());
		System.out.println("TV type         : " + a.getType());
		System.out.println("Size of TV      : " + a.getSize());
		System.out.println("Resolution of TV: " + a.getResolution() + " people");
		System.out.println("");
}
}
	
	
	
