/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camino_minimo_lab_datos2;

/**
 *
 * @author danie
 */
public class Funciones {
    
    boolean Colision(Hitbox a, Hitbox b){
        if(a.xmax<b.xmax && a.xmin>b.xmin && a.xmax<b.xmax && a.xmin>b.xmin ){
            return true;
        }
        return false;
    }
}
