package Arbol;

import Trabajadores.Trabajador;

public class Nodo {

    protected Trabajador dato;
    protected Nodo izq;
    protected Nodo der;
    
    public Nodo (Trabajador valor) {
        this.dato = valor;
        this.izq = null;
        this.der = null;
    }
    
    public Nodo(Nodo ramaIzdo, Trabajador valor, Nodo ramaDcho) {
        dato = valor;
        izq = ramaIzdo;
        der = ramaDcho;
    }
    public Trabajador valorNodo() {
        return dato;
    }
    public Nodo subarbolIzdo() {
        return izq;
    }
    public Nodo subarbolDecho() {
        return der;
    }
    public void nuevoValor (Trabajador valor) {
        this.dato = valor;
    }
    public void ramaIzdo(Nodo izq) {
        this.izq = izq;
    }
    public void ramaDcho(Nodo der) {
        this.der = der;
    }
}
