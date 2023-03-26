import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaramos variables.
        String nombre1, nombre2, r = "";
        int jugada1 = 0, jugada2 = 0;
        int vida1 = 3, vida2 = 3;

        //Comienza el juego.
        System.out.println("<--JUEGO DE DADOS-->");
        System.out.println("¡El jugador que lanze el dado y logre el numero mas alto será el ganador!");
        System.out.println("Ingrese el nombre del jugador 1: ");
        nombre1 = sc.next(); //Nombre del primer jugador.
        System.out.println("Ingrese el nombre del jugador 2: ");
        nombre2 = sc.next(); //Nombre del segundo jugador.
        System.out.println("--------------------------------------------------------------");
        System.out.println("EMPEZEMOS");

        do{//Va a ejecutar el juego y luego preguntara si quiren seguir jugando, en caso de "n" no se ejecutara mas el codigo.
            if(vida1 == 0 || vida2 == 0){ //Cuando una de las vidas llegue a 0 el juego termina.
                if(vida1 > vida2){
                    System.out.println("¡" + nombre2 + " ya no tiene vidas!");
                    System.out.println("¡" + nombre1 + " es el ganador!");
                }else{
                    System.out.println("¡" + nombre1 + " ya no tiene vidas!");
                    System.out.println("¡" + nombre2 + " es el ganador!");
                }
                r = "n";
            }else{ //En caso de que las vidas sean mayores a 0.

                while (vida1 > 0 && vida2 > 0) { //Mientras las vidas sean mayores a 0.
                    System.out.println("--------------------------------------------------------------");
                    jugada1 = (int) (Math.random() * 6) + 1; // Esto lo busque en internet... no lo copié.
                    //La pc asigna un numero aleatorio del 1 al 6.
                    System.out.println(nombre1 + " ha lanzado el dado y salió el numero: " + jugada1 + ".");
                    //La pc asigna un numero aleatorio del 1 al 6.
                    jugada2 = (int) (Math.random() * 6) + 1; // Esto lo busque en internet... no lo copié.
                    System.out.println(nombre2 + " ha lanzado el dado y salió el numero: " + jugada2 + ".");

                    if (jugada1 > jugada2) { //En caso de que el jugador 1 saque el numero mas alto.
                        System.out.println(nombre1 + " ha ganado.");
                        vida2 -= 1;
                        System.out.println(nombre2 + " tiene " + vida2 + "/3 vidas;");
                    } else if (jugada1 < jugada2) {//En caso de que el jugador 1 saque el numero mas alto.
                        System.out.println(nombre2 + " ha ganado.");
                        vida1 -= 1;
                        System.out.println(nombre1 + " tiene " + vida1 + "/3 vidas;");
                    } else { //En caso de empate.
                        System.out.println("La jugada ha sido empate.\nNingun jugador perdera vidas.");
                    }

                    System.out.println("¿Desean seguir jugando?\nResponde:\nSi: s\nNo: n");
                    r = sc.next(); //Respuesta para el while.
                
                }
            }
        }while(r.equalsIgnoreCase("s"));

        sc.close();
    }
}
