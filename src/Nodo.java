import java.util.ArrayList;
import java.util.List;

public class Nodo<T> {
    private T dato;
    private List<Nodo<T>> adyacentes;
    
    public Nodo(T dato) {
        this.dato = dato;
        this.adyacentes = new ArrayList<>();
    }
    
    public T getDato() {
        return dato;
    }
    
    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public List<Nodo<T>> getAdyacentes() {
        return adyacentes;
    }
    
    public void agregarAdyacente(Nodo<T> nodo) {
        if (!adyacentes.contains(nodo)) {
            adyacentes.add(nodo);
        }
    }
    
    public void removerAdyacente(Nodo<T> nodo) {
        adyacentes.remove(nodo);
    }
    
    @Override
    public String toString() {
        return dato.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Nodo<?> nodo = (Nodo<?>) obj;
        return dato.equals(nodo.dato);
    }
    
    @Override
    public int hashCode() {
        return dato.hashCode();
    }
}

