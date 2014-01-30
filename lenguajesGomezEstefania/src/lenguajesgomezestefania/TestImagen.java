/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguajesgomezestefania;

/**
 *
 * @author Universidad
 */
public class TestImagen {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos una imagen
        
        Imagen i=new Imagen();
        i.setAlto(-10);
        i.setAncho(-20);
        
        //Imprimiendo el valor del ancho y alto probaremos que no dejo meter valores negativos
        
        System.out.println(i.getAlto());
        System.out.println(i.getAncho());
        
    }
    
}
