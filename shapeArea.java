import java.util.Scanner;

public class shapeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String printText = "The area of your shape is ";

        System.out.print("What is your shape (Square, Triangle, Rectangle): ");
        String shape = input.next().toLowerCase();

        if (shape.matches("triangle")) {
            System.out.print("What is your base and your height (Input numbers with a \", \" in between): ");
            String triangleDimensions = input.next();
            triangleDimensions += input.nextLine();

            int[] newDimensions = splitDimensions(triangleDimensions);
            System.out.println(printText + (newDimensions[1] * newDimensions[0] * .5));
        }
        else if (shape.matches("square")) {
            System.out.print("Input the length of one of the sides: ");
            int squareSide = input.nextInt();

            System.out.println(printText + (squareSide * squareSide));
        }
        else if (shape.matches("rectangle")) {
            System.out.print("What is the length of two perpendicular sides (Input numbers with a \", \" in between): ");
            String rectangleSides = input.next();
            rectangleSides += input.nextLine();

            int[] newSides = splitDimensions(rectangleSides);
            System.out.println(printText + (newSides[1] * newSides[0]));
        }
        else {
            System.out.println("You did not enter a correct shape.");
        }
        input.close();
    }

    private static int[] splitDimensions(String dimensions) {
        String[] stringDimensions = dimensions.split(", ");
        int[] newDimensions = new int[stringDimensions.length];
        for (int i = 0; i < newDimensions.length; i++){ 
            newDimensions[i] = Integer.parseInt(stringDimensions[i]); 
        }
        return newDimensions;
    }
}
