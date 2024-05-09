import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Hannes Nilsson
 * @version 1.4
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;
	
	
	/**
	 * Empty-argument constructor constructs a NonPlayerCharacter object, invokes the super constructor and sets default values for the active and intelligenceType fields.
	 */
	public NonPlayerCharacter() {
		
		super();
		
		setActive(false);
		setIntelligenceType("AVERAGE");
		
	}//end empty-argument constructor
	
	/**
	 * Constructs a NonPlayerCharacter object, using parameters to set id, personality, acttive, and intelligenceType fields.
	 * 
	 * @param id Unique ID for npc, inherited from GameCharacter.
	 * @param personality Personality for npc, ionherited from GameCharacter.
	 * @param active Boolean value to determine if npc is active or not.
	 * @param intelligenceType Level of intelligence for npc.
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		
		super(id, personality);
		
		setActive(active);
		setIntelligenceType(intelligenceType);
		
	}//end preferred constructor
	
	/**
	 * Uses the StringBuilder object to create a neatly designed table containing information about the npc.
	 * Displays ID, personality type, whether npc is active or not, and intelligence of npc.
	 * 
	 * @return a formatted table containing the values of the relevant fields from both game character and npc
	 */
	public String reportStructure() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.reportStructure());
		
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
		
	}//end reportStructure
	
	/**
	 * Creates a String object s which contains the phrase "Hello my name is 'NAME'," where 'NAME' is the ID.
	 * 
	 * @return said string object.
	 */
	public String introduce() {
		
		String s = "Hello my name is "+super.getUniqueID();
		
		return s;
		
	}//end introduce
	
	/**
	 * Creates a SecureRandom object to randomize the selection process of what exclamation should be returned. Uses a switch/case
	 * statement to account for all scenarios created by the SecureRandom object. String object s is assigned one of the phrases.
	 * 
	 * @return one of the 5 exclamations determined by rng.
	 */
	public String exclaim() {
		
		SecureRandom sr = new SecureRandom();
		
		int r = sr.nextInt(5);
		
		String s = "";
		
		switch(r) {
		
		case(0):
			s = "Dag Gummit";
			break;
		case(1):
			s = "Doggone it";
			break;
		case(2):
			s = "Holy cow";
			break;
		case(3):
			s = "Jeez";
			break;
		case(4):
			s = "Well cheese and crackers";
			break;
		
		}//end switch
		
		return s;
		
	}// end introduce
	
	/**
	 * Gets active status, true or false.
	 * 
	 * @return active status of npc's activity
	 */
	public boolean isActive() {
		return active;
	}//end isActive
	
	/**Sets activity status for npc.
	 * 
	 * @param active true or false regarding activity status.
	 */
	public void setActive(boolean active) {
		this.active = active;
	}//end setActive
	
	/**
	 * Gets intelligence level for npc.
	 * 
	 * @return Type of intelligence npc is equipped with as a string.
	 */
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligencveType
	
	/**
	 * Sets intelligence type for npc.
	 * 
	 * @param intelligenceType 
	 */
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}// end setIntelligenceType
	
}//end class
