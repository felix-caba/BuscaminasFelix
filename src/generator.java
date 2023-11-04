import java.util.concurrent.ThreadLocalRandom;

public class generator {




    public static int randomGen10(int porcentaje){


        // genera numero aleatorio entre 1 y 0 dependiendo del porcentaje


        int numero = ThreadLocalRandom.current().nextInt(0, 100);

        if (numero <= porcentaje){

            return 1;

        } else{

            return 0;
        }

    }


}
