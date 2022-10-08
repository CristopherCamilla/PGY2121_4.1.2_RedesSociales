package cl.duoc.redessociales.Listas;

import cl.duoc.redessociales.DTO.Instagram;
import java.util.ArrayList;

public class listaInstagram {
    private ArrayList<Instagram> lista;
    
    public listaInstagram(){
        lista = new ArrayList();
    }
    public listaInstagram(ArrayList<Instagram> lista){
        this.lista = lista;
    }

    public ArrayList<Instagram> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Instagram> lista) {
        this.lista = lista;
    }
    
    public void AgregarInstagram(Instagram ig){
        this.lista.add(ig);
    }
    
    public void EliminarInstagram(Instagram ig){
        this.lista.remove(ig);
    }
    
    public void ReemplazarInstagram(int indice, Instagram ig){
        this.lista.set(indice, ig);
    }
    
    public Instagram ObtenerInstagram(int indice){
        return this.lista.get(indice);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Instagram obj : this.lista){
            sb.append(obj);
        }
        return sb.toString();
    }
}
