import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        // ---------------------------------------------------------------
        System.out.println("----------  Variables :  ----------");
        String texto = "Este es un texto asignado a una variable string . . .";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println(longitud);

        char caracter = texto.charAt(11);
        System.out.println(caracter);

        String subcadena = texto.substring(5, 16);
        System.out.println(subcadena);

        String replace = texto.replace("una variable", "un dato");
        System.out.println(replace);

        System.out.println("Minusculas: " + texto.toLowerCase());
        System.out.println("MAYUSCULAS: " + texto.toUpperCase());

        
        // ---------------------------------------------------------------
        System.out.println("");
        System.out.println("----------  Estructura FOR :  ----------");
        int i;
        for(i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        System.out.println("El ultimo valor de i es: " + i);


        // ---------------------------------------------------------------
        System.out.println("");
        System.out.println("----------  Estructura WHILE :  ----------");
        
        int conti = 1;
        while (conti <= 5)
        {
           System.out.println("Numero While : " + conti);
           conti++;
        }
        System.out.println("");
        System.out.println("> Numero Final: " + conti);


        // ---------------------------------------------------------------
        System.out.println("");
        System.out.println("----------  Estructura DO . . . WHILE :  ----------");
        
        int contador = 6;
        do{
            System.out.println("Variable contador, antes de la condicion: " + contador);
            contador++;
        }
        while (contador <= 5);
        
        System.err.println("Final: " + contador);
        

        // ---------------------------------------------------------------
        System.out.println("");
        System.out.println("----------  IF's anidados :  ----------");

        int edad = 20;
        if (edad > 18) {
            System.out.println("Puedes Ingresar a la Fiesta");
        }
        else if (edad == 18){
            System.out.println("Tienes la edad Justa");
            }
            else {
                System.out.println("No puede Ingresar");
            }

        
        // ---------------------------------------------------------------
        System.out.println("");
        System.out.println("----------  Estructura Switch :  ----------");
        
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la maquina de bebidas");
        System.out.println("Elija una opcion:");
        System.out.println("1) Cafe");
        System.out.println("2) Mate");
        System.out.println("3) Gaseosa");
        System.out.println("4) Vino");
        int opcion = Scanner.nextInt();

        switch(opcion)
        {
            case 1:
                System.out.println("Café !!!, de paso que combina con el curso . . .");
                break;
            
            case 2:
                System.out.println("Mate !!!, debes ser Argentino, Uruguayo o Paraguayo . . .");
                break;
            
            case 3:
                System.out.println("Gaseosa !!!, Cuidado con el exceso de azúcar . . .");
                break;
            
            case 4:
                System.out.println("Vino !!!, Si tomas en exceso, no manejes, por favor . . .");
                break;

            default:
                System.out.println("Opcion no Válida. Fin del Programa . . .");
                break;
        }

    }
}
