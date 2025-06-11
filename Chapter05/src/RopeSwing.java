import rope.Rope3;
import static rope.Rope3.*;

public class RopeSwing {
	
	private static Rope3 rope1 = new Rope3(); 
	private static Rope3 rope2 = new Rope3();
	
	{ System.out.println(rope1.length); } //0
	
	public static void main(String[] args) {
		
		rope1.length = 2; 
		rope2.length = 8; 
		System.out.println(rope1.length); //8
		//System.out.println("HELLO");
	}
	
	

}
