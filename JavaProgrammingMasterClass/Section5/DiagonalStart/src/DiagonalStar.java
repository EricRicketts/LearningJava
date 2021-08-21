public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int rowCount = number, columnCount = number;
            for (int currentRow = 1; currentRow <= rowCount; currentRow++) {
                if (currentRow == 1 || currentRow == rowCount) {
                    for (int i = 1; i <= columnCount; i++) {
                        if (i == columnCount) {
                            System.out.println("*");
                        } else {
                            System.out.print("*");
                        }
                    }
                    continue;
                }
                for (int currentColumn = 1; currentColumn <= columnCount; currentColumn++) {
                    if (currentColumn == 1) {
                        System.out.print("*");
                    } else if (currentColumn == columnCount) {
                        System.out.println("*");
                    } else if (currentColumn == currentRow) {
                        System.out.print("*");
                    } else if (currentColumn == rowCount - currentRow + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
