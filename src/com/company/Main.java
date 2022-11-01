package com.company;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 32;
        cliente.nombre = "Nicolas";
        cliente.telefono = 3424323;
        cliente.credito = 5;
        System.out.println(cliente.credito);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.edad);

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

}
class Cliente extends Persona{
    int credito;

}
class Trabajador extends Persona{
    float salario;
}
