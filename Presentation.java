/**
 * @author Weiwei Qin
 * It's the dumb View we were searching for.
 */

import java.awt.*;
import javax.swing.*;

public class Presentation {
    JLabel jl;
    public Presentation() {
    	for(int i = 0;i < 9;i ++) {
    		if(i == 0) {
    			jl = new JLabel(new ImageIcon("/Volumes/KINGSTON/4/407/Assignment2/image." + 1 + ".jpg"));
    		}
    		jl.setIcon(new ImageIcon("/Volumes/KINGSTON/4/407/Assignment2/image." + i + ".jpg"));
		}
    	JFrame frame = new JFrame();
		frame.setSize(400,800);
		frame.add(jl);
		frame.setVisible(true);
    }
}
