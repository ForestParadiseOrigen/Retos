import java.util.Scanner;
import java.util.regex.MatchResult;

public class reto4{
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
                System.out.println("<--CARA O SELLO-->");
                System.out.println("Ingresa tu jugada.");
                System.out.println("1 = Cara.\n2 = Sello."); //Toca explicar como usar el programa.
                jugada = sc.nextInt();

                computadora = (int) (Math.random() * 2) + 1; //Esto lo busque en internet... no lo copié.

                System.out.println("----------------------------------------");
                if(jugada == computadora){
                    System.out.println("La moneda salió: " + computadora + "\nY tu elegiste " + jugada);
                    System.out.println(nombre + " ha ganado.");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }else{
                    System.out.println("La moneda salió: " + computadora + "\nY tu habias elegido " + jugada);
                    System.out.println(nombre + " ha perdido.");
                    edad = 0; //Debo hacer esto porque sin querer cree un bucle infinito. Devuelvo la edad a 0 para que no siga cunpliendo la condicion y siga dejando jugar al usuairo.
                    System.out.println("Fin del juego.");
                }

            }while(edad >= 18);
        }

        sc.close();
    }
    
}
