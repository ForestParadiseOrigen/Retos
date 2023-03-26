import java.util.Scanner;
import java.util.regex.MatchResult;

public class reto5 {
    public static void main(String[] args) {
        // Declaramos variables.
        String nombre;
        int edad, computadora, jugada, vidas = 3;
        String r = "n"; // Respuesta a "¿Quieres volver a jugar?"

        Scanner sc = new Scanner(System.in);

        // Pedimos datos.
        System.out.println("¿Cual es tu nombre?");
        nombre = sc.next();
        System.out.println("¿Cual es tu edad?");
        edad = sc.nextInt();

        // Condicionamos la edad del usuario.
        if (edad == 0) {
            System.out.println("Creo que rese DEMACIADO JOVEN para jugar... y para estar vivo...");
        } else if (edad < 18) {
            System.out.println("Debes tener minimo 18 años para jugar.");
        } else if (edad >= 100) {
            System.out.println("Bro... ¿Acaso inventaron la posion de la vida etrna o que?");
        } else {
            do{
                vidas = 3;
                while (vidas > 0) { // Desconteo de vidas.

                    // Comenzamos a jugar.
                    do {// Ejecutara el juego mientras la edad sea igual o mayor a 18 años.
                        System.out.println("<--PIERDA, PAPEL O TIJERA-->");
                        System.out.println("Ingresa tu jugada.");
                        System.out.println("1.Piedra.\n2.Papel.\n3.Tijera."); // Toca explicar como usar el programa.
                        jugada = sc.nextInt();
    
                        computadora = (int) (Math.random() * 3) + 1; // Esto lo busque en internet... no lo copié.
    
                        //Condiciones
                        System.out.println("----------------------------------------");
                        if (computadora == 1 & jugada == 1) { // Piedra no gana piedra. 1 piedra
                            System.out.println("Tu jugada fue: Piedra.");
                            System.out.println("La jugada de tu pc fue: Piedra.");
                            System.out.println("!EMPATE!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            System.out.println("Fin del juego.");
    
                        } else if (computadora == 1 & jugada == 2) { // Piedra no gana papel. 2 piedra
                            System.out.println("Tu jugada fue: Papel.");
                            System.out.println("La jugada de tu pc fue: Piedra.");
                            System.out.println("!Computadora es el ganador!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            vidas-=1; //El jugador puerde automaticamente 1 vida.
                            System.out.println("Vidas: " + vidas + "/3.");
                            System.out.println("Fin del juego.");
                        } else if (computadora == 1 & jugada == 3) { // Papel no gana tijera. 3 piedra
                            System.out.println("Tu jugada fue: Tijera.");
                            System.out.println("La jugada de tu pc fue: Piedra.");
                            System.out.println("!"+ nombre + " es el ganador!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            
    
    
                        } else if (computadora == 2 & jugada == 1) { // Papel gana Piedra. 1 papel
                            System.out.println("Tu jugada fue: Piedra.");
                            System.out.println("La jugada de tu pc fue: Papel.");
                            System.out.println("!Computadora es el ganador!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            vidas-=1; //El jugador puerde automaticamente 1 vida.
                            System.out.println("Vidas: " + vidas + "/3.");
                            System.out.println("Fin del juego.");
                        }else if (computadora == 2 & jugada == 2) { // Papel no gana papel. 2 papel
                            System.out.println("Tu jugada fue: Papel.");
                            System.out.println("La jugada de tu pc fue: Papel.");
                            System.out.println("!EMPATE!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            System.out.println("Fin del juego.");
                        }else if (computadora == 2 & jugada == 3) { // Papel no gana tijera. 3 papel
                            System.out.println("Tu jugada fue: Tijera.");
                            System.out.println("La jugada de tu pc fue: Papel.");
                            System.out.println("!"+ nombre + " es el ganador!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            System.out.println("Fin del juego.");
    
    
    
                        }
                        else if (computadora == 3 & jugada == 1) { // Tijera no gana Piedra. 1 tijera
                            System.out.println("Tu jugada fue: Piedra.");
                            System.out.println("La jugada de tu pc fue: Tijera.");
                            System.out.println("!"+ nombre + " es el ganador!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            System.out.println("Fin del juego.");
                        }else if (computadora == 3 & jugada == 2) { // Tijera gana papel. 2 tijera
                            System.out.println("Tu jugada fue: Papel.");
                            System.out.println("La jugada de tu pc fue: Tijera.");
                            System.out.println("!Computadora es el ganador!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            vidas-=1; //El jugador puerde automaticamente 1 vida.
                            System.out.println("Vidas: " + vidas + "/3.");
                            System.out.println("Fin del juego.");
                        }
                        else if (computadora == 3 & jugada == 3) { // Tijera no gana tijera. 3 tijera
                            System.out.println("Tu jugada fue: Tijera.");
                            System.out.println("La jugada de tu pc fue: Tijera.");
                            System.out.println("!EMPATE!");
                            edad = 0; // Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a
                                      // 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                            System.out.println("Fin del juego.");
                        }
    
                    } while (edad >= 18);
                     
                }
                System.out.println("-----------------------------------------------------------");
                System.out.println("¿Deseas volver a jugar?\nResponda:\nSi: s\nNo: n");
                r = sc.next();

            }while (r.equalsIgnoreCase("s"));
        }

        sc.close();
    }
}
