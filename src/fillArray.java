
import java.util.Arrays;

public class fillArray {

    public static void start (){
        switch (getSize.dim()){
            case 1:

                int[] arrayDim1 = createArray.arr1();

                for (int i = 0; i < getSize.X() ; i++) {

                    arrayDim1[i] = generator.randomGen10(50);

                }

                System.out.println(Arrays.toString(arrayDim1));
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
                            //createArray.arr3()[i][j][k] = randomGen.random(2);




                        }
                    }
                }

                break;
        }
}}
