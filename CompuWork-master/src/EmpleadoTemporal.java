/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilga
 */
public class EmpleadoTemporal extends Empleado {
    int duracionContratoMeses;

    public EmpleadoTemporal(String id, String nombre, String puesto, double salario, int duracionContratoMeses) {
        super(id, nombre, puesto, salario);
        this.duracionContratoMeses = duracionContratoMeses;
    }
}
