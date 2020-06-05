package Proyectos;

import java.util.Scanner;

public class Diagnosticos {
    private String[] nombreDiagnostico = new String[11];
    private String[] nombreMascotaDagnostico = new String[11];
    private String[] diagnostico = new String[11];
    private Scanner sc = new Scanner(System.in);
    private int cont2 = 0;
    private String positivo = "S";
    private String negativo = "N";


    public static String diagnostico(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Ingrese el diagnostico");
        String cadena = sc.nextLine();

        return cadena;
    }

    public void registrarDiagnostico()
    {
        cont2++;
        System.out.println("Ingrese el nombre del cliente.");
        nombreDiagnostico[cont2] = sc.next();
        System.out.println("Ingrese el nombre de la mascota del cliente.");
        nombreMascotaDagnostico[cont2] = sc.next();
        diagnostico[cont2] = diagnostico();
        System.out.println("");
        System.out.println("Diagnostico registrado con el numero: " + cont2);
    }

    public void modificarDiagnostico() {
        System.out.println("Ingrese el numero del diagnostico que desea modificar");
        int numDiag = sc.nextInt();
        System.out.println("El numero de diagnostico corresponde a :");
        System.out.println("Cliente: " + nombreDiagnostico[numDiag]);
        System.out.println("Mascota: " + nombreMascotaDagnostico[numDiag]);
        System.out.println("Con el siguiente diagnostico: " + diagnostico[numDiag]);
        System.out.println("¿Desea cambiar este diagnostico?(S/N)");
        int x = 0;
        while (x == 0) {
            String confirmacion = sc.next();
            if (confirmacion.equals(positivo)) {
                diagnostico[numDiag] = diagnostico();
                System.out.println("----------------------------------");
                System.out.println("El diagnostico ha sido modificado");
                System.out.println("----------------------------------");
                x = 1;
            } else {
                if (confirmacion.equals(negativo)) {
                    System.out.println("----------------------------------");
                    System.out.println("El diagnóstico no sera cambiado");
                    System.out.println("----------------------------------");
                    x = 1;
                } else {
                    System.out.println("Ingrese un valor valido");
                }
            }
        }
    }

    public void eliminarDiagnostico()
    {
        System.out.println("Ingrese el numero del diagnostico que desea eliminar");
        int numDiag = sc.nextInt();
        System.out.println("El numero de diagnostico corresponde a:");
        System.out.println("Cliente: " + nombreDiagnostico[numDiag]);
        System.out.println("Mascota: "+ nombreMascotaDagnostico[numDiag]);
        System.out.println("Con el siguiente diagnostico: " + diagnostico[numDiag]);
        System.out.println("¿Desea eliminar este diagnostico?(S/N)");

        int x = 0;
        while(x == 0)
        {
            String confirmacion = sc.next();
            if (confirmacion.equals(positivo)){
                diagnostico[numDiag] = "No existe diagnostico";
                System.out.println("----------------------------------");
                System.out.println("El diagnostico ha sido eliminado.");
                System.out.println("----------------------------------");
                x = 1;
            }else{
                if (confirmacion.equals(negativo))
                {
                    System.out.println("----------------------------------");
                    System.out.println("El diagnostico no sera eliminado");
                    System.out.println("----------------------------------");
                    x = 1;
                }else{
                    System.out.println("Ingrese un valor valido");
                }
            }

        }


    }
    public void mostrarDiagnosticos()
    {
        if (cont2 == 0)
        {
            System.out.println("No hay diagnosticos que mostrar");
        }else {
            for (int i = 1; i < (cont2 + 1); i++) {
                System.out.println("____________________________________________");
                System.out.println("Numero de diagnostico: " + i);
                System.out.println("Nombre del cliente: " + nombreDiagnostico[i]);
                System.out.println("Nombre de la mascota: " + nombreMascotaDagnostico[i]);
                System.out.println("Diagnostico: " + diagnostico[i]);
                System.out.println("____________________________________________");
                System.out.println("");
            }
        }
    }

}
