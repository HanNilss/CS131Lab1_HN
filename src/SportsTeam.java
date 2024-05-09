/**
* The abstract class SportsTeam represents a generic sports team with basic information such as team name, mascot, head coach, wins, and losses.
*
* @author Hannes Nilsson
* @version 1.0
* lab1
* CS131ON
*/

public abstract class SportsTeam {

    protected String teamName;
    protected String teamMascot;
    protected String headCoach;
    protected int wins;
    protected int losses;
    
    /**
     * Constructs a SportsTeam object with default values for team name, mascot, head coach, wins, and losses.
     */
    public SportsTeam() {
        
        setTeamName("");
        setTeamMascot("");
        setHeadCoach("");
        setWins(0);
        setLosses(0);
        
    }//end empty-argument constructor
    
    /**
     * Constructs a SportsTeam object with the specified team name, mascot, head coach, and initializes wins and losses to zero.
     * @param teamName The name of the team.
     * @param teamMascot The mascot of the team.
     * @param headCoach The head coach of the team.
     */
    public SportsTeam(String teamName, String teamMascot, String headCoach) {
        
        setTeamName(teamName);
        setTeamMascot(teamMascot);
        setHeadCoach(headCoach);
        setWins(0);
        setLosses(0);
        
    }
    
    /**
     * Calculates and returns the win percentage of the team.
     * @return The win percentage of the team as a double value.
     */
    public double getWinPercentage() {
		
		return (double)getWins()/(getWins()+getLosses());
		
	}//end getWinPercentage
    
    /**
     * Abstract method to get the statistics of the team.
     * @return An array of doubles representing the statistics of the team.
     */
    public abstract double[] getStats();
    
    /**
     * Gets the name of the team.
     * @return The name of the team.
     */
    public String getTeamName() {
        return teamName;
    }//end getTeamName
    
    /**
     * Sets the name of the team.
     * @param teamName The name to be set for the team.
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }//end setTeamName
    
    /**
     * Gets the mascot of the team.
     * @return The mascot of the team.
     */
    public String getTeamMascot() {
        return teamMascot;
    }//end getTeamMascot
    
    /**
     * Sets the mascot of the team.
     * @param teamMascot The mascot to be set for the team.
     */
    public void setTeamMascot(String teamMascot) {
        this.teamMascot = teamMascot;
    }//end setTeamMascot
    
    /**
     * Gets the head coach of the team.
     * @return The head coach of the team.
     */
    public String getHeadCoach() {
        return headCoach;
    }//end getHeadCoach
    
    /**
     * Sets the head coach of the team.
     * @param headCoach The head coach to be set for the team.
     */
    public void setHeadCoach(String headCoach) {
        this.headCoach = headCoach;
    }//end setHeadCoach
    
    /**
     * Gets the number of wins of the team.
     * @return The number of wins of the team.
     */
    public int getWins() {
        return wins;
    }//end getWins
    
    /**
     * Sets the number of wins of the team.
     * @param wins The number of wins to be set for the team.
     */
    public void setWins(int wins) {
        this.wins = wins;
    }// end setWins
    
    /**
     * Gets the number of losses of the team.
     * @return The number of losses of the team.
     */
    public int getLosses() {
        return losses;
    }//end getLosses
    
    /**
     * Sets the number of losses of the team.
     * @param losses The number of losses to be set for the team.
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }//end setLosses
    
}//end class

