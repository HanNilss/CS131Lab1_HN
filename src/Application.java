/**
 * This is the Application object that will launch our application
 * @author Hannes Nilsson
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		
		System.out.println(npc.reportStructure());
		
		NonPlayerCharacter npc2 = new NonPlayerCharacter("123", "Agressive", true, "SMART");
		
		System.out.println(npc2.reportStructure());

	}//end main

}//end class