/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

public class AutomovilDiesel extends Automovil{
    double numLitros;
    double costoLitros;
    double descuentoLitros;
    
    public void establecerCostoLitro(double cl) {
        costoLitros = cl;
    }

    public void setDescuentoLitros(double dl) {
        descuentoLitros = dl*numLitros;
    }

     public void establecerNumLitros(double nl) {
        numLitros = nl;
    }
    
    public double obtenerDescuentoLitros() {
        return descuentoLitros;
    }

    public double obtenerNumLitros() {
        return numLitros;
    }
    
    public double obtenerCostoLitro() {
        return costoLitros;
    }
    
    public double obtenerTotalCancelar(){
        return valorCancelar;
    }
    
    @Override
    public void calcularValorCancelar(){
        valorCancelar = costoLitros *(numLitros - descuentoLitros);
    }
    
}
