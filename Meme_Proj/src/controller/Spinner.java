package controller;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * A class to test spinners.
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 */
public class Spinner
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
    	  /**
    	   * A method to run the spinner frame
    	   */
            public void run()
            {
               SpinnerFrame frame = new SpinnerFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}
