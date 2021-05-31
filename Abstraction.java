/**
 * @author Weiwei Qin
 * It plays the same role of the Model in MVC, so there are no further comments.
 */

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Abstraction extends JFrame {
	JPanel jp;
    int currentPage = 1;
    private final ArrayList<ImageIcon> images = new ArrayList<>();
    
	public Abstraction() {
		JButton first = new JButton("First");
	    JButton pre = new JButton("Previous");
	    JButton next = new JButton("Next");
	    JButton last = new JButton("Last");

	    first.setBounds(100,1125,100,40);
        first.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent x) {
                currentPage = 1;
            }
        });
        jp.add(first);
        
        pre.setBounds(300,1125,100,40);
        pre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent x) {
                int newPage = currentPage - 1;
                if (newPage < 1) {
                    newPage = 1;
                }
                currentPage = newPage;
            }
        });
        jp.add(pre);
        
        next.setBounds(500,1125,100,40);
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent x) {
                int newPage = currentPage + 1;
                if (newPage > 9) {
                    newPage = 9;
                }
                currentPage = newPage;
            }
        });
        jp.add(next);
        
        last.setBounds(700,1125,100,40);
        last.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentPage = 9;
            }
        });
        jp.add(last);
        
        ImageIcon empty = new ImageIcon();
        images.add(empty);
        for(int i = 1; i <= 9; i++) {
            String imageName = "/Volumes/KINGSTON/4/407/Assignment2/image/" + i + ".JPG";
            ImageIcon image = new ImageIcon(imageName);
            images.add(image);
        }
	}
	
	public ImageIcon getData(int page) {
        if (page < 1 || page > 9) {
            return null;
        }
        return images.get(page);
    }

    public void setData(int page,ImageIcon image) {
        if (page >= 1 && page <= 9) {
            images.set(page,image);
        }
    }
}