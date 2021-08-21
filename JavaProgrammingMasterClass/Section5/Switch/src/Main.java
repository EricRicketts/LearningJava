public class Main {

    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> {
                System.out.println("Value was 1");
            }
            case 2 -> {
                System.out.println("Value was 2");
            }
            default -> {
                System.out.println("Was not 1 or 2");
            }
        }
        char[] charArray = { 'A', 'B', 'C', 'D', 'E', 'F'};
        for (char value: charArray) {
            switch(value) {
                case 'A': {
                    System.out.println("A found");
                    break;
                }
                case 'B': {
                    System.out.println("B found");
                    break;
                }
                case 'C': {
                    System.out.println("C found");
                    break;
                }
                case 'D': {
                    System.out.println("D found");
                    break;
                }
                case 'E': {
                    System.out.println("E found");
                    break;
                }
                default: {
                    System.out.println("None of the letters A, B, C, D, or E found");
                }
            }
        }
    }
}
