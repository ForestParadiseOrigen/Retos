import java.util.Scanner;
public class reto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaramos variables.
        String r = ""; //Respuesta a "¿Desea volver a jugar?"
        String p = "cargador";
        String ru = ""; //Respuesta del usuario 

        System.out.println("<--DESCUBRE LA PALABRA-->");
        System.out.println("La frase esta incompleta, debes adivinar cual es la palabra que falta para ganar.");

        System.out.println("¡EMPEZEMOS!");
        System.out.println("Mi celular esta descargado y no encuentro mi ________.");
        ru = sc.next();

        do{
            if(ru.equalsIgnoreCase("cargador")){
                System.out.println("¡Exacto! La palabra era: " + p + ".\n" + "¡Has descubierto la palabra!");
            }else{
                System.out.println("Palabra incorrecta. Debes volver a intentarlo.");
            }
            System.out.println("¿Deseas volver a intentarlo?\nResponde.\nSi: s\nNo: n");
        }while(r.equalsIgnoreCase("s"));

        sc.close();
    }
}
