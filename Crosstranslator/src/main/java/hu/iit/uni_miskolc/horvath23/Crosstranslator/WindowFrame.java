package hu.iit.uni_miskolc.horvath23.Crosstranslator;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class WindowFrame extends JFrame {

	private static final long serialVersionUID = -351798560130670466L;
	private final Listener listener;
	private JFrame mainFrame;
	private JTextArea inputMessagePanel;
	private JTextArea outputMessagePanel;
	private JLabel label;
	private JButton toPhp, toJava, toJavaScript, toC, toPython;
	private JPanel buttonPanel;
	private String inputText;
	
	WindowFrame() {
		listener = new Listener();
		mainFrame = new JFrame();
		toPhp = new JButton("PHP");
		toPhp.addActionListener((e) -> {
			inputText = inputMessagePanel.getText();
			outputMessagePanel.setText(listener.scanText(inputText, "PHP").toString());
		});
		toJava = new JButton("Java");
		toJava.addActionListener((e) -> {
			inputText = inputMessagePanel.getText();
			outputMessagePanel.setText(listener.scanText(inputText, "Java").toString());
		});
		toJavaScript = new JButton("JavaScript");
		toJavaScript.addActionListener((e) -> {
			inputText = inputMessagePanel.getText();
			outputMessagePanel.setText(listener.scanText(inputText, "JavaScript").toString());
		});
		toC = new JButton("C");
		toC.addActionListener((e) -> {
			inputText = inputMessagePanel.getText();
			outputMessagePanel.setText(listener.scanText(inputText, "C").toString());
		});
		toPython = new JButton("Python");
		toPython.addActionListener((e) -> {
			inputText = inputMessagePanel.getText();
			outputMessagePanel.setText(listener.scanText(inputText, "Python").toString());
		});
		label = new JLabel("VRL nyelv feldolgozása");
		inputMessagePanel = new JTextArea("Ide add meg a VRL kódot!");
		outputMessagePanel = new JTextArea();
		
		buttonPanel = new JPanel();
		
		mainFrame.setBounds(100, 100, 720, 480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setGUI();
		mainFrame.setVisible(true);
	}
	
	void setGUI() {
		mainFrame.getContentPane().setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.Y_AXIS));
		mainFrame.getContentPane().setBackground(Color.decode("#DEB877"));
				
		label.setFont(new java.awt.Font("Courier", java.awt.Font.BOLD,20));
		label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		mainFrame.getContentPane().add(label);
		
		mainFrame.getContentPane().add(inputMessagePanel);
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		buttonPanel.add(toPhp);
		buttonPanel.add(toJava);
		buttonPanel.add(toJavaScript);
		buttonPanel.add(toC);
		buttonPanel.add(toPython);

		mainFrame.getContentPane().add(buttonPanel);
		
		outputMessagePanel.setEditable(false);
		mainFrame.getContentPane().add(outputMessagePanel);		
	}

	public static void main(String[] args) {
		new WindowFrame();
	}
}
