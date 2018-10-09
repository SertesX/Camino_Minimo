/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camino_minimo_lab_datos2;

import java.util.ArrayList;

/**
 *
 * @author ESTU-5K
 */
public class FloydWarshall {

    int[][] M;
    int nVertices;
    int[][] distancia = new int[999][999];
    Vertice[][] recorridos = new Vertice[999][999];

    void llenarMatrizRecorridos(ArrayList<Vertice> v) {
        for (int i = 0; i < nVertices; i++) {
            for (int j = 0; j < nVertices; j++) {
                for (Vertice vertice : v) {
                    if (j== vertice.numero){
                        recorridos[i][j] = vertice;
                    }
                }
                
            }
        }
    }

    void llenarMatrizDistancia() {
        int infinito = 999;
        for (int i = 0; i < nVertices; i++) {
            for (int j = 0; j < nVertices; j++) {
                if (M[i][j] != 0) {
                    distancia[i][j] = M[i][j];
                } else if (i == j) {
                    distancia[i][j] = 0;
                } else {
                    distancia[i][j] = infinito;
                }
            }
        }
    }

    void algoritmoFloydWarshall() {
        int tmp;
        for (int k = 0; k < nVertices; k++) {
            for (int i = 0; i < nVertices; i++) {
                for (int j = 0; j < nVertices; j++) {
                    tmp = distancia[i][k] + distancia[k][j];
                    if (tmp < distancia[i][j]) {
                        distancia[i][j] = tmp;
                        recorridos[i][j] = recorridos[i][k];
                    }
                }
            }
        }
    }
}
