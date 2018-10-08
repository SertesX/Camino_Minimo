/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camino_minimo_lab_datos2;

/**
 *
 * @author ESTU-5K
 */
public class Arista {
    Vertice origen;
    Vertice destino;
    int peso;

    public Arista(Vertice o, Vertice d, int p) {
        origen = o;
        destino = d;
        peso = p;
    }
}
