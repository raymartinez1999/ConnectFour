package ConnectFour;


public class Player implements Comparable<Player> {
	private String playerSymbol;
	private String playerName;
	private int numGames;
	private int numWins;
	private int numLosses;
	
	public Player() {
		playerSymbol = " * ";
		playerName = "PlayDoe";
		numGames = 0;
		numWins = 0;
		numLosses = 0;
	}
	public Player(String name, String symbol) {
		this();
//		numGames = 0;
//		numWins = 0;
//		numLosses = 0;
		playerName = name;
		playerSymbol = symbol;
	}
	//no setter for numWins, numLosses, numGames
	//getPercntageofWins, getPercentageofLosses, etc, etc
	public void addNumWins() {
		numWins++;
		numGames++;
	}
	public void addNumLosses() {
		numLosses++;
		numGames++;
	}
	public void addDraw() {
		numGames++;//not a win or loss, but a game was played
	}
	public int getNumWins() {
		return numWins;
	}
	public int getNumLosses() {
		return numLosses;
	}
	public int getNumGames() {
		return numGames;
	}
	public String getSymbol() {
		return playerSymbol;
	}
	public String getName() {
		return playerName;
	}
	// setter for name and symbol?
	public boolean equals(Object o) {
		if(o instanceof Player) {
			Player otherPlayer = (Player)o;
			if(this.playerName.equalsIgnoreCase(otherPlayer.playerName)) {
				if(this.playerSymbol.equalsIgnoreCase(otherPlayer.playerSymbol)) {
					if(this.numGames == otherPlayer.numGames) {
						if(this.numLosses == otherPlayer.numLosses) {
							if(this.numWins == otherPlayer.numWins) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	public String toString() {
		String s = "Player [ name = " + playerName + "  , " + " symbol = " + playerSymbol + " , " + "wins= " + numWins + " , " + 
					"losses= " + numLosses + " , " + "total games = " + numGames + "]";
		return s;
	}
	@Override
	public int compareTo(Player otherP) {
		if(this.numWins > otherP.numWins) {
			return 1;
		}
		else if(this.numWins < otherP.numWins) {
			return -1;
		}
		else { //equal
			return 0;
		}
	}
}
