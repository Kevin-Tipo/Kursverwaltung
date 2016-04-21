package GUI;

import java.awt.EventQueue;
import java.sql.SQLException;

import Datenerhaltungsschicht.SQL;
import Fachkonzeptschicht.test;

public class Main {

	public static void main(String[] args) throws SQLException {
		
//		SQL.SQL_aufrufen();
			test.test();
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
