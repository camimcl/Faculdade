import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int colSum = 0;
        int multiplyRow = 1;
        int matrixSum=0;
        int diagSum=0;
        int[][] mat = new int[3][3];
        Scanner scan = new Scanner(System.in);

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println("Type a number: ["+(i+1)+", "+(j+1)+"]");
                mat[i][j]=scan.nextInt();
                //SOMA DOS EL. 1st COLUNA
                if (mat[i][j]==mat[i][0]){
                    colSum+=mat[i][0];
                }
                //MULTIPLICACAO 1ST LINHA
                if (mat[i][j]==mat[0][j]){
                    multiplyRow=mat[0][j]*multiplyRow;
                }
                //SOMA TODOS OS ELEMENTOS
                matrixSum +=mat[i][j];
                //SOMA DIAG PRINCIPAL
                diagSum=mat[0][0]+mat[1][1]+mat[2][2];
            }
        }

        System.out.println("1st col sum: "+colSum);
        System.out.println("Matrix sum: "+matrixSum);
        System.out.println("Diagonal sum: "+diagSum);
        System.out.println("1st row multiplication: "+multiplyRow);

    }
}
