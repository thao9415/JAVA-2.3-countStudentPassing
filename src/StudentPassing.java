import java.util.Scanner;

public class StudentPassing {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }


        } while (size > 30);
        arr = new int[size];
        int i = 0;
        System.out.println("Enter mark of student: ");
        while (i < arr.length) {
            arr[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List of mark: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5) count++;
        }
        System.out.print("The number of students passing: " + count);

    }
}
