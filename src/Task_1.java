//3мерный массів увелічіть на заданное чісло
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размеры 3хмерного массива как x, y, z соответственно: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();


        int mas[][][] = new int[x][y][z];

        for(int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                for(int k=0; k<z; k++){
                mas[i][j][k] = (int)(Math.random()*100);
                System.out.print(mas[i][j][k] + "   ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Какое число хотите прибавить к каждому элементу массива?? ");
        int num = in.nextInt();

        System.out.println("Вот и результат");
        for(int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                for(int k=0; k<z; k++){
                    mas[i][j][k] += num;
                    System.out.print(mas[i][j][k] + "   ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
