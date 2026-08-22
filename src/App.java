import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception { //Esto es un atributo de un método que hace parte de la clase App//
        System.out.println("Hello, World!"); /*El main siempre se utiliza para ejecutar el código*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 =sc.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 =sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        


       // Scanner sc = new Scanner(System.in);

       // System.out.print("Ingrese la base");
       // int base = sc.nextInt();

       // System.out.print("Ingrese la altura");
       // int altura = sc.nextInt();

       // System.out.println(base * altura);

       // System.out.println("El área del rectángulo es:" + base * altura); /* +    + Concatenar */
       // sc.close();

        //Scanner sc = new Scanner(System.in);

        //System.out.print("¿Cómo te llamas?");
        //String nombre = sc.nextLine();

        //System.out.print("¿Cuántos años tienes?");
        //int edad = sc.nextInt();

        //System.out.println("Hola, " + nombre + ". Tienes" + edad + "años."); /* +    + Concatenar */

        //sc.close();

        
        /* Operadores aritméticos */
        //int a = 10, b =3; 
            //System.out.println(a + b); /* Suma */
            //System.out.println(a - b); /* Resta */
            //System.out.println(a * b); /* Multiplicación */
            //System.out.println(a / b); /* División entera */
            //System.out.println(a % b); /* Módulo: residuo de la división */
            //System.out.println(10.0 / 3); /* División real, uno de los dos debe ser double*/

        /* Operadores de asignación abreviados*/
        //int x = 10;
           // x += 5; /* x = x + 5 = 25 */
           // x -= 3; /* x = x - 3 = 12 */
           // x *= 2; /* x * 2 = 6 */
            //x /= 4; /* x = x / 4 = 6 */
          //  x++; /* x = x + 1 = 7 */
          //  x--; /* x = x -1 = 6 */

        /* Operadores de comparación (devuelven boolean)*/    
        //int edad =20;
           // System.out.println(edad == 20); /* true - igual a */
           // System.out.println(edad != 18); /* true - diferente de */
           // System.out.println(edad > 18); /* true - mayor que */
           // System.out.println(edad < 18); /* false - menor que */
           // System.out.println(edad >= 20); /* true - mayor o igual */
           // System.out.println(edad <= 19); /* false - menor o igual */

        /* Operadores lógicos */
        //boolean mayorDeEdad = true;
        //boolean tieneCarnet = false;
          //  System.out.println(mayorDeEdad && tieneCarnet); /* false - ambos tienen true (AND phy) */
          //  System.out.println(mayorDeEdad || tieneCarnet); /* true - al menos un true (OR phy) */
          //  System.out.println(!mayorDeEdad); /* false - niega el valor (NOT phy) */

        
    }
}
