package cl.duoc.redessociales.Listas;

import cl.duoc.redessociales.DTO.Twitter;
import java.util.ArrayList;

public class listaTwitter {
    private ArrayList<Twitter> lista;

    public listaTwitter(ArrayList<Twitter> lista) {
        this.lista = lista;
    }
    
    public listaTwitter() {
        this.lista = new ArrayList();
    }

    public ArrayList<Twitter> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Twitter> lista) {
        this.lista = lista;
    }
    
    public void AgregarTwitter(Twitter tw){
        this.lista.add(tw);
    }
    public void EliminarTwitter(Twitter tw){
        this.lista.remove(tw);
    }
    public void ReemplazarTwitter(int indice, Twitter tw){
        this.lista.set(indice, tw);
    }
    public Twitter ObtenerTwitter(int indice){
        return this.lista.get(indice);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Twitter obj : this.lista){
            sb.append(obj);
        }
        return sb.toString();
    }
}
