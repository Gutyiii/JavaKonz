package bejarhato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Nevsor implements Iterable<Ember>{
    
    private ArrayList<Ember> lista;

    public Nevsor() {
        lista = new ArrayList<>();
        lista.add(new Ember("Péter", 33));
        lista.add(new Ember("Pál", 23));
        lista.add(new Ember("Petra", 19));
        lista.add(new Ember("Pisti", 42));
    }

    public List<Ember> getUnModLista(){
        return Collections.unmodifiableList(lista);
    }
    
    public ArrayList<Ember> getMasolatLista(){
        return new ArrayList<>(lista);
    }
    
    public Ember[] getEmberek(){
        Ember[] tomb = new Ember[lista.size()];
        int i = 0;
        for (Ember ember : lista) {
            tomb[i++] = ember;
        }
        return tomb;
    }
    
    @Override
    public Iterator<Ember> iterator() {
        return lista.iterator();
    }
}
