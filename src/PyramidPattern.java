//       *
//     * * *
//   * * * * *
// * * * * * * *
public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pyramid
        for (int i = 1; i <= rows; i++) { // Outer loop: iterates through each row
            for (int j = 1; j <= rows - i; j++) { // Inner loop 1: prints spaces before stars
                System.out.print("  "); // Print two spaces
            }
            for (int k = 1; k <= 2*i-1; k++) { // Inner loop 2: prints stars
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next line
        }
    }
}
//------------------------------------------------------------------

//    *
//   * *
//  * * *
// * * * *
//public class PyramidPattern {
//    public static void main(String[] args) {
//        int rows = 4; // Number of rows in the pyramid
//        for (int i = 1; i <= rows; i++) { // Outer loop: iterates through each row
//            for (int j = 1; j <= rows - i; j++) { // Inner loop 1: prints spaces before stars
//                System.out.print(" "); // Print two spaces
//            }
//            for (int k = 1; k <= i; k++) { // Inner loop 2: prints stars
//                System.out.print("* "); // Print a star and a space
//            }
//            System.out.println(); // Move to the next line
//        }
//    }
//}