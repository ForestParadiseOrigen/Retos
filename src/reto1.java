public class reto1 {
    public static void main(String[] args) {
        //Declararemos variables
        int c = 350; //Celsius.
        double k = c + 273.15 + 100; //Kelvin.
        double f = (c * 1.8) + 32 + 100; //Fahrenheit.

        //Imprimimos resultados
        System.out.println("<--PROGRAMA PARA CAMBIAR LA TEMPERATURA DE C° A KELVIN & FAHRENHEINT-->");
        //Simulamos que la abuela esta colocando la temperatura que desea convertir.
        System.out.println("Pon la temperatura que deseas convertir: ");
        System.out.println("Temperatura: " + c + "° Celsius."); //La temperatura en celsius que nos pidio el reto.

        System.out.println("Convirtiendo..."); //Esto es para separar, pero no hace falta que este...

        System.out.println("Listo abuela, estas son las temperaturas en Kelvin y Fahrenheit que necesitabas.");

        System.out.println("La temperatura en Kelvin es: " + k); //Resultado en Kelvin.
        System.out.println("La temperatura en Fahrenheit es: " + f); //Resultado en Fahrenheint.
    }
}
