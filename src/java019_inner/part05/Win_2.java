package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Win_2 extends Frame {
	public Win_2() {
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WinExit());
	}

	class WinExit extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
              System.exit(0);
		}

	}//2하고3하고 한줄차이인가? 점점 간략해지는방법
	
}
