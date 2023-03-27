import java.util.Scanner;

//Maquina Expendedora
public class reto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

         //Declaramos la matriz
        String [][] pro = new String [4][4]; //Producto y precio

        //Pedimos los datos qu van a ir a las matrizes
        for (int c = 0; c < 4; c++) { 
            for (int f = 0; f < 4; f++) { 
                System.out.println("Digite el nombre y  precio del producto en la columna: " + (c+1) + " y en la fila " + (f+1) + "."); 
                pro[c][f] = sc.next();//Producto y precio           
            }
            System.out.println("");
        } 

        //Imprimir los datos de la matriz
        for (int c = 0; c < 4; c++) { 
            for (int f = 0; f < 4; f++) { 
                System.out.print(pro[c][f] +"\t"); //imprime producto y precio                 
            } 
            System.out.println(""); 

        } 
        sc.close();
    }
}
