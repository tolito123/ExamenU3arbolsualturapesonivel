package examen3arbolsualturapesonivel;

public class Nodo {
    String dato;
    public Nodo izquierda, derecha,padre;
    public int llave;
    public Object valor;
    
    public Nodo(int indice){
        llave=indice;
        derecha=null;
        izquierda=null;
        valor=null;
        padre=null;
        
    }
    public String getDato(){
        return dato;
    }
    public void setDato(String dato){
        this.dato=dato;
    }
    public Nodo getizquierda(){
        return izquierda;
    }
    public void setizquierda(Nodo izquierda){
        this.izquierda=izquierda;
    }
    public Nodo getderecha(){
        return derecha;
    }
    public void setderecha(Nodo derecha){
        this.derecha=derecha;
    }
    
}
