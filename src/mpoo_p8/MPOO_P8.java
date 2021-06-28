/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo_p8;

/**
 * @author Equipo A - MPOO
 */
public class MPOO_P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poligono poligono; //poligono apunta (->) a null 
        poligono = new Poligono();//poligono -> obj creado por Poligono()
        System.out.println(poligono);
        
        Object objeto = poligono;
        //El objeto -> a poligono (su dirección) creado por Poligono
        System.out.println(objeto);
        //Se imprime lo mismo que el poligono de la clase Poligono porque hereda
        //explicitamente de la clase Object
        
        //Una referencia puede ser reasignada a otros objetos   
        poligono = new Triangulo();
        System.out.println(poligono);
        System.out.println(objeto);
        
        objeto = new Cuadrilatero();
        System.out.println(objeto);
        
 //poligono.setBase(); No se puede realizar porque Poligono no tiene este método
        poligono.area();
        
        queTipoEs(poligono);
        
        poligono = new Cuadrilatero();
        queTipoEs(poligono);
        
        System.out.println("\n####### Interfaz #######");
        //Se puede crear una referencia a la interfaz, pero no es posible 
        //instanciarla
        InstrumentoMusical inst;
        
        //A una referencia a la interfaz puede ser asignada cualquier objeto que
        //la implemente
        inst = new Flauta();
        inst.tocar();
        System.out.println(inst.tipoInstrumento());
    }
    
    public static void queTipoEs(Poligono p){
        if (p instanceof Triangulo){
            Triangulo t = (Triangulo) p;
            System.out.println("Triangulo con base "+ t.getBase());
        }else if (p instanceof Cuadrilatero){
            Cuadrilatero c = (Cuadrilatero) p;
            System.out.println("Cuadrilatero");
        }
    }
}
