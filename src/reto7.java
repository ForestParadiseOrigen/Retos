import java.util.Scanner;
public class reto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos variables.
        String nombre, apellido, ciudad, r = "";
        int dia, mes, año, edad, id;

        do{
            //Recoleccion de datos.
        System.out.println("<--FORMULARIO-->");
        System.out.println("Diligencie el siguiente formulario.");

        System.out.println("Nombre:"); nombre = sc.next();
        System.out.println("Apellido: "); apellido = sc.next();
        System.out.println("Ciudad de nacimiento: "); ciudad = sc.next();
        System.out.println("Edad: "); edad = sc.nextInt();
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("Dia: "); dia = sc.nextInt();
        System.out.println("Numero del mes: "); mes = sc.nextInt();
        System.out.println("Año: "); año = sc.nextInt();
        System.out.println("Numero de identificacion: "); id = sc.nextInt();

        System.out.println("--------------------------------------------------------------------");

        //Impresion.
        System.out.println("El registro ha quedado de la siguienye forma: ");
        System.out.println("Nombre: " + nombre + ".");
        System.out.println("Apellido: " + apellido + ".");
        System.out.println("Ciudad de nacimiento: " + ciudad + ".");
        System.out.println("Edad: " + edad + ".");
        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + año + ".");
        System.out.println("Numero de identificacion: " + id + ".");

        System.out.println("¿Desea volver a llenar el formulario?\nResponda:\nSi: s\nNo: n");
        r = sc.next();
        }while(r.equalsIgnoreCase("s"));

        sc.close();
    }
}
