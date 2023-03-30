import java.util.Scanner;

public class reto14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaramos variables.
        String nombre;
        int apostado, computadora, jugada, vidas = 3;
        String r = "n"; // Respuesta a "¿Quieres volver a jugar?"
        int pc = 3; //Vidas del pc

        // Pedimos datos.
        System.out.println("¿Cual es tu nombre?");
        nombre = sc.next();
        System.out.println("Cada vez que pierdas vas a perder 1000 pesos");
        System.out.println("¿Cuanto dinero deseas apostar?");
        apostado = sc.nextInt();

        if(apostado >= 1000){
            do {
                vidas = 3;
                pc = 3;
                while (vidas > 0 || pc > 0) { // Desconteo de vidas.
                    //Juego
                     // Condiciones
                    System.out.println("----------------------------------------");
                    if (computadora ==1 & jugada == 1) { // Piedra no gana piedra. 1 piedra
                        System.out.println("Tu jugada fue: Cara.");
                        System.out.println("La jugada de tu pc fue: Cara.");
                        System.out.println("!EMPATE!");
                        System.out.println("Fin del juego.");

                    } else if (computadora == 1 & jugada == 2) { // Piedra no gana papel. 2 piedra
                        System.out.println("Tu jugada fue: Sello.");
                        System.out.println("La jugada de tu pc fue: Cara.");
                        System.out.println("! es el ganador!");
                        // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                        pc -= 1; // El jugador puerde automaticamente 1 vida.
                        System.out.println("Las vidas del pc: " + pc + "/3.");
                        System.out.println("Fin del juego.");
                    } else if (computadora == 2 & jugada == 1) { // Papel gana Piedra. 1 papel
                        System.out.println("Tu jugada fue: Cara.");
                        System.out.println("La jugada de tu pc fue: Sello.");
                        System.out.println("!Computadora es el ganador!");
                        // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                        vidas -= 1; // El jugador puerde automaticamente 1 vida.
                        System.out.println("Tus vidas: " + vidas + "/3.");
                        System.out.println("Fin del juego.");
                    } else if (computadora == 2 & jugada == 2) { // Papel no gana papel. 2 papel
                        System.out.println("Tu jugada fue: Sello.");
                        System.out.println("La jugada de tu pc fue: Sello.");
                        System.out.println("!EMPATE!");
                        System.out.println("Fin del juego.");
                    }
                }

                //Ganas o pierdes dinero
                if(vidas == 0){
                    System.out.println("Has perdido: 1000 pesos, tu saldo actual es: " + apostado);
                    apostado -= 1000;
                }else if(pc == 0){
                    System.out.println("Has ganado: 1000 pesos, tu saldo actual es: " + apostado);
                    apostado += 1000;
                }
                //Deseas volver a jugar?
                System.out.println("-----------------------------------------------------------");
                System.out.println("¿Deseas volver a jugar?\nResponda:\nSi: s\nNo: n");
                r = sc.next();
    
            } while (r.equalsIgnoreCase("s"));
            //NO te queda dinero
        }else{
            System.out.println("No tienes suficiente dinero apostado como para entrar a jugar.");
        }

        sc.close();
    }
}
// Comenzamos a jugar.
System.out.println("<--CARA O SELLO-->");System.out.println("Ingresa tu jugada.");System.out.println("1.Cara.\n2.Sello."); // Toca
                                                                                                                           // explicar
                                                                                                                           // como
                                                                                                                           // usar
                                                                                                                           // el
                                                                                                                           // programa.
jugada=sc.nextInt();

computadora=(int)(Math.random()*2)+1; // Esto lo busque en internet... no lo copié.
