package test;
import java.util.Scanner;

class abc {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of array:");
        int n = s.nextInt();

        int[][] arr = new int[n][];
        int t = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter length of jagged array "+i+": ");

            int m = s.nextInt();
            t = m;
            arr[i] = new int[m];

            for (int j = 0; j < m; j++) {
            	System.out.print("Enter element "+i+" "+j+" ");
                arr[i][j] = s.nextInt();
            }
        }

        int odd = 0, even = 0;

        System.out.println("Rows " + n + " with " + t
                           + " Columns");
        System.out.println("Elements of Array:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
            System.out.println();
        }

        System.out.println("Even: " + even
                           + ", Odd: " + odd);

        s.close();
    }
}