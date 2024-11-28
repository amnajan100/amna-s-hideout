package dashboard;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HauntedDoorOne extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HauntedDoorOne frame = new HauntedDoorOne();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public HauntedDoorOne() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1026, 1838);  // Same size as in your code

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);  // Use null layout for absolute positioning
        
        // Images
        ImageIcon originalImage = new ImageIcon(getClass().getResource("/photos/door1fr.png"));

        // JLabel for the message
        JLabel lblNewLabel = new JLabel("You've entered the butcher’s gallery of screams...");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        lblNewLabel.setBounds(290, 52, 479, 48);
        contentPane.add(lblNewLabel);

        // JLabel for the background image (scaled)
        JLabel lblImage = new JLabel();
        lblImage.setBounds(-225, 0, 2277, 1024);
        lblImage.setIcon(new ImageIcon(originalImage.getImage().getScaledInstance(1792, 1024, java.awt.Image.SCALE_SMOOTH)));
        contentPane.add(lblImage);
    }
}
