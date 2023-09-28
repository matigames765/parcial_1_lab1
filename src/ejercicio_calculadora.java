import java.util.Scanner;
public class ejercicio_calculadora {
    public static void main(String[] args) {
        /*
        **Sección 1: Suma **

        1. Implemente la función `suma` en Java que realice la suma de dos números y
        * devuelva el resultado.
        2. Cree un programa de Java que solicite al usuario ingresar dos números,
        * luego llame a la función `suma` e imprima el resultado.

        **Sección 2: Resta**

        1. Implemente la función `resta` en Java que realice la resta de dos números
        * y devuelva el resultado.
        2. Modifique el programa de Java para que también pueda realizar operaciones
        * de resta. Solicite al usuario elegir entre suma o resta y realice la operación
        * correspondiente.

        **Sección 3: Multiplicación**

        1. Implemente la función `multiplicación` en Java que realice la multiplicación
        * de dos números y devuelva el resultado.
        2. Agregue la capacidad de realizar operaciones de multiplicación en el programa
        * de Java. Permita que el usuario elija entre suma, resta o multiplicación y
        * realice la operación correspondiente.

        **Sección 4: División **

        1. Implemente la función `división` en Java que realice la división de dos números
        * y devuelva el resultado.
        2. Modifique el programa de Java para que pueda realizar operaciones de división.
        * Asegúrese de manejar correctamente la división por cero y muestre un mensaje de
        * error si es necesario.

        **Sección 5: Secuencia de Operaciones **

        1. Modifique el programa de Java para que permita realizar múltiples operaciones
        * en secuencia sin reiniciar la calculadora. Utilice el resultado de la operación
        * anterior como el primer número para la siguiente operación.

        **Sección 6:  Salir de la Calculadora **

        1. Agregue una opción para que el usuario pueda salir de la calculadora en
        * cualquier momento.
        2. Cuando el usuario decida salir, muestre un mensaje de despedida.

         */
        Scanner sc = new Scanner(System.in);
        double control = 1;
        while (true){
            System.out.print("Ingrese 1 para realizar una suma, 2 resta, 3 multiplicacion y 4 division: ");
            int operation = sc.nextInt();
            System.out.print("Ingrese el primer numero para la operacion: ");
            double number1 = sc.nextDouble();
            System.out.print("Ingrese el segundo numero para la operacion: ");
            double number2 = sc.nextDouble();
            while (control != 0){
                switch (operation){
                    case 1:
                        double addition = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + addition);
                        number1 = addition;
                        break;
                    case 2:
                        double rest = number1 - number2;
                        System.out.println(number1 + " - " + number2 + " = " + rest);
                        number1 = rest;
                        break;
                    case 3:
                        double product = number1 * number2;
                        System.out.println(number1 + " x " + number2 + " = " + product);
                        number1 = product;
                        break;
                    case 4:
                        if (number2 == 0){
                            System.out.println("No se puede realizar divisiones por 0");
                        }else{
                            double division = number1 / number2;
                            System.out.println(number1 + " / " + number2 + " = " + division);
                            number1 = division;
                        }
                        break;
                    default:
                        System.out.println("Operacion no valida");
                }
                System.out.print("Ingrese 0 para finalizar o cualquier otro numero para continuar: ");
                control = sc.nextDouble();
                if (control == 0.0){
                    break;
                }
                System.out.println("El resultado de la operacion anterior sera el primer operando para la siguiente.");
                System.out.println("Operando 1 = " + number1);
                System.out.print("Ingrese el segundo numero u operando: ");
                number2 = sc.nextDouble();
                System.out.println("Ingrese el numero segun la operacion a realizar");
                System.out.print("1 Suma, 2 Resta, 3 Multiplicacion y 4 Division: ");
                operation = sc.nextInt();
            }
            break;
        }
        System.out.println("Adios, espero haberte sido de ayuda");
    }
}
