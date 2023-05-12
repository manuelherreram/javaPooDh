package EjercicioClase03;
import java.util.Scanner;
public class RockPaperScissors {
    private Scanner scanner = new Scanner(System.in);
    private int computer;
    private int player;
    private String message;

    public void getPlayerChoice() {
        System.out.println("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors):");
        player = scanner.nextInt();
    }

    public void generateComputerChoice() {
        computer = (int) (Math.random() * 3);
    }

    public void determineWinner() {
        if (player == computer) {
            message = "Player chooses " + getChoiceName(player) + " vs Computer chooses " + getChoiceName(computer) + ". It's a tie.";
        } else if ((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1)) {
            message = "Player chooses " + getChoiceName(player) + " vs Computer chooses " + getChoiceName(computer) + ". Player wins.";
        } else {
            message = "Player chooses " + getChoiceName(player) + " vs Computer chooses " + getChoiceName(computer) + ". Computer wins.";
        }
    }

    public String getChoiceName(int choice) {
        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public void playGame() {
        getPlayerChoice();
        generateComputerChoice();
        determineWinner();
        System.out.println(message);
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.playGame();
    }
}
