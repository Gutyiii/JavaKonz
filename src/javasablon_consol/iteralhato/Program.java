package bejarhato;

import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Nevsor ns = new Nevsor();

        List<Ember> lista = ns.getUnModLista();
        for (Ember ember : lista) {
            System.out.println(ember);
        }

        Ember[] emberek = ns.getEmberek();
        for (Ember ember : emberek) {
            System.out.println(ember); 
        }
        
        System.out.println("\n másolat:");
        lista = ns.getMasolatLista();
        for (Ember ember : lista) {
            System.out.println(ember);
        }
        
        System.out.println("\n[0] = Xénia");
        lista.set(0, new Ember("Xénia", 30));
        
        lista = ns.getMasolatLista();
        for (Ember ember : lista) {
            System.out.println(ember);
        }
        
        System.out.println("\nbejárható névsor:");
        for (Ember ember : ns) {
            System.out.println(ember);
        }
        
        System.out.println("\nelemek elérése:");
        Iterator it = ns.iterator();
        Ember e = (Ember)it.next();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("első ember: " + e);
    }
}
