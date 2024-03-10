import java.util.Random;

public class Rugby {
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 40;
    public static final int NUMBER_OF_PLAYERS = 25;

    public static void main(String[] args) {
        int[] teamOnePlayersArray = new int[NUMBER_OF_PLAYERS];
        int[] teamTwoPlayersArray = new int[NUMBER_OF_PLAYERS];
        Random randomAge = new Random();
        for (int arrayIndex = 0; arrayIndex < NUMBER_OF_PLAYERS; arrayIndex++) {
            teamOnePlayersArray[arrayIndex] = randomAge.nextInt(MAX_AGE + 1 - MIN_AGE) + MIN_AGE;
            teamTwoPlayersArray[arrayIndex] = randomAge.nextInt(MAX_AGE + 1 - MIN_AGE) + MIN_AGE;
        }
        int sumAgeTeamOnePlayers = 0;
        int sumAgeTeamTwoPlayers = 0;
        System.out.print("Вік гравців першої команди: ");
        for (int index = 0; index < NUMBER_OF_PLAYERS; index++) {
            sumAgeTeamOnePlayers += teamOnePlayersArray[index];
            System.out.print(teamOnePlayersArray[index] + " ");
        }
        System.out.println();
        System.out.println("Середній вік гравців першої команди: " + sumAgeTeamOnePlayers / NUMBER_OF_PLAYERS);
        System.out.print("Вік гравців другої команди: ");
        for (int index = 0; index < NUMBER_OF_PLAYERS; index++) {
            sumAgeTeamTwoPlayers += teamTwoPlayersArray[index];
            System.out.print(teamTwoPlayersArray[index] + " ");
        }
        System.out.println();
        System.out.println("Середній вік гравців другої команди: " + sumAgeTeamTwoPlayers / NUMBER_OF_PLAYERS);
    }
}
