package Fachkonzeptschicht;

import java.sql.SQLException;

import Datenerhaltungsschicht.SQL;
import GUI.Gui;

public class test{
	
	SQL helfer = new SQL();
	Gui eintragen = new Gui();
	
	public void Eintragen_uebersicht() throws SQLException {
		helfer.abfrage("select * from noten where");
	}

	public void Eintragen_uebersicht(SQL ubergabe) throws SQLException {
		ubergabe.abfrage("select * from noten where");
	}

	public void Letzte_änderung() throws SQLException{
		helfer.abfrage("SELECT fächer.Fach, noten.Note_Schriftlich, noten.Note_Mündlich	FROM noten INNER JOIN fächer ON noten.Fach_verbindung = fächer.Fach_ID Order By noten.Letzte_Änderung LIMIT 1");
	}
	
}