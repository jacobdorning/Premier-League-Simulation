
public class Club {
  private String clubName;
	private int points;
	
	public Club(String clubName) {
		this.clubName = clubName;
		this.points = 0;
	}
	
	/*
	 * ".plays" method: 
	 * create int variables club1 and club2 and will generate random numbers between 0 and 5. add 3 points to 
	 * to the club with greater int generated(goals scored)
	 * 
	 */
	public void plays(Club name) {
		int club1 = (int)(Math.random() * 6);
		int club2 = (int)(Math.random() * 6);
		
		if(club1 > club2) {
			addPoints(3);
		}
		else if(club2 > club2) {
			name.addPoints(3);
		}
		else {
			addPoints(1);
			name.addPoints(1);
		}
	}
	
	
	/**
	 * 
	 * @return the name of the club
	 */
	public String getClubName() {
		return clubName; 
	}
	
	/**
	 * 
	 * @return returns the points variable for the club
	 */
	public int getPoints() {
		return points;
	}
	
	
	public void addPoints(int pointsAdded) {
		points += pointsAdded;
	}
}
