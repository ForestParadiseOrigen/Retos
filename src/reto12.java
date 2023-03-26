import java.util.Scanner;

public class reto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos variables
        int pal1res1, pal1res2, pal2res1, pal2res2;
        String r; //Juego: si o no
        boolean status1 = false, status2 = false; //Si encuentran una pareja el status debe ser true
        
        //Declaramos matrices
        String [][] palabras = new String[2][2];

        System.out.println("------------------------------------------------------------");
        System.out.println("Ingresa 2 palabras y repite solamente 1 vez cada una.\nEn total debes llenar 4 casillas.");

        //Llenamos la matriz
        for(int f = 0; f < 2; f++){
            for(int c = 0; c < 2; c++){
                System.out.println("Ingrese la palabra en la fila " + (f + 1) + " y la columna " + (c + 1) + ": ");
                palabras[f][c] = sc.next();
            }
            System.out.println("");
        }
        //Imprimimos los datos brindados por el usuario (las palabras)
        System.out.println("------------------------------------------------------------");
        System.out.println("¡Listo! Acabas de ingresar todas las palabras.\n¡Es hora de jugar!");
        System.out.println("<--CONSENTRECE-->");

        for(int f = 0; f < 2; f++){
            for(int c = 0; c < 2; c++){
                System.out.print(palabras[f][c] + "\t");
            }System.out.println("");
        }
        //Pedimos que bisque las palabras
        System.out.println("------------------------------------------------------------");
        System.out.println("¿Estas preparado para comenzar a jugar?\nSi//No");
        r = sc.next();

        //Sirve para quitar la cuadrilla 4x4 con palabras y ponga la nueva cuadrilla con todo oculto.
        if(r.equalsIgnoreCase("si")){
            for(int i = 0; i < 2500; i++){//El contador actua como un timer para dar tiempo y espacio para ocultar las palabras, es estetico pero poco funcional
                System.out.println("");
            }

            String [][] ocultas = {{"¿..?","¿..?"},{"¿..?","¿..?"}};

            System.out.println("--------------------------------------------------------");
            System.out.println("<--EMPEZEMOS-->");
            System.out.println("Las palabras han sido ocultadas.\n<--ADIVINA-->");
            for(int f = 0; f < 2; f++){//Palabras "ocultas"
                for(int c = 0; c < 2; c++){
                    System.out.print(ocultas[f][c] + "\t");
                }System.out.println("");
            }
            
            if(status1 && status2 == true){
                
            }else if(status1 || status2 == false){
                System.out.println("PALABRA 1");
            System.out.print("Digite el numero de la culumna: "); pal1res1 = sc.nextInt();
            System.out.print("Digite el numero de la fila: "); pal1res2 = sc.nextInt();

            System.out.println("PALABRA 2");
            System.out.print("Digite el numero de la culumna: "); pal2res1 = sc.nextInt();
            System.out.print("Digite el numero de la fila: "); pal2res2 = sc.nextInt();
            }

           sc.close(); 

        }
    }
}
