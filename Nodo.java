
public class Nodo {
    protected Object dato;
    protected Nodo izq;
    protected Nodo der;
    
    public Nodo(Object valor) {
        this.dato = valor;
        this.izq = null;
        this.der = null;
    }
    
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        dato = valor;
        izq = ramaIzdo;
        der = ramaDcho;
    }
    public Object valorNodo() {
        return dato;
    }
    public Nodo subarbolIzdo() {
        return izq;
    }
    public Nodo subarbolDecho() {
        return der;
    }
    public void nuevoValor(Object valor) {
        this.dato = valor;
    }
    public void ramaIzdo(Nodo izq) {
        this.izq = izq;
    }
    public void ramaDcho(Nodo der) {
        this.der = der;
    }
}
