import java.util.Scanner;
public class FibonacciThread extends Thread {
    int n;
    int[] series;
 public FibonacciThread(int n) {
        this.n = n;
        series = new int[n];
    }
public void run() {
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i < n; i++) {
            series[i] = series[i-1] + series[i-2];
        }
    } public void printSeries() {
        for (int i = 0; i < n; i++) {
            System.out.print(series[i] + " ");
        }
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the series: ");
        int n = sc.nextInt();
        FibonacciThread ft = new FibonacciThread(n);
        ft.start();
        try {
            ft.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ft.printSeries();
    }
}