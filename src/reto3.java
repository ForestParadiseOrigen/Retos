import java.util.Scanner;
import java.util.regex.MatchResult;

public class reto3{
    public static void main(String[] args) {
        //Declaramos variables.
        String nombre;
        int edad, computadora, jugada;

        Scanner sc = new Scanner(System.in);

        //Pedimos datos.
        System.out.println("¿Cual es tu nombre?");
        nombre = sc.next();
        System.out.println("¿Cual es tu edad?");
        edad = sc.nextInt();

        //Condicionamos la edad del usuario.
        if(edad == 0){
            System.out.println("Creo que rese DEMACIADO JOVEN para jugar... y para estar vivo...");
        }else if(edad < 18){
            System.out.println("Debes tener minimo 18 años para jugar.");
        }else if(edad >= 100){
            System.out.println("Bro... ¿Acaso inventaron la posion de la vida etrna o que?");
        }else{
            //Comenzamos a jugar.
            do{//Ejecutara el juego mientras la edad sea igual o mayor a 18 años.
                System.out.println("<--PIERDA, PAPEL O TIJERA-->");
                System.out.println("Ingresa tu jugada.");
                System.out.println("1.Piedra.\n2.Papel.\n3.Tijera."); //Toca explicar como usar el programa.
                jugada = sc.nextInt();

                computadora = (int) (Math.random() * 3) + 1; //Esto lo averigué en internet... no lo copié.

                System.out.println("----------------------------------------");
                if(computadora == 1 & jugada == 3){ //Piedra gana tijeta.   COMPU
                    System.out.println("Tu jugada fue: Papel.");
                    System.out.println("La jugada de tu pc fue: Piedra.");
                    System.out.println("!Coputadora es el ganador!");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }else if(computadora == 2 & jugada == 1){ //Papel gana piedra. COMPU
                    System.out.println("Tu jugada fue: Piedra.");
                    System.out.println("La jugada de tu pc fue: Papel.");
                    System.out.println("!Computadora es el ganador!");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }else if(computadora == 3 & jugada == 2){ //Tijera gana papel. COMPU
                    System.out.println("Tu jugada fue: Piedra.");
                    System.out.println("La jugada de tu pc fue: Papel.");
                    System.out.println("!Computadora es el ganador!");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }else if(jugada == 1 & computadora == 3){ //Piedra gana tijeta. USU
                    System.out.println("Tu jugada fue: Papel.");
                    System.out.println("La jugada de tu pc fue: Piedra.");
                    System.out.println("!" + nombre +" es el ganador!");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }else if(jugada == 2 & computadora == 1){ //Papel gana piedra.
                    System.out.println("Tu jugada fue: Piedra.");
                    System.out.println("La jugada de tu pc fue: Papel.");
                    System.out.println("!" + nombre +" es el ganador!");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }else if(jugada == 3 & computadora == 2){ //Tijera gana papel.
                    System.out.println("Tu jugada fue: Piedra.");
                    System.out.println("La jugada de tu pc fue: Papel.");
                    System.out.println("!" + nombre +" es el ganador!");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }else{
                    System.out.println("Tu jugada fue: " + jugada);
                    System.out.println("La jugada de tu pc fue: " + computadora);
                    System.out.println("!EMPATE!");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }

            }while(edad >= 18);
        }

        sc.close();
    }
    
}
