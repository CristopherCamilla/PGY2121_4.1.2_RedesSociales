package cl.duoc.redessociales;

import cl.duoc.redessociales.DTO.Instagram;
import cl.duoc.redessociales.Listas.listaInstagram;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        listaInstagram listaIg = new listaInstagram();
        
        Instagram objIg = new Instagram();
        objIg.setId(10);
        objIg.setHistoria("hola mundo");
        objIg.setEstado(true);
        objIg.setUsuario("Seba");
        
        Instagram objIg2 = new Instagram();
        objIg2.setId(12);
        objIg2.setHistoria("hola mundo 2");
        objIg2.setEstado(false);
        objIg2.setUsuario("Seba 2");
        
        listaIg.AgregarInstagram(objIg);
        listaIg.AgregarInstagram(objIg2);
        
        System.out.println(listaIg);
    }
}
