import java.lang.Math;
import java.util.Scanner;
public class homework1 {
    public static void main(String[] args){
        System.out.println("Циклы №1");
        int x = -10;
        System.out.println("x y");
        while (x <= 8){
            if (x <= -8){
                System.out.println(x + " -3");
                x += 1;
            }
            else if (x <= -3){
                double y = (3.0*(x+3.0))/5.0;
                System.out.println(x + " " + y);
                x += 1;
            }
            else if (x <= 3){
                double y = Math.sqrt(9 - x*x);
                System.out.println(x + " " + -y);
                x += 1;
            }
            else if (x <= 5){
                double y = x - 3;
                System.out.println(x + " " + y);
                x += 1;
            }
            else{
                System.out.println(x + " 3");
                x += 1;
            }

        }

        System.out.println("Циклы №2");
        for (int i = 10; i <= 99; i++){
            int a = i * i;
            if (i <= 31){
                if (a / 100 == a % 10){
                    System.out.println(i + " " + a);
                }
            }
            else{
                int a1 = a % 1000;
                a1 /= 10;
                if (a / 1000 == a % 10 && a1 / 10 == a1 % 10 ){
                    System.out.println(i + " " + a);
                }
            }
        }

        System.out.println("Массивы №1");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int N = scan.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = (int)(Math.random() * 200 - 100);
            System.out.print(arr[i] + " ");
        }
        int maxotr = -100000;
        for(int i = 0; i<N; i++){
            if(arr[i] >= maxotr && arr[i] < 0){
                maxotr = arr[i];
            }
        }
        System.out.println("максимальное отриц число = " + maxotr);

        System.out.println("Массивы №2");
        System.out.print("Введите кол-во строк и столбцов массива: ");
        int M = scan.nextInt();
        int matrix[][] = new int[M][M];
        for(int i = 0; i<M; i++){
            for(int j = 0; j<M; j++){
                matrix[i][j] = (int)(Math.random() * 200 - 100);
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }

    }
}


