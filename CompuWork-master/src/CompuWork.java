/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author wilga
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CompuWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Departamento> departamentos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menú CompuWork ---");
            System.out.println("1. Crear empleado");
            System.out.println("2. Actualizar empleado");
            System.out.println("3. Eliminar empleado");
            System.out.println("4. Crear departamento");
            System.out.println("5. Asignar empleado a departamento");
            System.out.println("6. Mostrar empleados en un departamento");
            System.out.println("7. Generar reporte de desempeño");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese puesto: ");
                    String puesto = scanner.nextLine();
                    System.out.print("Ingrese salario: ");
                    double salario = scanner.nextDouble();
                    System.out.print("Es permanente? (1-Sí, 2-No): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("Ingrese bono anual: ");
                        double bono = scanner.nextDouble();
                        empleados.add(new EmpleadoPermanente(id, nombre, puesto, salario, bono));
                    } else {
                        System.out.print("Ingrese duración del contrato en meses: ");
                        int duracion = scanner.nextInt();
                        empleados.add(new EmpleadoTemporal(id, nombre, puesto, salario, duracion));
                    }
                    System.out.println("Empleado creado con éxito.");
                    break;

                case 2:
                    System.out.print("Ingrese ID del empleado a actualizar: ");
                    String idActualizar = scanner.nextLine();
                    for (Empleado emp : empleados) {
                        if (emp.id.equals(idActualizar)) {
                            System.out.print("Nuevo nombre: ");
                            emp.nombre = scanner.nextLine();
                            System.out.print("Nuevo puesto: ");
                            emp.puesto = scanner.nextLine();
                            System.out.print("Nuevo salario: ");
                            emp.salario = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.println("Empleado actualizado.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese ID del empleado a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    empleados.removeIf(emp -> emp.id.equals(idEliminar));
                    System.out.println("Empleado eliminado.");
                    break;

                case 4:
                    System.out.print("Ingrese nombre del departamento: ");
                    String nombreDepto = scanner.nextLine();
                    departamentos.add(new Departamento(nombreDepto));
                    System.out.println("Departamento creado.");
                    break;

                case 5:
                    System.out.print("Ingrese ID del empleado: ");
                    String idEmp = scanner.nextLine();
                    System.out.print("Ingrese nombre del departamento: ");
                    String nombreDep = scanner.nextLine();
                    Empleado empleadoEncontrado = null;
                    Departamento departamentoEncontrado = null;

                    for (Empleado emp : empleados) {
                        if (emp.id.equals(idEmp)) {
                            empleadoEncontrado = emp;
                            break;
                        }
                    }

                    for (Departamento dep : departamentos) {
                        if (dep.nombre.equals(nombreDep)) {
                            departamentoEncontrado = dep;
                            break;
                        }
                    }

                    if (empleadoEncontrado != null && departamentoEncontrado != null) {
                        departamentoEncontrado.asignarEmpleado(empleadoEncontrado);
                        System.out.println("Empleado asignado.");
                    } else {
                        System.out.println("Empleado o departamento no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Ingrese nombre del departamento: ");
                    String nombreDepMostrar = scanner.nextLine();
                    for (Departamento dep : departamentos) {
                        if (dep.nombre.equals(nombreDepMostrar)) {
                            dep.mostrarEmpleados();
                            break;
                        }
                    }
                    break;

                case 7:
                    System.out.print("Ingrese ID del empleado: ");
                    String idReporte = scanner.nextLine();
                    ReporteDesempeño reporte = new ReporteDesempeño(new Empleado(idReporte, "Desconocido", "Desconocido", 0), "Buen desempeño", 8);
                    reporte.mostrarReporte();
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
