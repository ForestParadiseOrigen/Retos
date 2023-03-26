import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        
        //Declaramos variables.
        String nombreBb, nombreDtr, nombreVna, nombreEpsBb;
        double pesoBb;
        int mesesBb;

        Scanner sc = new Scanner(System.in);


        //Recogemos datos.
        System.out.println("BIENVENIDO AL MEDICO");

        System.out.println("Ingrese el nombre del bebe: ");
        nombreBb = sc.nextLine();

        System.out.println("Peso del bebe: ");
        pesoBb = sc.nextDouble();

        System.out.println("Meses del bebe: ");
        mesesBb = sc.nextInt();

        System.out.println("Ingrese el nombre del medico: ");
        nombreDtr = sc.next();

        System.out.println("Ingrese el nombre de la vacuna: ");
        nombreVna = sc.next();

        System.out.println("Ingrese el nombre de la EPS del bebe: ");
        nombreEpsBb = sc.next();


        //FORMULA

        double formula = ((pesoBb + 15) / (mesesBb + 15)) * 10;

        //Imprimimos informacion.
        System.out.println("<--INFORMACION-->");
        System.out.println("Nombre del bebe: " + nombreBb);
        System.out.println("Nombre del medico: " + nombreDtr);
        System.out.println("EPS del bebe: " + nombreEpsBb);
        System.out.println("<--DOSIS-->");
        System.out.println("Nombre de la vacuna: " + nombreVna);
        System.out.println("Dosis: " + formula);

        sc.close();
    }
}
