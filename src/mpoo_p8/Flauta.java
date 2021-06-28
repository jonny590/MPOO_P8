/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo_p8;

/**
 * @author Equipo A - MPOO
 */
public class Flauta extends InstrumentoViento{
    //Puede sobreecribir algún método y agregaar funcionalidades
    public void tocarHimnoALaAlegria(){
        System.out.println("Tocando himno a la alegria");
    }
    
    @Override
    public String tipoInstrumento(){
        return "Flauta";  
    }
}
