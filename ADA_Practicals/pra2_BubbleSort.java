package ADA;

import java.util.Scanner;

public class pra2_BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of element in array:");
        int n = sc.nextInt(), a[] = new int[n];
        if (n <= 10) {
            for (int i = 0; i < n; i++) {
                System.out.print("enter " + (i + 1) + "th value:");
                a[i] = sc.nextInt();
            }
            System.out.println("Normal Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                a[i] = (int) (Math.random() * 100);
            }
        }
        System.out.println("");
        long start = System.nanoTime();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        long end = System.nanoTime();
        if (n <= 10) {
            System.out.println("Sorted Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("it takes " + (end - start) + "nano sec");
    }
}
