import java.util.Scanner;

public class XdHamHienThiPtMang {
    public static void main(String[] args) {
        int[] number = new int[10];
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử trong mảng");
        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử" + (i) + ":");
            number[i] = scanner.nextInt();
        }
        System.out.println("các phần tử vừa nhập vào");
        displayArray(number);
    }
    //hàm hiển thị.
    public static void displayArray(int[] number) {
        for (int x : number) {
            System.out.print(x + ",");
        }
    }
}
