import java.util.Scanner;

public class main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        main addArray = new main();
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[array1.length + array2.length];

        addArray.addElement(array1);
        addArray.addElement(array2);

        for (int i = 0; i <array1.length; i ++){
            array3[i] = array1[i];
        }
        for (int j = 0; j <array2.length; j ++){
            array3[j + array1.length] = array2[j];
        }
        for (int k = 0; k < array3.length; k++){
            System.out.print(array3[k] + ("\t"));
        }

    }

    void addElement(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter the element: ");
            x[i] = input.nextInt();
        }
    }
}
