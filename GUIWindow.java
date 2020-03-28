

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
//import java.applet.Applet;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIWindow extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1759652105697414380L;
	/**
	 * 
	 */
	Baja1 myBaja = new Baja1();
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIWindow window = new GUIWindow();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Century", Font.PLAIN, 14));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{14, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblBajabot = new JLabel("\t\t\t\t\t\t\t\t\t\tBajaBot");
		lblBajabot.setForeground(Color.GREEN);
		lblBajabot.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblBajabot.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblBajabot = new GridBagConstraints();
		gbc_lblBajabot.insets = new Insets(0, 0, 5, 0);
		gbc_lblBajabot.anchor = GridBagConstraints.NORTH;
		gbc_lblBajabot.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBajabot.gridx = 0;
		gbc_lblBajabot.gridy = 0;
		frame.getContentPane().add(lblBajabot, gbc_lblBajabot);
		
		JLabel lblPleaseEnterThe = new JLabel("Please enter the following information from your receipt:");
		lblPleaseEnterThe.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblPleaseEnterThe = new GridBagConstraints();
		gbc_lblPleaseEnterThe.insets = new Insets(0, 0, 5, 0);
		gbc_lblPleaseEnterThe.gridx = 0;
		gbc_lblPleaseEnterThe.gridy = 1;
		frame.getContentPane().add(lblPleaseEnterThe, gbc_lblPleaseEnterThe);
		
		JLabel lblNewLabel = new JLabel("Store Location Number:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == textField){
					myBaja.storeNumber = textField.getText();
				}
			}
		});
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 4;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date (format-> ##/##/####):");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 5;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == textField_1){
					myBaja.date = textField_1.getText();
				}
			}
		});
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 6;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myBaja.storeNumber = textField.getText();
				myBaja.date = textField_1.getText();
				myBaja.invokeBrowser();
			}
		});
		btnSubmit.setFont(new Font("Calibri", Font.BOLD, 14));
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 0);
		gbc_btnSubmit.gridx = 0;
		gbc_btnSubmit.gridy = 7;
		frame.getContentPane().add(btnSubmit, gbc_btnSubmit);
		
	}

}
