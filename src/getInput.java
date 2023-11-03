import java.util.Scanner;

public class getInput {

    private static Scanner entry = new Scanner(System.in);

    public static int getInt(){
        return entry.nextInt();
    }

}

// Stackoverflow

/*
public class ConsoleReader{
    private static Scanner scan = new Scanner(System.in);

    public static int nextInt() {
        return scan.nextInt();
    }

    public static String nextLine() {
        return scan.nextLine();
    }
}
 */