package examen3arbolsualturapesonivel;

public class Arbol {
    public Nodo raiz;
    int altura;
    String[] niveles;
    int cant;
    
    public Arbol(){
        this.raiz=null;
    }
    
    public void insetar (int i, Object numN){
        Nodo n = new Nodo(i);
        n.valor=numN;
        
        if (raiz==null){
            raiz =n;
        }else{
            Nodo aux = raiz;
            while(aux != null){
                n.padre=aux;
                if(n.llave >= aux.llave){
                    aux=aux.derecha;
                }else{
                    aux=aux.izquierda;
                }
            }
            
            if(n.llave<n.padre.llave){
                n.padre.izquierda=n;
            }else{
                n.padre.derecha=n;
            }
        }
    }
    
    public void recorrer(Nodo n){
        if (n != null){
            recorrer(n.izquierda);
            System.out.println(""+n.llave+" "+n.valor);
            recorrer(n.derecha);
        }
    }
    
    public int alturaArbol(){
        altura=0;
        alturaArbol(raiz,0);
        return altura;
    }
    private void alturaArbol(Nodo pivote,int nivel){
        if(pivote != null){
            alturaArbol(pivote.getizquierda(),nivel+1);
            if (nivel > altura){
                altura=nivel;
            }
            alturaArbol(pivote.getderecha(),nivel+1);
        }
    }
    public void imprimir(){
        niveles = new String[altura+1];
        int total=0;
        
        imprimir(raiz,0);
        for (int i = 0; i < niveles.length; i++) {
            System.out.println(niveles[i]+"En el nivel: "+i);            
           total=i; 
        }
        System.out.println("La altura total es: "+total);
    }
    
    public void imprimir(Nodo pivote, int nivel2){
        if(pivote!=null){
            niveles[nivel2]=pivote.valor+", "+((niveles[nivel2]!=null)?niveles[nivel2]:"");
            imprimir(pivote.getderecha(),nivel2+1);
            imprimir(pivote.getizquierda(),nivel2+1);
        }
    }
    
    public int cantidad() {
        cant = 0;
        cantidad(raiz);
        return cant;
    }

    private void cantidad(Nodo reco) {
        if (reco != null) {
            cant++;
            cantidad(reco.getizquierda());
            cantidad(reco.getderecha());
            System.out.println("La cantidad de nodos son : "+cant);
        }
        
    }

    private void cantidadNodosHoja(Nodo reco) {
        if (reco != null) {
            if (reco.getizquierda() == null && reco.getderecha() == null) {
                cant++;
            }
            cantidadNodosHoja(reco.getizquierda());
            cantidadNodosHoja(reco.getderecha());
            
        }
        
    }

    public int cantidadNodosHoja() {
        cant = 0;
        cantidadNodosHoja(raiz);
        return cant;
        
    }
    
    
    
}
