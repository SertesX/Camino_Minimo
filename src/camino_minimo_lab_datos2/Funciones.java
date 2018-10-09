/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camino_minimo_lab_datos2;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Funciones {
    
    public void Dibujar(Graphics g, ArrayList<Vertice> vertices, ArrayList<Arista> aristas, int r, Font fuente) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 2000, 1000);
        g.setColor(Color.black);
        FontMetrics fm = g.getFontMetrics();
        int largostring;
        for (Arista a : aristas) {
            g.setFont(fuente);
            g.drawLine(a.origen.x, a.origen.y, a.destino.x, a.destino.y);
            g.setFont(new Font(Integer.toString(a.peso), Font.BOLD,14));
            g.setColor(Color.yellow);
            String s=Integer.toString(a.peso);
            int si=s.length();
            largostring = fm.stringWidth(Integer.toString(a.peso));
            g.setColor(Color.black);
            g.drawString(Integer.toString(a.peso), ((a.origen.x) + (a.destino.x)) / 2-largostring/2, ((a.origen.y) + (a.destino.y)) / 2);  
        }
        g.setFont(fuente);
        for (Vertice v : vertices) {
            largostring = fm.stringWidth(v.nombre);
            g.setColor(Color.yellow);
            g.fillOval(v.x - (r / 2), v.y - (r / 2), r, r);
            g.setColor(Color.black);
            g.drawOval(v.x - (r / 2), v.y - (r / 2), r, r);
            g.setColor(Color.white);
            g.fillRect(v.x-largostring/2-4, v.y+15, largostring+6, 20);
            g.setColor(Color.black);
            g.drawRect(v.x-largostring/2-4, v.y+15, largostring+6, 20);
            g.drawString(v.nombre, v.x-largostring/2, v.y+30);
        }
    }
    
    public void Aggady(Vertice v,Arista a,ArrayList<Vertice> vertices){
        for (Vertice ve : vertices) {
            if (ve.equals(v)) {
                ve.listaady.add(a);
            }
        }
    }
    
    public void Matrizad(ArrayList<Vertice> vertices, int[][] M,int numver){
        for (int k = 0; k < numver; k++) {
            for (int l = 0; l < numver; l++) {
                M[k][l]=9999;
            }
            M[k][k]=0;
        }
        for (Vertice v : vertices) {
            for (Arista a : v.listaady) {
                M[v.numero][a.destino.numero]=a.peso;
            }
        }
    }
    
    
}
