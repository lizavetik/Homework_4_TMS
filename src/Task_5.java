//вывесті на консоль діагоналі массіва
//хочу,чтобы выводілось лесенкой
import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размеры 2мерного массива как x, y соответственно: ");
        int x = in.nextInt();
        int y = in.nextInt();

        int mas[][] = new int[x][y];

        for(int i=0; i<x; i++){
            for (int j=0; j<y; j++){

                    mas[i][j] = (int)(Math.random()*100);
                    System.out.print(mas[i][j] + "   ");

                            }
            System.out.println();
        }
        System.out.println();

        for(int i=0; i<x; i++){
            System.out.println(" " + mas[i][i]);
        }}
}
