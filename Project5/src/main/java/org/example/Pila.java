package org.example;

import javax.swing.*;

public class Pila {
    
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //Método para saber cuando la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    //Método para insertar un nodo en la pila
    public void insertarNodo(int nodo){
        Nodo nuevo_nocdo = new Nodo(nodo);
        nuevo_nocdo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nocdo;
        tamano++;
    }        
    
    //Método para eliminar un nodo de la pila
    public int eliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    //Método para conocer cual es el último valor ingresado
    public int mostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
    //Método para conocer el tamaño de la Pila
    public int tamanoPila(){
        return tamano;
    }
    
    //Método para vaciar la Pila
    public void vaciarPila(){
        while (!PilaVacia()) {
            eliminarNodo();
        }
    }
    
    //Método para mostrar el contenido de la pila
    public void mostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
