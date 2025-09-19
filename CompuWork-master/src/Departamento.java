/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilga
 */
import java.util.ArrayList;

public class Departamento {
    String nombre;
    ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void asignarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public void eliminarEmpleado(String id) {
        try {
            boolean eliminado = false;
            for (Empleado emp : empleados) {
                if (emp.id.equals(id)) {
                    empleados.remove(emp);
                    eliminado = true;
                    System.out.println("Empleado eliminado.");
                    break;
                }
            }

            if (!eliminado) {
                throw new Exception("Empleado con ID " + id + " no encontrado.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Departamento: " + nombre);
        for (Empleado e : empleados) {
            e.mostrarEmpleado();
        }
    }
}

