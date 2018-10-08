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
public class Hitbox {
    int xmin;
    int xmax;
    int ymin;
    int ymax;
    
    public Hitbox(int x,int xx,int y,int yy){
        xmin=x;
        xmax=xx;
        ymin=y;
        ymax=yy;
    }
}
