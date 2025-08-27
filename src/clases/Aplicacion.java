package clases;

/**
 * La clase Aplicacion sirve como punto de entrada del programa
 * para demostrar la funcionalidad de las clases {@link Persona} y {@link CuentaBancaria}.
 * <p>
 * En este ejemplo, se crean instancias de personas y cuentas bancarias,
 * se realizan operaciones de depósito y retiro, y se imprime la información
 * de todas las cuentas creadas.
 * </p>
 * 
 * @author Thalia Riquelme, Luis Romero, Laura Duhalde
 */
public class Aplicacion {

    /**
     * Método principal que inicia la ejecución del programa.
     * <p>
     * Crea tres personas y tres cuentas bancarias asociadas, realiza depósitos
     * y retiros, muestra los saldos después de cada operación y finalmente
     * imprime la información de todas las cuentas creadas.
     * </p>
     */
    public static void main(String[] args) {
        // Crea al menos tres instancias de la clase Persona
        Persona persona1 = new Persona("Anastasia", 28);
        Persona persona2 = new Persona("Braulio", 35);
        Persona persona3 = new Persona("Camilo", 47);

        // Crea tres instancias de la clase CuentaBancaria asociadas a las personas
        CuentaBancaria cuenta1 = new CuentaBancaria(100000, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(200000, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(300000, persona3);

        // Realiza operaciones de depósito y retiro en las cuentas
        cuenta1.depositar(100000); // OK
        System.out.println("Saldo: " + cuenta1.getSaldo());
        cuenta1.retirar(300000); // Saldo insuficiente
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println("---------------------------");

        cuenta2.retirar(100000); // OK
        System.out.println("Saldo: " + cuenta2.getSaldo());
        cuenta2.depositar(200000); // OK
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println("---------------------------");

        cuenta3.depositar(200000); // OK
        System.out.println("Saldo: " + cuenta3.getSaldo());
        cuenta3.retirar(500000); // OK
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println("---------------------------");

        // Imprime la información de todas las cuentas creadas
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
