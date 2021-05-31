/**
 * @author Weiwei Qin
 * Plays an enriched role of the Controller in MVC.
 */

import java.awt.*;
import javax.swing.*;

public class Control {
	private Abstraction abstraction = new Abstraction();
    private Presentation presentation = new Presentation();
    private Control control = new Control();

    Control() {
    	control = this;
    }
    
    public void getNum(int newPage) {
        if (newPage < 1 || newPage > 9) {
            return;
        }
        abstraction.getData(newPage);
    }
}
