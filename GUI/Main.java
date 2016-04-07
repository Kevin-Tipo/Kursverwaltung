package GUI;

import java.awt.EventQueue;

import Datenerhaltungsschicht.SQL;
import Fachkonzeptschicht.test;

public class Main {

	public static void main(String[] args) {
		
		SQL.SQL_aufrufen();
		
//		test.helfer();
		
		
		// Oberfläche erstellen
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Gui frame = new Gui();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
	}

}
