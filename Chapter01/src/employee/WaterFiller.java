package employee;

//import aquarium.*;

//import aquarium.Water; 
//import aquarium.jellies.*;

//import aquarium.Water; 
//import aquarium.jellies.Water;

public class WaterFiller {
	aquarium.Water water1 = new aquarium.Water(); //package aquarium
	aquarium.jellies.Water water2 = new aquarium.jellies.Water();
	
	public static void main(String[] args) {
		WaterFiller wf = new WaterFiller();
		System.out.println(wf.water1.salty);  //false
		
		System.out.println(wf.water2.salty);  //true
	}
}
