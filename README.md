# Proyecto JAVA0078_M4_CuentasBancarias

## Descripción

Este proyecto simula un sistema de cuentas bancarias donde se pueden crear personas y asociarlas a cuentas. Se permite realizar operaciones de depósito y retiro, y se puede imprimir la información de todas las cuentas creadas.

---
## Clases Principales

- **Persona**: representa a una persona con nombre y edad.
- **CuentaBancaria**: representa una cuenta bancaria con saldo, titular y número de cuenta único. Contiene una lista estática de todas las cuentas creadas.
- **Aplicacion**: clase principal que ejecuta el programa y demuestra la funcionalidad de las otras clases.

---
## Funcionalidad

1. Crear instancias de la clase Persona.
2. Crear instancias de la clase CuentaBancaria asociadas a las personas.
3. Realizar depósitos y retiros en las cuentas.
4. Mostrar la información de todas las cuentas existentes, incluyendo titular, número de cuenta y saldo.

---
## Ejemplo de salida

```
Saldo: 200000.0
Saldo: 0.0
---------------------------
Saldo: 100000.0
Saldo: 300000.0
---------------------------
Saldo: 500000.0
Saldo: 0.0
---------------------------
Cantidad total de cuentas: 3
Titular:
Nombre: Anastasia. Edad: 28.
Numero de cuenta: 123456
Saldo: 0.0
Titular:
Nombre: Braulio. Edad: 35.
Numero de cuenta: 234567
Saldo: 300000.0
Titular:
Nombre: Camilo. Edad: 47.
Numero de cuenta: 345678
Saldo: 0.0
```

---
## Estructura del proyecto

```
JAVA0078_M4_CuentasBancarias/
│
├─ src/
│  └─ clases/
│     ├─ Persona.java
│     ├─ CuentaBancaria.java
│     └─ Aplicacion.java
│
└─ README.md
```

---
## Requisitos

- Java 8 o superior
- IDE compatible (Eclipse, STS, IntelliJ, VS Code) o consola con JDK instalado

---
## Ejecución

Desde la consola, compilar y ejecutar:

```bash
javac src/clases/*.java
java clases.Aplicacion
```

---
## Autores

- Thalia Riquelme
- Luis Romero
- Laura Duhalde

