import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размеры 2мерного массива как x, y соответственно: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int mas[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mas[i][j] = (int) (Math.random() * 100);
                System.out.print(mas[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

        //отсортировать массив
        int num = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < y; k++) {
                    for (int t = 0; t < y; t++) {
                    if (mas[i][j] < mas[k][t])   {
                        num = mas[i][j];
                        mas[i][j] = mas[k][t];
                        mas[k][t] = num;
                }}}
        }}


                    for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(mas[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }}
