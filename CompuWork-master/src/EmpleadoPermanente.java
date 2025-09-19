/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilga
 */
public class EmpleadoPermanente extends Empleado {
    double bonoAnual;

    public EmpleadoPermanente(String id, String nombre, String puesto, double salario, double bonoAnual) {
        super(id, nombre, puesto, salario);
        this.bonoAnual = bonoAnual;
    }

    public double calcularSalarioTotal() {
        return salario + bonoAnual;
    }
}
