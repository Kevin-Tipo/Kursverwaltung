package Datenerhaltungsschicht;

import java.sql.*;
public class SQL {
	
	public SQL(){
		
	}
		
	public ResultSet abfrage(String befehl) throws SQLException{
		Connection MyConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kursverwaltung","root","");
		Statement fragMichWas = MyConnection.createStatement();
		ResultSet ergebnis = fragMichWas.executeQuery(befehl);
		return ergebnis;
	}	

	
	
	public void Verbindung() throws SQLException{
		Connection MyConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kursverwaltung","root","");
	}
	
	
	public static void SQL_aufrufen() {
		
		try {
			
			//Verbindung zur Datenbank
			Connection MyConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kursverwaltung","root","");
			
			//Objekt zum abfragen bzw f�r sql anweisungen
			Statement fragMichWas = MyConnection.createStatement();
			
			//Abfrage
			ResultSet test = fragMichWas.executeQuery("select * from sch�ler");
			
			//Ausgabe
			while (test.next()){
				System.out.print(test.getString(1)+ " "); //1 steht f�r die Spalte kan aber auch mit namen genannt werden in ""
				System.out.print(test.getString(2)+ " ");
				System.out.println(test.getString(3));
			}
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
