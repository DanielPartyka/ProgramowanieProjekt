package hibernateclass;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//klasa opowiadajaca za wyswietlanie schematu bazy danych

public class PodgladBazy extends JFrame {

	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	
	public static void main(String[] args) {
		try {
			
			PodgladBazy dialog = new PodgladBazy();
			dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			dialog.setVisible(true);
			dialog.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public PodgladBazy() {
		
		setTitle("Podglad Bazy");
		setSize(920,500);
		jl.setIcon(new ImageIcon("C:\\Users\\Galan\\Desktop\\bazadanych.png"));
		jp.add(jl);
		add(jp);
		validate();
	}

}
