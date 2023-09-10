class CricketPlayer {
    private String playerName;
    private int score;
    private int ballsPlayed;
    private int numFours;
    private int numSixes;

    public CricketPlayer(String playerName, int score, int ballsPlayed, int numFours, int numSixes) {
        this.playerName = playerName;
        this.score = score;
        this.ballsPlayed = ballsPlayed;
        this.numFours = numFours;
        this.numSixes = numSixes;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public int getNumFours() {
        return numFours;
    }

    public int getNumSixes() {
        return numSixes;
    }

    private double getStrikeRate() {
        return (double) score / ballsPlayed * 100;
    }

    private double getBoundaryPercentage() {
        return ((double) (numFours + numSixes) / ballsPlayed) * 100;
    }

    public void printPlayerInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Score: " + score);
        System.out.println("Balls Played: " + ballsPlayed);
        System.out.println("Number of Fours: " + numFours);
        System.out.println("Number of Sixes: " + numSixes);
        System.out.println("Strike Rate: " + getStrikeRate());
        System.out.println("Boundary Percentage: " + getBoundaryPercentage() + "%");
    }

    public static void main(String[] args) {
        // Create a CricketPlayer object
        CricketPlayer player = new CricketPlayer("John Doe", 75, 50, 8, 2);

        // Print player information
        player.printPlayerInfo();
    }
}
//    CricketPlayer Class:

//        This class represents a cricket player and has the following attributes:
//
//        playerName (String): Represents the name of the player.
//        score (int): Represents the total score of the player.
//        ballsPlayed (int): Represents the total number of balls played by the player.
//        numFours (int): Represents the number of fours hit by the player.
//        numSixes (int): Represents the number of sixes hit by the player.
//        It provides the following functionalities:
//
//        Parameterized Constructor:
//
//        The constructor accepts the playerName, score, ballsPlayed, numFours, and numSixes as parameters and initializes the corresponding attributes of the player.
//        Accessor Methods:
//
//        Getter methods are provided for each attribute to access their values.
//        These methods allow other parts of the program to retrieve the player's name, score, balls played, number of fours, and number of sixes.
//        Private Helper Methods:
//
//        getStrikeRate() is a private method that calculates and returns the strike rate of the player.
//        getBoundaryPercentage() is a private method that calculates and returns the percentage of boundaries (fours and sixes) scored by the player.
//        printPlayerInfo() Method:
//
//        This method is a public method that displays the information of the player.
//        It prints the player's name, score, balls played, number of fours, number of sixes, strike rate, and boundary percentage.
//        It calls the private helper methods getStrikeRate() and getBoundaryPercentage() to calculate the strike rate and boundary percentage.
//        Main Class:
//
//        The Main class contains the main method, which is the entry point of the program.
//
//        Creating a CricketPlayer Object:
//
//        Inside the main method, a CricketPlayer object named player is created using the constructor.
//        The player's name is set as "John Doe", score as 75, balls played as 50, number of fours as 8, and number of sixes as 2.
//        Printing Player Information:
//
//        The printPlayerInfo() method is called on the player object to display the player's information.
//        The method internally calculates the strike rate and boundary percentage and prints them along with the other player details.
//        Output:
//
//        When the program is executed, it will display the following output:
//        yaml
//        Copy code
//        Player Name: John Doe
//        Score: 75
//        Balls Played: 50
//        Number of Fours: 8
//        Number of Sixes: 2
//        Strike Rate: 150.0
//        Boundary Percentage: 20.0%
//        This output provides the information of the cricket player,
//        including their name, score, balls played, number of fours,
//        number of sixes, strike rate, and boundary percentage.
//
//        The code demonstrates the implementation of the CricketPlayer class,
//        which encapsulates the attributes and behaviors of a cricket player.
//        It allows you to create instances of CricketPlayer,
//        access player information through getter methods,
//        and print the player's details using the printPlayerInfo() method.
