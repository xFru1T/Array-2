import java.util.Scanner;
import java.util.stream.IntStream;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print length array: ");
        int len = scanner.nextInt();
        int[] array = new int[len];
        System.out.print("Print the array number for finding avg: ");
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        double res = IntStream.of(array).average().orElse(0.0);
        System.out.println("Avg array: " + res);
        }
    }
