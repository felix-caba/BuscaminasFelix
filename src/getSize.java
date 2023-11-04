

public class getSize {

    static int x = 0;
    static int y = 0;
    static int z = 0;
    static int dim = 0;


    // EL GET SIZE SOLO FUNCIONA UNA VEZ ACEPTANDO INPUTS. EL RESTO DE VECES, NO FUNCIONARÁY SOLO RETORNARA VALOR

    public static int X(){

        if (x==0){
            System.out.println("Introduce las filas X: ");
            x = getInput.getInt();
        }

        return x;

    }
    public static int Y(){



        if (y==0){
            System.out.println("Introduce las columnas Y: ");
            y = getInput.getInt();
        }

        return y;
    }

    public static int Z(){

        if (z==0){
            System.out.println("Introduce el fondo Z: ");
            z = getInput.getInt();
        }

        return z;
    }

    public static int dim(){

        if (dim==0){
            System.out.println("Introduce la dimension (Máx 3): ");
            dim = getInput.getInt();
        }

        return dim;
    }

}
