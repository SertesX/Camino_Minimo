/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camino_minimo_lab_datos2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Funciones {
    
    public void Dibujar(Graphics g, ArrayList<Vertice> vertices, ArrayList<Arista> aristas, int r, Font fuente) {
        for (Arista a : aristas) {
            g.setFont(fuente);
            g.drawLine(a.origen.x, a.origen.y, a.destino.x, a.destino.y);
            g.setFont(new Font(Integer.toString(a.peso), Font.BOLD,22));
            g.drawString(Integer.toString(a.peso), ((a.origen.x) + (a.destino.x)) / 2, ((a.origen.y) + (a.destino.y)) / 2);  
        }
        g.setFont(fuente);
        for (Vertice v : vertices) {
            g.setColor(Color.yellow);
            g.fillOval(v.x - (r / 2), v.y - (r / 2), r, r);
            g.setColor(Color.black);
            g.drawOval(v.x - (r / 2), v.y - (r / 2), r, r);
            g.drawString(v.nombre, v.x, v.y+30);
        }
    }
}
