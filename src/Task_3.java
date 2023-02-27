//работает
public class Task_3 {
    public static void main(String[] args){
        int matrix1[][] = new int[][]{{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int matrix2[][] = new int[][]{{1,2,3},{1,1,1},{0,0,0},{2,1,0}};


        int result[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<4;k++){
                    result[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.format("%6d ", result[i][j]);
            }
            System.out.println();
        }
    }
}

