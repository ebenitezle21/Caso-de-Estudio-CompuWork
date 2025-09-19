/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilga
 */
public class ReporteDesempeño {
    Empleado empleado;
    String evaluacion;
    int puntuacion;

    public ReporteDesempeño(Empleado empleado, String evaluacion, int puntuacion) {
        this.empleado = empleado;
        this.evaluacion = evaluacion;
        this.puntuacion = puntuacion;
    }

    public void mostrarReporte() {
        System.out.println("Reporte de " + empleado.nombre + " | Evaluación: " + evaluacion + " | Puntuación: " + puntuacion);
    }
}
