import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] miArray =  creaArray(getSizeX(), getSizeY());

        for (int[] ramArray : miArray){
            for (int numero: ramArray) {
                System.out.println(numero);

            }
        }
    }


    private static Scanner input = new Scanner(System.in);

    public static int[][] creaArray(int x, int y){

        int[][] arr = new int[x][y];
        
        for (int i = 0; i < x ; i++) {

            for (int j = 0; j <y ; j++) {

                System.out.println("Introduce la posición" + i + " " + j);
                arr[i][j] = input.nextInt();

            }

        }

        return arr;
    }


    public static int getSizeX(){
        int x;
        x = input.nextInt();
        return x;
    }
    public static int getSizeY(){
        int y;
        y = input.nextInt();
        return y;
    }   

    public static int getSizeZ(){
        int z;
        z = input.nextInt();
        return z;
    }



}


