import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] options = {"rock", "paper", "scissors"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: rock, paper, scissors");

        String player = scanner.nextLine();
        String computer = options[(int) (Math.random() * options.length)];

        System.out.println("Computer choice: " + computer);
        System.out.println(StoneScissorsPaper.play(player, computer));
    }
}