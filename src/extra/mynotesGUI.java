package extra;

public class mynotesGUI {

	public static void main(String[] args) {
		
		// UNDER HERE
		
		
		package dashboard;

		import java.awt.EventQueue;
		import javax.swing.JFrame;

		public class HauntedDoorTwo {

		    private JFrame frame;

		    /**
		     * Launch the application.
		     */
		    public static void main(String[] args) {
		        EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                try {
		                    HauntedDoorTwo window = new HauntedDoorTwo();
		                    window.frame.setVisible(true);
		                } catch (Exception e) {
		                    e.printStackTrace();
		                }
		            }
		        });
		    }

		    /**
		     * Create the application.
		     */
		    public HauntedDoorTwo() {
		        initialize();
		    }

		    /**
		     * Initialize the contents of the frame.
		     */
		    private void initialize() {
		        frame = new JFrame();
		        frame.setBounds(100, 100, 450, 300);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }
		}

		
		// END HERE
		
		
		
		
		
		

	}

}
