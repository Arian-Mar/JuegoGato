import java.util.Scanner;
public class Tarea3 {
    public static void main(String[] args) {
        System.out.println("Ingrese una cadena de 9 caracteres que contega solo X, O y _:");
        Scanner scanner = new Scanner(System.in);

        String chilaquiles = scanner.nextLine();

        //verificar si la cadena tiene 9 caracteres
        if (chilaquiles.length() !=9){
            System.out.println("La cadena debe de contener 9 caracteres");
            return;
        }

        //imprimir la cadena ingresada
        System.out.println("Cadena ingresada:"+chilaquiles);

        //imprimir el marco con los caracteres ordenados en su respectiva posicion
        System.out.println("marco:");
        System.out.println(""+ chilaquiles.charAt(0) + " | " + chilaquiles.charAt(1) + " | " + chilaquiles.charAt(2) + " ");
        System.out.println("---|---|---");
        System.out.println(""+ chilaquiles.charAt(3) + " | " + chilaquiles.charAt(4) + " | " + chilaquiles.charAt(5) + " ");
        System.out.println("---|---|---");
        System.out.println(""+ chilaquiles.charAt(6) + " | " + chilaquiles.charAt(7) + " | " + chilaquiles.charAt(8) + " ");

    }
}