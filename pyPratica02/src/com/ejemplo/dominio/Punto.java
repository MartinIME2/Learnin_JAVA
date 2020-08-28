/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

import static java.lang.Math.sqrt;

/**
 *
 * @author augus
 */
public class Punto {

    //Atributos:
    float ejeX;
    float ejeY;
    float distOrigen;
    int cuadrante;
    private int ejey;

    //Constructores
    public Punto(float ejeX, float ejeY) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;

    }
    //Metodos

    public float getEjeX() {
        return ejeX;
    }

    public void setEjeX(float ejeX) {
        this.ejeX = ejeX;
    }

    public float getEjeY() {
        return ejeY;
    }

    public void setEjeY(float ejeY) {
        this.ejeY = ejeY;
    }

    //Comportamientos propios
    public String cuadrante(float EjeX, float EjeY) {
        String nota = "s";
        if (!(EjeX != 0 && EjeY != 0)) {
            nota = "El punto se encuentra sobre los ejes";
        } else {
            nota = "El punto NO se encuentra sobre los ejes";
        }
        return nota;
    }

    public float distanciaeje(float EjeX, float EjeY) {
        float xCuadrada = (float) Math.pow(EjeX, 2);
        float yCuadrada = (float) Math.pow(EjeY, 2);
        float dist = (float) sqrt(xCuadrada + yCuadrada);
        return dist;
    }

}
