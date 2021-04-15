package TVSetterGetter;

import java.util.Scanner;

public class TV {
	String brand;
	String type;
	int size;
	int resolution;
	
	Scanner s = new Scanner(System.in);
	
	
	//Create Setter Method
	public void setBrand() {
		System.out.print("Enter TV brand        : ");
		this.brand = s.nextLine();
	}
	
	public void setType() {
		System.out.print("Enter TV type         : ");
		this.type = s.nextLine();
	}
	
	public void setSize() {
		System.out.print("Enter size of TV      : ");
		this.size = s.nextInt();
	}
	
	public void setResolution() {
		System.out.print("Enter resolution of TV: ");
		this.resolution = s.nextInt();
	}
	
	// Create Getter Method
	public String getBrand() {
		 return this.brand;
	}
		
	public String getType() {
		 return this.type;
	}
	
	public int getSize() {
		 return this.size;
	}
		  
	public int getResolution() {
		 return this.resolution;
	}
	
}


