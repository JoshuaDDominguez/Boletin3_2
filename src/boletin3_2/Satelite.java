/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2;

/**
 *
 * @author jdominguezdominguez
 */
public class Satelite{
 
        private double meridiano;
        private double paralelo;
        private double distanciaTerra;

public void Satelite(){

    distanciaTerra = 0;
    meridiano = 0;
    paralelo = 0;
}

public Satelite ( double m, double p , double d ){

meridiano = m;
paralelo = p;
distanciaTerra = d;

}
public void verPosicion ( ) {

System.out.println ("o satelite atopase no paralelo "+paralelo+", meridiano "+meridiano+" e a unha distancia da terra de " +distanciaTerra);
}
}
