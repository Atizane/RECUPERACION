

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
        return new Nodo(ramaIzdo, valor, ramaDcho);
    }    
   
    public void inOrden(Nodo r){
        if (r!= null){
            inOrden(r.izq);
            System.out.println("Dato: "+ r.dato);
            inOrden(r.der);
        }
    }

    public void inOrdenArbol(Nodo r){
        if (r!= null){
            inOrden(r.izq);
            this.agregarNodo(r, this);
            inOrden(r.der);
        }
    }

   
    public void preOrden (Nodo r){
        if((Nodo)r!= null){
            System.out.println("Dato: "+r.dato);
            preOrden(r.izq);
            preOrden(r.der);
        }
    }

    public void postOrden(Nodo r){
        if(r!= null){
            postOrden(r.izq);
            postOrden(r.der);
            System.out.println("Dato: "+r.dato);
        }
    }


    public Nodo busqueda(int datoBusqueda){ 
   
        Nodo aux = this.raiz;
   
        while(Integer.parseInt((aux.dato).toString())!= datoBusqueda)
        {
            if(datoBusqueda<Integer.parseInt((aux.dato).toString())){
                aux = aux.izq;
            }else{
                aux = aux.der;
            }
            if(aux ==null){
                System.out.println("Dato no encontrado");
                   return null;
            }
        }
        System.out.println("Dato encontrado");
        return aux;
    }

    public void agregarNodo(Object elemento, ArbolBinario busqueda){
        Nodo nuevo = new Nodo(elemento);
       if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo aux = raiz;
            Nodo papa;
             while(true){
                papa = aux;
                if(Integer.parseInt((elemento).toString())<Integer.parseInt((aux.dato).toString())){
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

    

}
