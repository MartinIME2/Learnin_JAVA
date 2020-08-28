/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author augus
 */
public class CuentaBanco {

    //1.Atributos
    private int codigo;
    private float saldo;
    private String titular;

    //2.Constructores: tienen el mismo nombre que la clase y no tiene retorno
    //Sirve para inicializar las variables
    public CuentaBanco() {   //Construtor por defecto: Sin parametros

        codigo = 0;//No es necesario a este tipo de datos inicializarlos, java los inicializa en cero
        saldo = 0;
        titular = "Sin definir";//Es necesario inicializarlo para que java no lo inicilice en null
    }

    public CuentaBanco(String titular) {//Contructor con parámetros: necesita el nombre del titular
        codigo = 0;
        saldo = 0;
        this.titular = titular;
    }

    public CuentaBanco(int codigo, float saldo, String titular) { //Puede generarse automatico en insert code
        this.codigo = codigo;
        this.saldo = saldo;
        this.titular = titular;
    }

    //3.Metodos o comportamientos: de acceso y accesores (que y quienes pueden entrar a esta clase y que pueden hacer)
    //Get y Set pueden insertarse mediante el IDE en Insert code
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int cod) {
        codigo = cod;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //4.Comportamientos propios: depositar o extraer dinero
    public void depositar(float monto) {//Las variables son locales al metodo
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }

    public void extraer(float monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
        }

    }

    public String toString() {
        String estado = "Cuenta número: " + codigo + " Titular: " + titular + " Saldo:$ " + saldo;
        return estado;
    }

}
