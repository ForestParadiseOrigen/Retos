import java.util.Scanner;

public class reto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos variables
        int cs = 0;

        //Pedimos datos
        System.out.println("¿Cuantos competidores participaran?");
        cs = sc.nextInt();

        //Declaramos arreglos
        String[] names = new String[cs];
        int[] times = new int[cs];
        
        //Pedimos nombres y tiempos.
        for(int i = 0; i < cs; i++){
            System.out.println("-----------------------------------------------------------------");
            //Nombres
            System.out.println("Ingrese el nombre del competidor " + (i + 1));
            names[i] = sc.next();
            //Tiempos
            System.out.println("Ingrese el tiempo de llegada del competidor " + (i + 1));
            times[i] = sc.nextInt();
        }

        //Imprimimos nombres y tiempos.
        System.out.println("<--RESULTADOS-->");
        for(int i = 0; i < cs; i++){
            //Imprimimos a los competidores y sus tiempos de llegada.
            System.out.println((i+1) + ". " + names[i] + " - Tiempo: " + times[i] + " segundos");
        }

        sc.close();
    }
}                       
