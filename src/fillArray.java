
import java.util.Arrays;

public class fillArray {

    public static void start (){
        switch (getSize.dim()){
            case 1:

                for (int i = 0; i < getSize.X() ; i++) {
                    System.out.println("Introduce el espacio número "+(i+1)+ " :");
                    createArray.arr1()[i] = getInput.getInt();
                }
                break;

            case 2:
                for (int i = 0; i < getSize.X(); i++) {


                    for (int j = 0; j <getSize.Y() ; j++) {

                        System.out.println("Introduce el espacio " + (i+1) + " : "+ (j+1));
                        createArray.arr2()[i][j] = getInput.getInt();
                    }

                }
                break;

            case 3:
                for (int i = 0; i <getSize.X() ; i++) {

                    for (int j = 0; j <getSize.Y() ; j++) {

                        for (int k = 0; k <getSize.Z() ; k++) {

                            System.out.println("Introduce el espacio " + (i+1) + " : "+ (j+1) + " : " + (k+1));
                            createArray.arr3()[i][j][k] = getInput.getInt();

                        }
                    }
                }

                break;
        }
}}
