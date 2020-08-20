
import static java.lang.Thread.sleep;

/**
 *
 * @author Kaushal
 */
 
public class stopit extends javax.swing.JFrame {

    /**
     * Creates new form stopit
     */
    static int millisecoends = 0;
    static int secoends = 0;
    static int minuites = 0;
    static int hours = 0;
    
    static boolean state = true;
    
    public stopit() {
        initComponents();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        state = true;
        
        Thread t = new Thread()
        {
           public void run()
           {
               for(;;)
               {
               if(state==true)
               {
                  try
                  {
                   sleep(1);
                   
                   if(millisecoends>1000)
                   {
                       millisecoends = 0;
                       secoends++;
                   }
                   if(secoends>60)
                   {
                       millisecoends = 0;
                       secoends=0;
                       minuites++;
                   }
                   if(minuites>60)
                   {
                       millisecoends = 0;
                       secoends=0;
                       minuites=0;
                       hours++;
                   }
                   millisecoend.setText(" : "+millisecoends);
                   
                   millisecoends++;
                   secoend.setText(" : "+secoends);
                   minuite.setText(" : "+minuites);
                   hour.setText(""+hours);
                  }
                  catch(Exception e)
                  {
                      
                  }
               }
               else
               {
                 break;  
               }
             }
           }
        };
      t.start();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        state = false;
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        state = false;
        
        hours = 0;
        minuites = 0;
        secoends = 0;
        millisecoends = 0;
        
        hour.setText(" 00 : ");
        minuite.setText(" 00 : ");
        secoend.setText(" 00 : ");
        millisecoend.setText("00");
    }                                        
   
