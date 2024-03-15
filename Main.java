public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Football footballGame = new Football();
        game.playGame(footballGame);

        Basketball basketballGame = new Basketball();
        game.playGame(basketballGame);
    }
}