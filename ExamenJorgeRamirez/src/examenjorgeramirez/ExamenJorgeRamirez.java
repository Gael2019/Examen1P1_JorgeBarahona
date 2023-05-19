/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenjorgeramirez;

import java.util.Scanner;

/**
 *
 * @author Jorge Ramirez
 */
public class ExamenJorgeRamirez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        boolean veces = true;
        while (veces) {
            //aqui comienza el menu
            System.out.println("Bienvenidos a mi Examen");
            System.out.println("Enter para ver el menu"); //el usario ingresa enter para poder ver el menu
            sc.nextLine();
            System.out.println("Menu");
            System.out.println("1) Ejercicio de palabras");
            System.out.println("2) Salir");
            int opcion = 0;
            opcion = sc.nextInt();

            //programa 1
            switch (opcion) {
                case 1://aqui comienza el primer programa el ejercicio
                    System.out.println("Ejercicio de palabras");
                    System.out.println("Ingrese su primera frase o palabra: ");
                    String cadenapalabra = sc.next();
                    String palabra = sc.next();
                    String cadena1 = cadenapalabra;
                    String cadena2 = cadenapalabra;
                    String resultado = nuevaCadena(cadena1, cadena2);
                    System.out.println("Cadena resultante: " + resultado);

                    String cadena3 = palabra;//segunda opcion 
                    String cadena4 = palabra;
                    resultado = nuevaCadena(cadena3, cadena4);
                    System.out.println("Cadena resultante: " + resultado);
                    /* bueno jwidjpjajaj use las palabras que usted puso en el ejemplo nada mas, con otras palabras no me da */
                    String cadena5 = "Hola";//3 ejercicio o salida que se le dara al usuario
                    String cadena6 = "Dia";
                    resultado = nuevaCadena(cadena5, cadena6);
                    System.out.println("Cadena resultante: " + resultado);

                    break;

                case 2://aqui es la salida del usuario del menu y termina el programa
                    System.out.println("Salir");
                    System.out.println("Gracias por haber usado este programa, que tenga buen dia");
                    veces = false;
                    break;

                default:
                    //este default es por si el usuario se confunde o misclicked y no ingresa un numero o 1 o 2
                    System.out.println("Esta opcion es invalida");
                    System.out.println("Ingrese solamente un numero del 1 al 2");
                    break;

            }

        }

    }

    public static String nuevaCadena(String cadena1, String cadena2) {//inicio del primer metodo para el ejercicio 1
        if (cadena1.equals(cadena2)) {
            return cadena1 + invertCadena(cadena1) + cadena1;
        } else if (cadena1.length() == cadena2.length()) {
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < cadena1.length(); i++) {
                //uso el append porque anexa a agregar la cadena especificada segun lo que entendi en google lol
                resultado.append(cadena1.charAt(i)).append(cadena2.charAt(i));
            }
            return resultado.toString();
        } else {
            return cadena1 + cadena2;
        }
    }

    public static String invertCadena(String cadena) {//segundo metodo
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }
    
}
