import java.util.Scanner;
public class ComputerFactory {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        Computer C;
        if(type.equalsIgnoreCase("PC")) {
            C = new PC("8 GB", "1 TB", "2 GHZ");
            System.out.println(C.toString());
        }
        else if (type.equalsIgnoreCase("Server")){
            C = new Server("32 GB","10 TB", "8 GHZ");
            System.out.println(C.toString());
        }
        else{
            System.out.println("Not a valid I/P");
        }

    }
}
