package clases;

import java.util.ArrayList;

/**
 * La clase CuentaBancaria representa una cuenta bancaria asociada a una persona.
 * Mantiene el saldo, el titular y un número de cuenta único generado aleatoriamente.
 * Además, mantiene un registro estático de todas las cuentas creadas.
 * 
 * @author Thalia Riquelme, Luis Romero, Laura Duhalde
 */
public class CuentaBancaria {
    
    /** Saldo disponible en la cuenta */
    private double saldo;
    
    /** Titular de la cuenta */
    private Persona titular;
    
    /** Número de cuenta único */
    private int numeroCuenta;
    
    /** Lista estática que contiene todas las cuentas creadas */
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
    
    /**
     * Constructor de la clase CuentaBancaria.
     * Genera un número de cuenta aleatorio de 6 dígitos y añade la cuenta a la lista global.
     * 
     * @param saldo   Saldo inicial de la cuenta.
     * @param titular Persona titular de la cuenta.
     */
    public CuentaBancaria(double saldo, Persona titular) {
        super();
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = (int)(Math.random() * 900000) + 100000;
        
        listaDeCuentasBancarias.add(this);
    }
    
    /** @return Saldo actual de la cuenta */
    public double getSaldo() {
        return saldo;
    }
    
    /** @param saldo Nuevo saldo a asignar */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /** @return Titular de la cuenta */
    public Persona getTitular() {
        return titular;
    }
    
    /** @param titular Persona a asignar como titular */
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    /** @return Número de cuenta */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    /** @param numeroCuenta Número de cuenta a asignar */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    /** @return Lista de todas las cuentas bancarias creadas */
    public static ArrayList<CuentaBancaria> getListaDeCuentasBancarias() {
        return listaDeCuentasBancarias;
    }
    
    /** @param listaDeCuentasBancarias Lista de cuentas a asignar */
    public static void setListaDeCuentasBancarias(ArrayList<CuentaBancaria> listaDeCuentasBancarias) {
        CuentaBancaria.listaDeCuentasBancarias = listaDeCuentasBancarias;
    }
    
    /**
     * Deposita un monto en la cuenta.
     * 
     * @param monto Cantidad a depositar.
     */
    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depósito exitoso");
    }
    
    /**
     * Retira un monto de la cuenta si hay saldo suficiente.
     * 
     * @param monto Cantidad a retirar.
     */
    public void retirar(double monto) {
        if(this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    /**
     * Muestra la información de la cuenta, incluyendo titular, número de cuenta y saldo.
     */
    public void despliegaInformacion() {
        System.out.println("Titular: ");
        this.titular.despliegaInformacion();
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: " + this.saldo);
    }
    
    /**
     * Imprime la información de todas las cuentas creadas y la cantidad total de cuentas.
     */
    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("Cantidad total de cuentas: " + listaDeCuentasBancarias.size());
        for (CuentaBancaria cuentaBancaria : listaDeCuentasBancarias) {
            cuentaBancaria.despliegaInformacion();
        }
    }
}
