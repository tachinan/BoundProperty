/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 *
 * @author user
 */
public class Listener1 implements PropertyChangeListener{
    
  
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
       System.out.println("live result: " + evt.getNewValue());
    } 
}
