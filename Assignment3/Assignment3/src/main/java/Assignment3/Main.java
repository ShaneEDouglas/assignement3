/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment3;

import com.example.package1.MainGui;
import com.example.package2.TemperatureConverter;
import com.example.package3.Typer;
import javax.swing.SwingUtilities;

/**
 *
 * @author Shane D
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                MainGui mainGui = new MainGui();
//                mainGui.setVisible(true);

//                  TemperatureConverter tempcon = new TemperatureConverter();
//                  tempcon.setVisible(true);
                    
                  Typer type = new Typer();
                  type.setVisible(true);
                
            }
        });
    }
    
}
