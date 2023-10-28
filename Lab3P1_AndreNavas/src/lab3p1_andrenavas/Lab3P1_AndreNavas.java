/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_andrenavas;
import java.util.Scanner;
/**
 *
 * @author eliza
 */
public class Lab3P1_AndreNavas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int messi = 1;
        // inicio un contador llamado messi para poder salir del programa
        int menu = 0;
        //igual con menu y lo inicio con messi == 1 para que repita si es 1
                while (messi==1) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Transacciones Bancarias");
            System.out.println("2. Algoritmo string.contains()");
            System.out.println("3. Codificación de cadenas");
            System.out.println("4. Salir del programa");
            System.out.print("Elija una opción: ");
//opciones a elegir para el usuario
            int opcion = entrada.nextInt();
            entrada.nextLine();  // Limpiar el salto de línea

            switch (opcion) {
                case 1:
    Scanner input = new Scanner(System.in);
    double cuenta = 200.0;  // Inicializa el saldo en 200 Lempiras

    while (menu == 0) {
        System.out.println("Transacciones Bancarias:");
        System.out.println("0. Salir de transacciones bancarias");
        System.out.println("1. Retirar");
        System.out.println("2. Depositar");
        System.out.println("3. Ver estado de la cuenta");
        System.out.println("¿Qué desea realizar?");
        int opcion1 = input.nextInt();

        switch (opcion1) {
            case 0:
                System.out.print("¿Desea continuar? (s/n): ");
                char continuar = entrada.next().charAt(0);

                if (continuar == 's') {
                    System.out.println("Saliendo del programa.");
                    menu = 0;
                    // Si el usuario ingresa 's', el programa continuará ejecutándose.
                } else {
                    System.out.println("Saliendo del programa.");
                    menu = 1;
                    // Si el usuario ingresa 'n', el programa finalizará.
                    break;
                }
            // Resto del código para manejar retiros, depósitos y visualización de saldo.
               case 1:
    // Solicita al usuario que especifique la moneda para el retiro.
    System.out.println("Especifique moneda a retirar:");
    System.out.println("1. Lempira");
    System.out.println("2. Dólar estadounidense");
    System.out.println("3. Euro");
    int monedaRetiro = input.nextInt();

    // Solicita al usuario la cantidad de dinero que desea retirar.
    System.out.print("Cuánto dinero desea retirar: ");
    int cantidadRetiro = input.nextInt();

    // Realiza la acción de retiro basada en la moneda seleccionada.
    switch (monedaRetiro) {
        case 1:
            cuenta -= cantidadRetiro;  // Resta la cantidad de retiro al saldo en Lempiras.
            break;
        case 2:
            cuenta -= cantidadRetiro * 25;  // Convierte y resta el retiro en dólares al saldo en Lempiras.
            break;
        case 3:
            cuenta -= cantidadRetiro * 26;  // Convierte y resta el retiro en euros al saldo en Lempiras.
            break;
        default:
            System.out.println("Moneda de retiro no válida.");  // Imprime un mensaje si la moneda no es válida.
            break;
    }

    // Verifica si el saldo es suficiente después del retiro.
    if (cuenta >= 0) {
        System.out.println("Usted ha retirado un total de: " + cantidadRetiro);  // Muestra la cantidad retirada.
        System.out.println("Su nuevo saldo es de: " + cuenta);  // Muestra el nuevo saldo.
    } else {
        System.out.println("Su retiro es inválido.");  // Informa al usuario si el retiro no es válido.
    }
    break;
                case 2:
                    System.out.println("Especifique moneda a depositar:");
                    System.out.println("1. Lempira");
                    System.out.println("2. Dólares");
                    System.out.println("3. Euro");
                    int monedaDeposito = input.nextInt();

                    System.out.print("Cuánto dinero desea depositar: ");
                    int cantidadDeposito = input.nextInt();

                    switch (monedaDeposito) {
                        case 1:
                            cuenta += cantidadDeposito;
                            break;
                        case 2:
                            cuenta += cantidadDeposito * 25;
                            break;
                        case 3:
                            cuenta += cantidadDeposito * 26;
                            break;
                        default:
                            System.out.println("no es válida.");
                            break;
                    }

                    System.out.println("Su nuevo saldo es de: " + cuenta);
                    break;
                case 3:
                    System.out.println("Su estado de cuenta es: " + cuenta);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
                break;
        }
                case 2:
                    messi = 0;
                    System.out.println("Ingrese la cadena original:");
                    String cadenaOriginal = entrada.nextLine().toLowerCase(); // Convertir a minúsculas

                    System.out.println("Ingrese la cadena a buscar:");
                    String cadenaABuscar = entrada.nextLine().toLowerCase(); // Convertir a minúsculas

                    if (cadenaOriginal.indexOf(cadenaABuscar) != -1) {
                        System.out.println("La cadena original contiene la segunda cadena.");
                    } else {
                        System.out.println("La cadena original NO contiene la segunda cadena.");
                    }
                    break;
                case 3:
                    messi = 0;
                    System.out.println("Ingrese una cadena:");
                    String cadena = "";
                    entrada.nextLine();
                    cadena = entrada.nextLine();
                    System.out.println("Ingrese un caracter:");
                    char caracter = entrada.nextLine().charAt(0);

                    int contador = 0;
                    while (contador < cadena.length()) { 
                        int add = 0;
                        int contador2 = 0;
                        while (contador2 < cadena.length() / 2) {
                            add += cadena.charAt((contador + 2 * contador2) % cadena.length());  
                            contador2++;
                        }
                        while (add > caracter) {
                            add -= caracter;
                        }
                        System.out.println((char) add + " " + caracter + " " + cadena.charAt(contador));
                        contador++;
                    }
                    break;
                case 4:
                System.out.print("¿Desea continuar? (s/n): ");
                    char continuar = entrada.next().charAt(0);

                 if (continuar == 's') {
                messi = 1;
                
            
                 } else{
                     System.out.println("Saliendo del programa.");
                     messi = 0;
                 } 
                 break;
                default:
                    messi = 0;
                    System.out.println("No invente ponga opcion valida");
                    break;
            }
        }
    }

}





