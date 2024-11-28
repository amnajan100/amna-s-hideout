package dashboard;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HauntedMansionGame extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HauntedMansionGame window = new HauntedMansionGame();
                    window.setVisible(true); 
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public HauntedMansionGame() {
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1792, 1024);

        // my images needed
        ImageIcon originalImage = new ImageIcon(getClass().getResource("/photos/hauntedHouseFinal.png"));
        ImageIcon originalImage2 = new ImageIcon(getClass().getResource("/photos/button1.png"));
        ImageIcon originalImage3 = new ImageIcon(getClass().getResource("/photos/witchPot.png"));
        
        frame.getContentPane().setLayout(null);
        
        JLabel button1img = new JLabel();
        button1img.setBounds(587, 202, 61, 70);
        button1img.setIcon(new ImageIcon(originalImage2.getImage().getScaledInstance(61, 70, java.awt.Image.SCALE_SMOOTH)));
        frame.getContentPane().add(button1img);
        
        JLabel lblNewLabel_2 = new JLabel("How to play");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setBackground(new Color(43, 28, 14));
        lblNewLabel_2.setFont(new Font("Khmer MN", Font.PLAIN, 21));
        lblNewLabel_2.setBounds(668, 223, 134, 31);
        frame.getContentPane().add(lblNewLabel_2);
        
        JButton Door1 = new JButton("Enter Door 1");
        Door1.setForeground(SystemColor.activeCaption);
        Door1.setBorderPainted(false);
        Door1.setContentAreaFilled(false);
        Door1.setOpaque(true);
        Door1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	// get gui class
                HauntedDoorOne guiTestFrame = new HauntedDoorOne();
                guiTestFrame.setVisible(true);
                
            }
        });
        
        Door1.setFont(new Font("Kokonor", Font.PLAIN, 12));
        Door1.setBackground(SystemColor.activeCaptionText);
        Door1.setBounds(625, 614, 111, 23);
        frame.getContentPane().add(Door1);
        
        JLabel ExitLabel = new JLabel("New label");
        ExitLabel.setBackground(new Color(238, 238, 238));
        ExitLabel.setBounds(1167, 202, 76, 70);
        ExitLabel.setIcon(new ImageIcon(originalImage3.getImage().getScaledInstance(76, 55, java.awt.Image.SCALE_SMOOTH)));
        frame.getContentPane().add(ExitLabel);
        
        JLabel lblNewLabel = new JLabel("The Twisted Fate");
        lblNewLabel.setFont(new Font("Kokonor", Font.PLAIN, 43));
        lblNewLabel.setBounds(733, 718, 424, 46);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Conquer the four doors, solve their riddles, and survive the lurking ghosts");
        lblNewLabel_1.setFont(new Font("Khmer MN", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(637, 718, 792, 148);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_2_1 = new JLabel("Exit");
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Khmer MN", Font.PLAIN, 21));
        lblNewLabel_2_1.setBackground(new Color(43, 28, 14));
        lblNewLabel_2_1.setBounds(1136, 235, 134, 23);
        frame.getContentPane().add(lblNewLabel_2_1);
        
        
        JButton Door2 = new JButton("Enter door 2");
        Door2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		// get gui class
        		HauntedDoorTwo guiTestFrame = new HauntedDoorTwo();
                guiTestFrame.setVisible(true);
                
        	}
        });
        Door2.setFont(new Font("Kokonor", Font.PLAIN, 13));
        Door2.setForeground(SystemColor.activeCaption);
        Door2.setBackground(SystemColor.activeCaptionText);
        Door2.setBorderPainted(false);
        Door2.setContentAreaFilled(false);
        Door2.setOpaque(true);
        Door2.setBounds(851, 617, 115, 16);
        frame.getContentPane().add(Door2);
        
        
        JButton door3 = new JButton("Enter door 3");
        door3.setFont(new Font("Kokonor", Font.PLAIN, 13));
        door3.setBackground(SystemColor.activeCaptionText);
        door3.setForeground(SystemColor.menu);
        door3.setContentAreaFilled(false);
        door3.setBorderPainted(false);
        door3.setOpaque(true);
        door3.setBounds(1073, 617, 117, 16);
        frame.getContentPane().add(door3);
        
        JButton door4 = new JButton("door 4");
        door4.setFont(new Font("Kokonor", Font.PLAIN, 13));
        door4.setForeground(SystemColor.menu);
        door4.setBackground(SystemColor.activeCaptionText);
        door4.setBorderPainted(false);
        door4.setContentAreaFilled(false);
        door4.setOpaque(true);
        door4.setBounds(1320, 621, 86, 16);
        frame.getContentPane().add(door4);
        
        
        JButton howtoplaybutton = new JButton("");
        howtoplaybutton.setBorderPainted(false);
        howtoplaybutton.setContentAreaFilled(false);
        howtoplaybutton.setBackground(new Color(255, 255, 255));
        howtoplaybutton.setBounds(577, 206, 79, 66);
        frame.getContentPane().add(howtoplaybutton);
        
        JButton exitButton = new JButton("");
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        exitButton.setBackground(new Color(52, 40, 18));
        exitButton.setBounds(1167, 206, 79, 66);
        frame.getContentPane().add(exitButton);
        exitButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		System.exit(0);
      
        	}
        });
        
        // at bottom
        JLabel lblImage = new JLabel();
        lblImage.setBounds(0, 0, 1792, 1024);
        lblImage.setIcon(new ImageIcon(originalImage.getImage().getScaledInstance(1792, 1024, java.awt.Image.SCALE_SMOOTH)));
        frame.getContentPane().add(lblImage);
        
        frame.setVisible(true);
    }
}
