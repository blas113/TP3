import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRACTICO III - GRAFOS ===\n");
        
        
        Persona p1 = new Persona("Ana", 25);
        Persona p2 = new Persona("Juan", 30);
        Persona p3 = new Persona("María", 28);
        Persona p4 = new Persona("Carlos", 35);
        Persona p5 = new Persona("Laura", 22);
        
        
        Nodo<Persona> nodo1 = new Nodo<>(p1);
        Nodo<Persona> nodo2 = new Nodo<>(p2);
        Nodo<Persona> nodo3 = new Nodo<>(p3);
        Nodo<Persona> nodo4 = new Nodo<>(p4);
        Nodo<Persona> nodo5 = new Nodo<>(p5);
        
        
        System.out.println("--- Grafo NO DIRIGIDO ---");
        Grafo<Persona> grafo = new Grafo<>(false);
        
       
        grafo.agregarArista(nodo1, nodo2);
        grafo.agregarArista(nodo2, nodo3);
        grafo.agregarArista(nodo1, nodo4);
        grafo.agregarArista(nodo3, nodo5);
        grafo.agregarArista(nodo4, nodo5);
        
        System.out.println("\n1. RECORRIDO DFS (Depth-First Search):");
        List<Nodo<Persona>> dfs = grafo.recorrerDFS(nodo1);
        for (int i = 0; i < dfs.size(); i++) {
            System.out.println("   " + (i + 1) + ". " + dfs.get(i).getDato());
        }
        
        System.out.println("\n2. RECORRIDO BFS (Breadth-First Search):");
        List<Nodo<Persona>> bfs = grafo.recorrerBFS(nodo1);
        for (int i = 0; i < bfs.size(); i++) {
            System.out.println("   " + (i + 1) + ". " + bfs.get(i).getDato());
        }
        
        System.out.println("\n3. MATRIZ DE ADYACENCIA:");
        grafo.imprimirMatrizAdyacencia();
      
        System.out.println("\n\n--- Grafo DIRIGIDO ---");
        Grafo<Persona> grafoDirigido = new Grafo<>(true);
        
        
        Nodo<Persona> nodo1D = new Nodo<>(p1);
        Nodo<Persona> nodo2D = new Nodo<>(p2);
        Nodo<Persona> nodo3D = new Nodo<>(p3);
        Nodo<Persona> nodo4D = new Nodo<>(p4);
        
       
        grafoDirigido.agregarArista(nodo1D, nodo2D);
        grafoDirigido.agregarArista(nodo2D, nodo3D);
        grafoDirigido.agregarArista(nodo1D, nodo4D);
        grafoDirigido.agregarArista(nodo4D, nodo2D);
        
        System.out.println("\n1. RECORRIDO DFS (desde nodo1):");
        List<Nodo<Persona>> dfsD = grafoDirigido.recorrerDFS(nodo1D);
        for (int i = 0; i < dfsD.size(); i++) {
            System.out.println("   " + (i + 1) + ". " + dfsD.get(i).getDato());
        }
        
        System.out.println("\n2. RECORRIDO BFS (desde nodo1):");
        List<Nodo<Persona>> bfsD = grafoDirigido.recorrerBFS(nodo1D);
        for (int i = 0; i < bfsD.size(); i++) {
            System.out.println("   " + (i + 1) + ". " + bfsD.get(i).getDato());
        }
        
        System.out.println("\n3. MATRIZ DE ADYACENCIA:");
        grafoDirigido.imprimirMatrizAdyacencia();
        
        // FACUNDO BUTAZOOOOOOOO
      
    }
}
