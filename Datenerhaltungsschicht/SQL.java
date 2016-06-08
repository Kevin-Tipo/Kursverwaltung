package Datenerhaltungsschicht;

import java.sql.*;
public class SQL {
	
	private static String[] server = {"jdbc:mysql://pazim.de:3306/kursverwaltung","db12612539-skurs","EhgYwZp2"};
	
	public SQL(){
		
	}
		
	public ResultSet abfrage(String befehl) throws SQLException{
		Connection MyConnection = DriverManager.getConnection(server[0],server[1],server[2]);
		Statement fragMichWas = MyConnection.createStatement();
		ResultSet ergebnis = fragMichWas.executeQuery(befehl);
		return ergebnis;
	}	

	
	
	public void Verbindung() throws SQLException{
		Connection MyConnection = DriverManager.getConnection(server[0],server[1],server[2]);
	}
	
	
	public static void SQL_aufrufen() {
		
		try {
			
			//Verbindung zur Datenbank
			Connection MyConnection = DriverManager.getConnection(server[0],server[1],server[2]);
			
			//Objekt zum abfragen bzw fÃ¼r sql anweisungen
			Statement fragMichWas = MyConnection.createStatement();
			
			//Abfrage
			ResultSet test = fragMichWas.executeQuery("select * from schÃ¼ler");
			
			//Ausgabe
			while (test.next()){
				System.out.print(test.getString(1)+ " "); //1 steht fÃ¼r die Spalte kan aber auch mit namen genannt werden in ""
				System.out.print(test.getString(2)+ " ");
				System.out.println(test.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
public static void SQL_abfragen(String abfrage) {
		
		try {			
			//Verbindung zur Datenbank
			Connection MyConnection = DriverManager.getConnection(server[0],server[1],server[2]);
			
			//Objekt zum abfragen bzw fÃ¼r sql anweisungen
			Statement fragMichWas = MyConnection.createStatement();
			
			//Abfrage
			ResultSet ergebnis_res = fragMichWas.executeQuery(abfrage);
			
			//Ausgabe
			for (int i = 0; i < 9; i++) {
				System.out.println(ergebnis_res.getString(i)+ " ");
				ergebnis_res.next();
			}
		}	
				
			
//			while (ergebnis_res.next()){
//				System.out.print(ergebnis_res.getString(1)+ " "); //1 steht fÃ¼r die Spalte kan aber auch mit namen genannt werden in ""
//				System.out.print(ergebnis_res.getString(2)+ " ");
//				System.out.println(ergebnis_res.getString(3));
//			}
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
