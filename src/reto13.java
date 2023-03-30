import java.util.Scanner;

public class reto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos variables
        int c = 0; //N cantidad de productos que el usuario va a poner
        int s = 0; //Suma de los precios de los productos
        int p = 0; //Precio de los productos

        //Pedimos la cantidad de productos
        System.out.println("¿Cuantos productos desea ingresar?");
        c = sc.nextInt();

        //Dejamos que ingrese todos los precios
        for(int i = 0; i < c; i++){
            System.out.println("Ingrese el precio del producto " +  i);
            p = sc.nextInt();

            s += p; //Sumamos todos los precios
        }

        //Imprimimos todo a pagar
        System.out.println("El total a pagar es: " + s);

        sc.close();
    }
}
