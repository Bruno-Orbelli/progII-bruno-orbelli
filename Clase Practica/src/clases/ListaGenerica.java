package clases;

import excepciones.ElementoInexistenteException;
import excepciones.IndiceMayorQueListaException;
import excepciones.ListaVaciaException;

import java.util.ArrayList;
import java.util.Collections;

public class ListaGenerica<T extends Comparable<T>>{
    private ArrayList<T> lista = new ArrayList<T>();

    public ArrayList<T> getLista() {
        return lista;
    }

    public int getTamañoLista() {
        return this.getLista().size();
    }

    public void agregarElemento(T elem) {
        this.getLista().add(elem);
    }

    public void ordenarLista() {
        Collections.sort(this.getLista());
    }

    public void desordenarLista() {
        Collections.shuffle(this.getLista());
    }

    public void insertarElemento(T elem, int indice) throws IndiceMayorQueListaException {
        try {
            this.getLista().add(indice, elem);
        } catch (IndexOutOfBoundsException e) {
            throw new IndiceMayorQueListaException("El índice especificado es de longitud mayor que la lista.");
        }
    }

    public T obtenerElemento(int indice) throws IndiceMayorQueListaException {
        try {
            return this.getLista().get(indice);
        } catch (IndexOutOfBoundsException e) {
            throw new IndiceMayorQueListaException("El índice especificado es de longitud mayor que la lista.");
        }
    }

    public T obtenerPrimero() throws ListaVaciaException {
        try {
            return this.getLista().get(0);
        } catch (IndexOutOfBoundsException e) {
            throw new ListaVaciaException("La lista no contiene ningún elemento.");
        }
    }

    public T obtenerUltimo() throws ListaVaciaException {
        try {
            return this.getLista().get(this.getTamañoLista() - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new ListaVaciaException("La lista no contiene ningún elemento.");
        }
    }

    public void eliminarElemento(int indice) throws ElementoInexistenteException {
        try {
            this.getLista().remove(indice);
        } catch (IndexOutOfBoundsException e) {
            throw new ElementoInexistenteException("El elemento especificado no se encuentra en la lista.");
        }
    }
}
