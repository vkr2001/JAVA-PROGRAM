// Series/SquareSeries.java

package Series;

public class SquareSeries {
    public static void printSquareSeries(int n) {
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
        System.out.println(); // Print a new line after the series
    }
}

