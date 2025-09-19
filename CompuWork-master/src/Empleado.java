/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilga
 */
public class Empleado {
    String id;
    String nombre;
    String puesto;
    double salario;

    public Empleado(String id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void actualizarEmpleado(String nuevoNombre, String nuevoPuesto, double nuevoSalario) {
        this.nombre = nuevoNombre;
        this.puesto = nuevoPuesto;
        this.salario = nuevoSalario;
    }

    public void mostrarEmpleado() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Puesto: " + puesto + " | Salario: " + salario);
    }
}

