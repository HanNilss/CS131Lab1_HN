/**
* Sublcass of SportsTeam describing a basketball team
*
* @author Hannes Nilsson
* @version 1.0
* lab1
* CS131ON
*/
public class BasketballTeam extends SportsTeam{
	
	/**
	 * Commonly used metrics to describe a basketball teams performance, will be used to calculate percentages.
	 */
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	/**
	 * Empty-argument constructor instantiates SportsTeam() and initializes all local fields to 0.
	 */
	
	public BasketballTeam() {
		
		super();
		
		setFieldGoals(0);
		setFieldGoalsAttempted(0);
		setFreeThrows(0);
		setFreeThrowsAttempted(0);
	}//end empty-argument constructor
	
	/**
	 * Constructs a BasketballTeam object with the help of the superclass constructor, specifying name of team, team's mascot, and head coach name.
	 * 
	 * @param teamName Name of team
	 * @param teamMascot The team's mascot
	 * @param headCoach Name of team's head coach
	 */
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(teamName, teamMascot, headCoach);
		
		setFieldGoals(0);
		setFieldGoalsAttempted(0);
		setFreeThrows(0);
		setFreeThrowsAttempted(0);
	}//end preferred constructor
	
	/**
	 * Calculates the field goal percentage for the basketball team.
	 * @return Field goal percentage in decimal form.
	 */
	public double fieldGoalPercentage() {
		
		return getFieldGoals()/getFieldGoalsAttempted();
		
	}//end fieldGoalPercentage
	
	/**
	 * Calculates the free throw percentage for the basketball team.
	 * @return Tree throw percentage.
	 */
	public double freeThrowPercentage() {
		
		return getFreeThrows()/getFreeThrowsAttempted();
		
	}//end freeThrowPercentage
	
	
	/**
	 * Creates an array containing win percentage, field goal percentage, and free throw percentage, in that order.
	 * 
	 * @return Array containing win percentage, field goal percentage, and free throw percentage.
	 */
	public double[] getStats() {
		
		double[] stats = new double[3];
		
		stats[0] = super.getWinPercentage();
		stats[1] = fieldGoalPercentage();
		stats[2] = freeThrowPercentage();
		
		return stats;
	}//end getStats
	
	/**
	 * setter for all relevant statistics addressed in the fields
	 * 
	 * @param wins Amount of wins for the team.
	 * @param losses Amount of losses for team.
	 * @param fieldGoals Amount of field goals made by team.
	 * @param fieldGoalsAttempted Amount of field goals attempted by team.
	 * @param freeThrows Amount of free throws made by team.
	 * @param freeThrowsAttempted Amount of free throws attempted by team.
	 */
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		this.wins = wins;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setStats

	/**
	 * Gets amount of field goals made.
	 * 
	 * @return the fieldGoals
	 */
	public int getFieldGoals() {
		return fieldGoals;
	}//end getFieldGoals
	/**
	 * Sets amount of field goals made.
	 * 
	 * @param fieldGoals the fieldGoals to set
	 */
	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}//end setFieldGoals
	/**
	 * Gets amount of field goals attempted.
	 * 
	 * @return the fieldGoalsAttempted
	 */
	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}//end getFieldGoalsAttempted
	/**
	 * Sets amount of field goals attempted.
	 * 
	 * @param fieldGoalsAttempted the fieldGoalsAttempted to set
	 */
	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}//end setFieldGoalsAttempted
	/**
	 * Gets free throws made.
	 * 
	 * @return the freeThrows
	 */
	public int getFreeThrows() {
		return freeThrows;
	}//end getFreeThrows
	/**
	 * Gets amount of free throws made
	 * 
	 * @param freeThrows the freeThrows to set
	 */
	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}//end setFreeThrows
	/**
	 * Gets amount of free throws attempted.
	 * 
	 * @return the freeThrowsAttempted
	 */
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}//end getFreeThrowsAttempted
	/**
	 * Sets amount of free throws attempted.
	 * 
	 * @param freeThrowsAttempted the freeThrowsAttempted to set
	 */
	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setFreeThrowsAttempted
	
	
	
}//end class
