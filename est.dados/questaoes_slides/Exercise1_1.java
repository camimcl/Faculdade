import java.util.Scanner;
public class Exercise1_1 {

    public static void main(String[] args) {
        int[][] mat = new int[2][4];
        Scanner scan = new Scanner(System.in);

         for (int i=0;i<2;i++){
            for (int j=0;j<4;j++){
                System.out.println("Type a number: ["+(i+1)+", "+(j+1)+"]");
                mat[i][j]=scan.nextInt();
            }
         }
        System.out.println("---MATRIZ DIGITADA---");
        for (int i=0;i<2;i++){
            for (int j=0;j<4;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
