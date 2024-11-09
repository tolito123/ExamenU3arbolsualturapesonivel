package examen3arbolsualturapesonivel;

public class Examen3ArbolSuAlturaPesoNivel {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        
        arbol.insetar( 24, " NUmero1 ");
        arbol.insetar( 12, " NUmero2 ");
        arbol.insetar( 5, " NUmero3 ");
        arbol.insetar( 16, " NUmero4 ");
        arbol.insetar( 20, " NUmero5 ");
        
        arbol.recorrer(arbol.raiz);
        arbol.alturaArbol();
        arbol.imprimir();
        
        arbol.cantidad();
        
        
    }
    
}
