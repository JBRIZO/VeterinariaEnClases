package Proyectos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Menus menu = new Menus();
        Citas cita = new Citas();
        Diagnosticos diagnostico = new Diagnosticos();
        while(!salir) {
            menu.principal();
            try {
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        boolean salir2 = false;
                        while (!salir2)
                        {
                            menu.citas();
                            try {
                                int opcion1 = sc.nextInt();
                                switch (opcion1) {
                                    case 1:
                                        cita.agendarCita();
                                        break;
                                    case 2:
                                        cita.reagendarCita();
                                        break;
                                    case 3:
                                        cita.cancelarCita();
                                        break;
                                    case 4:
                                        salir2 = true;
                                        break;
                                    default:
                                        System.out.println("Ingrese un numero valido");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Ingrese un numero valido");
                                sc.next();
                            }
                        }
                        break;
                    case 2:
                        boolean salir3 = false;
                        while (!salir3)
                        {
                            menu.diagnosticos();
                            try {
                                int opcion2 = sc.nextInt();
                                switch (opcion2) {
                                    case 1:
                                        diagnostico.registrarDiagnostico();
                                        break;
                                    case 2:
                                        diagnostico.modificarDiagnostico();
                                        break;
                                    case 3:
                                        diagnostico.eliminarDiagnostico();
                                        break;
                                    case 4:
                                        salir3 = true;
                                        break;
                                    default:
                                        System.out.println("Ingrese un numero valido");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Ingrese un numero valido");
                                sc.next();
                            }
                        }
                        break;
                    case 3:
                        boolean salir4 = false;
                        while (!salir4) {
                            System.out.println("           Menu de reportes");
                            System.out.println("****************************************");
                            System.out.println("1. Reporte de citas");
                            System.out.println("2. Reporte de diagnosticos");
                            System.out.println("3. Menu principal");
                            System.out.println("****************************************");
                            try {
                                int opcion3 = sc.nextInt();
                                switch (opcion3) {
                                    case 1:
                                        cita.mostrarCitas();
                                        break;
                                    case 2:
                                        diagnostico.mostrarDiagnosticos();
                                        break;
                                    case 3:
                                        salir4 = true;
                                        break;
                                    default:
                                        System.out.println("Ingrese un numero valido");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Ingrese un numero valido");
                                sc.next();
                            }
                        }
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        break;

                }
            }catch(InputMismatchException e)
            {
                System.out.println("Ingrese un numero valido");
                sc.next();

            }
        }


    }
    }
