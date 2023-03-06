public class StoneScissorsPaper {
    public static String play(String player, String computer) {
        if (player.equals(computer)) {
            return "draw";
        } else if (player.equals("rock")) {
            if (computer.equals("scissors")) {
                return "win";
            } else {
                return "lose";
            }
        } else if (player.equals("paper")) {
            if (computer.equals("rock")) {
                return "win";
            } else {
                return "lose";
            }
        } else if (player.equals("scissors")) {
            if (computer.equals("paper")) {
                return "win";
            } else {
                return "lose";
            }
        }
        else {
            return "error";
        }
    }
}