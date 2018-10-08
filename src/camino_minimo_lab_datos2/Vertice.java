/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camino_minimo_lab_datos2;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Vertice {
    String nombre;
    ArrayList listaady = new ArrayList();
    Hitbox hitbox;
    int numero;
    int x;
    int y;
    
    public Vertice(String nom,int num, Hitbox hb, int xx, int yy){
        nombre=nom;
        hitbox=hb;
        numero=num;
        x=xx;
        y=yy;
    }
    
    @Override public String toString(){
        return nombre;
    }
}
