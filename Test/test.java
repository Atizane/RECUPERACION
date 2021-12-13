package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import Arbol.ArbolBinario;
import Trabajadores.Trabajador;

public class test {
    public static void main(String[] args) throws NumberFormatException, IOException {
        try{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
            ArrayList <Integer> idLista = new ArrayList<Integer>();

        ArbolBinario nuevoArbol = new ArbolBinario();
        nuevoArbol.agregarNodo(new Trabajador("Ricardo", "Viñeyra", "Rodriguez", 24, "Masculino", 5,1100, "Empleado"));
        nuevoArbol.agregarNodo(new Trabajador("Fabiola", "Viñeyra", "Rodriguez", 26, "Femenino", 3,1500, "Empleado"));
        nuevoArbol.agregarNodo(new Trabajador("Alejandro", "Viñeyra", "Rodriguez", 24, "Masculino", 8,1100, "Empleado"));
        nuevoArbol.agregarNodo(new Trabajador("Andres", "Viñeyra", "Rodriguez", 20, "Masculino", 4,1100, "Empleado"));
        nuevoArbol.agregarNodo(new Trabajador("Ariana", "Viñeyra", "Rodriguez", 27, "Femenino", 1,1100, "Empleado"));
        nuevoArbol.agregarNodo(new Trabajador("Antonio", "Viñeyra", "Gonzalez", 45, "Masculino", 9,1100, "Empleado"));
        nuevoArbol.agregarNodo(new Trabajador("Eduardo", "Rodriguez", "Quintero", 78, "Masculino", 6,1100, "Empleado"));
        boolean control = true;
        do {
          menu();
        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la manera en que desea ver la lista de Trabajadores.\n 1)RID\n 2)IRD\n 3)IDR\n");
                int opcion2 = Integer.parseInt(br.readLine());
                switch (opcion2) {
                    case 1:
                    nuevoArbol.preOrden(nuevoArbol.raizArbol());
                        break;
                    case 2:
                    nuevoArbol.inOrden(nuevoArbol.raizArbol());
                    break;
                    case 3:
                    nuevoArbol.postOrden(nuevoArbol.raizArbol());
                    break;
                    default:
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
                control = true;
                break;
                case 2:
                System.out.println("¿Que trabajador desea modificar?");
                int datoBusqueda = Integer.parseInt(br.readLine());
                Trabajador m = null;
                if(nuevoArbol.busqueda(datoBusqueda) != null) m = nuevoArbol.busqueda(datoBusqueda).valorNodo();

                if (m != null){
                    System.out.println("¿Que campo desea modificar?");
                    System.out.println("1.- Nombre\n 2. Apellido Paterno\n 3.- Apellido Materno\n 4.- Edad\n 5.- Genero\n 6.- Sueldo\n 7.- Puesto\n");
                    opcion = Integer.parseInt(br.readLine());
                    String newDato = "";
                    int newEdad = 0;
                    Double newSueldo = 0.0;

                    System.out.println("Introduce el nuevo dato.");

                    if (opcion == 1||opcion == 2||opcion == 3 || opcion == 5|| opcion == 7) newDato = (br.readLine());
                    else if (opcion == 4) newEdad = Integer.parseInt(br.readLine());
                    else if (opcion == 6) newSueldo = Double.parseDouble(br.readLine());

                    switch (opcion)
                    {
                        case 1: m.setNombre(newDato); break;
                        case 2: m.setApellidoPaterno(newDato); break;
                        case 3: m.setApellidoMaterno(newDato); break;
                        case 4: m.setEdad(newEdad); break;
                        case 5: m.setGenero(newDato); break;
                        case 6: m.setSueldo(newSueldo); break;
                        case 7: m.setPuesto(newDato); break;
                    }
                }
                System.out.println("----------------");
                break;
                case 3:
                System.out.println("Ingrese el nombre del Trabajador: ");
                String nombre = (br.readLine());
                System.out.println("Ingrese el apellido paterno:");
                String apellidoPaterno = (br.readLine());
                System.out.println("Ingrese el apellido materno:");
                String apellidoMaterno = (br.readLine());
                System.out.println("Ingrese su edad actual:");
                int edad = Integer.parseInt(br.readLine());
                System.out.println("Masculino o Femenino:");
                String genero = (br.readLine());
                System.out.println("Sueldo:");
                double sueldo = Double.parseDouble(br.readLine());
                System.out.println("Puesto:");
                String puesto = (br.readLine());

                Random x = new Random();
                int id = 1000 + x.nextInt(8999);
                while(idLista.contains(id)) id = 1000 + x.nextInt(8999);

                nuevoArbol.agregarNodo(new Trabajador(nombre, apellidoPaterno, apellidoMaterno, edad, genero, id, sueldo, puesto));
                break;

                case 4: System.out.println("Introduce el ID que desea eliminar:");
                int idAux = Integer.parseInt(br.readLine());
                if (nuevoArbol.busqueda(idAux) != null){
                    System.out.println("Estas seguro que desea eliminar el ID #" + idAux);
                    System.out.println("1.- Si\n2.- No");
                    opcion = Integer.parseInt(br.readLine());
                    if (opcion == 1)
                    nuevoArbol.eliminar(idAux);
                    System.out.println("Consulta tu lista actualizada...");
                }
                break;
                
                case 5:
                System.out.println("******** HASTA LUEGO...*********");
                control = false;
                break;
            default:
            System.out.println("Ingrese una opción valida");
                break;
        }  
        } while (control);
    }
    catch(Exception e){
        System.out.println("La opcion que desea utilizar no es correcto.");
    }
    
    }
    public static void menu(){
        System.out.println("********** BIENVENIDO **********\n ¿Qué desea hacer?\n1.-Consultar Trabajadores\n2.-Modificar Trabajador \n3.-Agregar Trabajador\n4.-Eliminar Trabajador\n5.-SALIRl");
        System.out.println("********************************");
    }
}