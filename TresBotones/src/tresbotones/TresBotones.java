/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresbotones;

/**
 *
 * @author Mauricio
 */




public class TresBotones {
    
    
    static int botonActivo = 0;
    
    public static Boolean boton1() throws Exception {
        if (botonActivo != 0)
            throw new Exception();
        botonActivo = 1;
        return true;
    }
    
    public static Boolean boton2() throws Exception {
        if (botonActivo != 1)
            throw new Exception();
        botonActivo = 2;
        return true;
    }
    public static Boolean boton3() throws Exception {
        if (botonActivo != 2)
            throw new Exception();
        botonActivo = 0;
        return true;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pantalla pantalla =  new Pantalla();
        pantalla.setVisible(true);
    }
    
}
