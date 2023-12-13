package principal;

import java.util.Scanner;

public class Claseprincipal {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---------------------------");
        String i = "go";
        while (!i.equals("salir")) {
            System.out.println("1)Iniciar session");
            System.out.println("2)Registrate");
            System.out.println("Otros)Salir");
            i = s.next();
            switch (i) {
                case "1":
                    iniciarsecion();
                    break;
                case "2":
                    break;
                default:
                    i = "salir";
                    break;
            }
        }

        System.out.println("---------------------------");
    }

    private static final String username = "lokito";
    private static final String password = "14";

    public static void iniciarsecion() {
        System.out.println("Ingrese nombre");
        String user = s.next();
        System.out.println("Ingrese contra");
        String pass = s.next();
        if (user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)) {
            System.out.println("Bienvendio al sistema");
        } else {
            System.out.println("No existe");
        }

    }

}
