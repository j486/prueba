/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author jose
 */
public class Prueba {
    
    
    /**
     * 
     * @param saludo 
     */
    public void mostrarsaludo(String saludo){
        System.out.println(saludo);
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba p = new Prueba();
        p.mostrarsaludo("Buenas tardes");
        System.out.println("hi");
                
    }
    
}
