import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int[][] miArray =  creaArray(getSize.X(), getSize.Y());

        for (int[] ramArray : miArray){
            for (int numero: ramArray) {
                System.out.println(numero);

            }
        }
    }

    public static int[][] creaArray(int x, int y){

        int[][] arr = new int[x][y];
        
        for (int i = 0; i < x ; i++) {

            for (int j = 0; j <y ; j++) {

                System.out.println("Introduce la posición" + i + " " + j);
                arr[i][j] = getInput.getInt();

            }
        }

        return arr;
    }






}


