package week3.assignment1;

public class MyClass {

	public static void main(String[] args) {
		
		//With the class(Desktop) objects
		Desktop obj = new Desktop();
		obj.desktopModel();
		obj.hardwareResources();
		obj.softwareResources();
		
		//With the HardWare Interface Object
		HardWare obj1 = new Desktop();
		obj1.hardwareResources();
		
		//With the SoftWare Interface Object
		SoftWare obj2 = new Desktop();
		obj2.softwareResources();
	}

}
