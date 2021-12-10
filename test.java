
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import ARBOLESyo.arbolbinario.ArbolBinario;
// import ARBOLESyo.arbolbinario.Nodo;

public class test {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        ArbolBinario nuevoArbol = new ArbolBinario();
        System.out.println("Arbol creado...\n");
        boolean control = true;
        do {
          menu();
        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la manera en que desea ver el árbol binario de busqueda.\n 1)RID\n 2)IRD\n 3)IDR\n");
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
                System.out.println("Ingrese el nodo que desea buscar");
                int datoBusqueda = Integer.parseInt(br.readLine());
                nuevoArbol.busqueda(datoBusqueda);
                System.out.println("----------------");
                break;
                case 3:
                System.out.println("Ingrese el valor que le gustaría agregar al árbol: ");
                int i = Integer.parseInt(br.readLine());
                nuevoArbol.agregarNodo(i, nuevoArbol);
                break;
                
                case 5:
                boolean decision = true;
                while(decision){
                System.out.println("Ingrese los valores del nodo: ");
                int f = Integer.parseInt(br.readLine());
                nuevoArbol.agregarNodo(f, nuevoArbol);
                System.out.println("¡agregado!\n ¿Desea agregar otro?\tsi, no");  
                String leer = br.readLine();

                switch (leer) {
                    case "si":
                        decision = true;
                        break;
                    case "no":
                        decision = false;
                    break;
                    default:
                    System.out.println("Ingrese la respuesta correcta");
                        break;
                }
                System.out.println("----------------");  
                }
                System.out.println("------------------");
                break;
                
                case 7:
                System.out.println("**************ADIOS************");
                control = false;
                break;
            default:
            System.out.println("Ingrese una opción valida");
                break;
        }  
        } while (control);
        
    }
    public static void menu(){
        System.out.println("*****************BIENVENIDO***********\n ¿Qué desea hacer?\n1.- Ver arbol\n2.-Buscar nodo\n3.-Agregar nodos al arbol\n5.- Crear árbol\n7.-SALIRl");

    }

}
