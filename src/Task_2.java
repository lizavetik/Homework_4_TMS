//буквами нарисовать шахматную доску

public class Task_2 {
    public static void main(String[] args){

    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            if (j%2==0 & i%2==0){
                System.out.print("W  ");
        }
            else if(j%2!=0 & i%2!=0){
                System.out.print("W  ");
            }
            else if(j%2==0 & i%2!=0){
                System.out.print("B  ");
            }
            else if(j%2!=0 & i%2==0){
                System.out.print("B  ");
            }
        }
        System.out.println("");
        }
    }
}
