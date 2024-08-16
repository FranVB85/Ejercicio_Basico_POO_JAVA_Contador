import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Utilizar el constructor por defecto
        Contador contador1 = new Contador();

        int n;
        System.out.println("Introduce el valor para inicializar contador: ");
        n = sc.nextInt();

        //Asignar un valor a contador
        contador1.setCont(n);
        //Incrementar el contador
        contador1.incrementar();
        //Mostrar el valor actual
        System.out.println("Valor Contador1 después del incremento: " +contador1.getCont());

        //Incrementar el contador x2
        contador1.incrementar();
        contador1.incrementar();

        //Mostrar el valor actual
        System.out.println("Valor Contador1 después del incremento x2: " +contador1.getCont());

        //Restar 1 al valor del contador
        contador1.decrementar();

        //Mostrar el valor actual
        System.out.println("Valor Contador1 después del decremento: " +contador1.getCont());

        //Crear un nuevo objeto Contador con valor inicial 10
        Contador contador2 = new Contador(10);
        System.out.println("Valor inicial del contador2 es: " + contador2.getCont());

        //Incrementar y decrementar el contador2 y mostrar su valor
        contador2.incrementar();
        System.out.println("Valor Contador2 después del incremento: " + contador2.getCont());
        contador2.decrementar();
        System.out.println("Valor Contador2 después del decremento: " + contador2.getCont());

        //Crear un objeto Contador utilizando el constructor copia
        //Se crea el objeto contador3 como copia de contador2
        Contador contador3 = new Contador(contador2);

        //Mostrar el valor de contador3
        System.out.println("Valor del Contador3: " + contador3.getCont());

    }

}