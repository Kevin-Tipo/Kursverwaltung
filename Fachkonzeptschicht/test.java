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

	public void Letzte_�nderung() throws SQLException{
		helfer.abfrage("SELECT f�cher.Fach, noten.Note_Schriftlich, noten.Note_M�ndlich	FROM noten INNER JOIN f�cher ON noten.Fach_verbindung = f�cher.Fach_ID Order By noten.Letzte_�nderung LIMIT 1");
	}
	
}