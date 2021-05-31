/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo extends JFrame {
	JLabel jl;
	JPanel jp;
	public Demo() {
		jp = new JPanel();
		for(int i = 1;i <= 9;i ++) {
			int z = i - 1;
			int l = i + 1;
			if(i == 1) {
				jl = new JLabel(new ImageIcon("/Volumes/KINGSTON/4/407/Assignment2/image/1.JPG"));
			}
				JButton jb1 = new JButton("First");
				jb1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jl.setIcon(new ImageIcon("/Volumes/KINGSTON/4/407/Assignment2/image/1.JPG"));
					}
				});
				jp.add(jb1);
				JButton jb2 = new JButton("Previous");
				
				jb2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jl.setIcon(new ImageIcon("/Volumes/KINGSTON/4/407/Assignment2/image/1.JPG"));
					}
				});
				jp.add(jb2);
				JButton jb3 = new JButton("Next");
				jb3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jl.setIcon(new ImageIcon("/Volumes/KINGSTON/4/407/Assignment2/image/1.JPG"));
					}
				});
				jp.add(jb3);
				JButton jb4 = new JButton("Last");
				jb4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jl.setIcon(new ImageIcon("/Volumes/KINGSTON/4/407/Assignment2/image/1.JPG"));
					}
				});
				jp.add(jb4);
		}
		this.setLocation(120,500);
		this.setSize(600,800);
		this.setLayout(new BorderLayout());
		this.add(jl);
		this.add(jp,BorderLayout.SOUTH);
		this.setTitle("Book");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Demo();
	}
}
*/