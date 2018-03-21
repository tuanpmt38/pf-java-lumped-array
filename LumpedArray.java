import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[array1.length + array2.length];
        int temp;
        //input array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array1:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter element" + i + ":");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter array2:");
        for (int j = 0; j < 4; j++) {
            System.out.print("Enter element" + j + ":");
            array2[j] = scanner.nextInt();
        }
        //display array
        System.out.printf("%-20s%s", "Array1: ", "");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.printf("%-20s%s", "Array2: ", "");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
        //lumped array
        for (int i = 0; i < array1.length; i++) {
            temp = array1[i];
            array1[i] = array3[i];
            array3[i] = temp;
        }
        for (int j = 0; j < array2.length; j++) {
            temp = array2[j];
            array2[j] = array3[j];
            array3[array1.length + j] = temp;
        }
        System.out.printf("%-20s%s", "laumped Array3: ", "");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + "\t");
        }
    }
}
