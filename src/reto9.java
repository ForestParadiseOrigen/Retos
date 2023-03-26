import java.util.Scanner;

public class reto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaramos variables
        int canNum = 0;
        
        //Pedimos datos
        System.out.println("¿Cuantos numeros desea ingresar?");
        canNum = sc.nextInt();

        //Declaramos arreglos
        int[] num = new int[canNum];

        //Ingresamos los numeros que queramos
        System.out.println("Ingrese los numeros.");

        for(int i = 0; i < canNum; i++){
            System.out.print((i+1) + ". ");
            num[i] = sc.nextInt();

        }

        //Decidimos que numeros son y no son multiplos de 2
        System.out.println("<--RESULTADOS-->");
        for (int i = 0; i < canNum; i++) {
            //Comparación
            if (num[i] % 2 == 0) {//Cuando el resultado de la resta es 0
                System.out.println((i+1) + ". El numero:" + num[i] + " es multiplo de 2.");
            }else if (num[i] % 2 != 0) {//Cuando el resultado de la resta no es 0
                System.out.println((i+1) + ". El numero:" + num[i] + " no es multiplo de 2.");
            }
        }

        sc.close();
    }
}
