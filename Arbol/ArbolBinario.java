package Arbol;

import Trabajadores.Trabajador;

public class ArbolBinario {
    protected Nodo raiz;
    public ArbolBinario() {
        raiz = null;
    }
    
    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }
  
    public Nodo raizArbol() {
        return raiz;
    }

    boolean esVacio() {
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        return new Nodo(ramaIzdo, (Trabajador) valor, ramaDcho);
    }
   
    public void inOrden(Nodo r){
        if (r!= null){
            inOrden(r.izq);
            System.out.println("Dato: "+ r.dato.toString());
            inOrden(r.der);
        }
    }

    public void preOrden (Nodo r){
        if((Nodo)r!= null){
            System.out.println("Dato: "+r.dato.toString());
            preOrden(r.izq);
            preOrden(r.der);
        }
    }

    public void postOrden(Nodo r){
        if(r!= null){
            postOrden(r.izq);
            postOrden(r.der);
            System.out.println("Dato: "+r.dato.toString());
        }
    }


    public Nodo busqueda(int datoBusqueda){ 
   
        Nodo aux = this.raiz;
   
        while(aux.dato.getId() != datoBusqueda)
        {
            if(datoBusqueda < aux.dato.getId()){
                aux = aux.izq;
            }else{
                aux = aux.der;
            }
            if(aux ==null){
                System.out.println("ID incorrecto, vuelva a intentarlo");
                   return null;
            }
        }
        System.out.println("Dato encontrado");
        return aux;
    }

    public void agregarNodo(Trabajador elemento){
        Nodo nuevo = new Nodo((Trabajador) elemento);
       if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo aux = raiz;
            Nodo papa;
             while(true){
                papa = aux;
                if(elemento.getId()< aux.dato.getId()) {
                    //Apunta a la izquierda
                    aux = aux.izq;
                    if(aux == null){
                        papa.izq = nuevo;
                        return;
                    }
                }else{
                    aux = aux.der;
                    if(aux == null){
                        papa.der = nuevo;
                        return;
                    }
                }

            }

        }
    }
    
    public void eliminar(int id){
        Nodo x = busqueda(id);
        x.dato = null;
        Nodo aux = new Nodo(this.raiz.izq, this.raiz.dato, this.raiz.der);
        this.raiz = null;  
        eliminarAux(aux);    
    }
    
    public void eliminarAux(Nodo elAux){
        if (elAux != null){
            eliminarAux(elAux.izq);
            if (elAux.dato != null) {
                agregarNodo(elAux.dato);
            }
            eliminarAux(elAux.der);
        }
    }
}
