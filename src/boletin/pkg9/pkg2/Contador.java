/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Contador {
    public void calculaSuma(){
    int suma=0;
    int producto=1;
   
    for (int i=10; i<=90 ;i++){
      
      suma= suma+i;
      producto= producto+i;
     
      JOptionPane.showMessageDialog(null,"la suma es: " +suma);
      JOptionPane.showInternalMessageDialog(null,"El producto es: " +producto);  
        
        
    }
    
    }
            
}
