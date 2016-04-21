package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import java.awt.GridLayout;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTable notentabelle_ueb;

	/**
	 * Create the frame.
	 */
	public Gui() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKursverwaltung = new JLabel("Kursverwaltung");
		lblKursverwaltung.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblKursverwaltung.setHorizontalAlignment(SwingConstants.CENTER);
		lblKursverwaltung.setForeground(Color.RED);
		lblKursverwaltung.setBounds(12, 13, 558, 30);
		contentPane.add(lblKursverwaltung);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 77, 570, 475);
		contentPane.add(tabbedPane);
		
		JPanel uebersicht = new JPanel();
		tabbedPane.addTab("Übersicht", null, uebersicht, null);
		uebersicht.setLayout(null);
		
		JLabel lblLetzeEingetrageneNote = new JLabel("Letze Eingetragene Note:");
		lblLetzeEingetrageneNote.setBounds(0, 0, 153, 42);
		uebersicht.add(lblLetzeEingetrageneNote);
		
		JLabel lblNote = new JLabel("*Note*");
		lblNote.setBounds(154, 0, 53, 42);
		uebersicht.add(lblNote);
//		lblNote.setText("irgendwas");
		
		JLabel lblFach = new JLabel("Fach:");
		lblFach.setBounds(219, 0, 41, 42);
		uebersicht.add(lblFach);
		
		JLabel lblFach_1 = new JLabel("*Fach*");
		lblFach_1.setBounds(263, 0, 125, 42);
		uebersicht.add(lblFach_1);
		
		JPanel noten_eintragen = new JPanel();
		tabbedPane.addTab("Noten Eintragen", null, noten_eintragen, null);
		noten_eintragen.setLayout(null);
		
		JPanel notenausgeben = new JPanel();
		tabbedPane.addTab("Notentabelle", null, notenausgeben, null);
		notenausgeben.setLayout(new GridLayout(1, 0, 0, 0));
		
//		notentabelle_ueb = new JTable();
//		notenausgeben.add(notentabelle_ueb);
//		Pausgabe.setBounds(20,335,620,265);     //Müssen noch angepasst werden
//		final String[][] columnNames = {
//                "Schüler","Fächer","Noten"
//                };
//                final String[] data = {
//                     "1","2","3" };
//                final JTable table = new JTable(columnNames,data);
//                table.setPreferredScrollableViewportSize(new Dimension (600,240));
//                table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//                JScrollPane pane = new JScrollPane(table);
//                PAusgabe.add(pane, BorderLayout.CENTER);
//                pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		JLabel lblSchlerin = new JLabel("Sch\u00FCler/in:");
		lblSchlerin.setBounds(412, 48, 63, 16);
		contentPane.add(lblSchlerin);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	public void setNotentabelle_ueb(JTable notentabelle_ueb) {
		this.notentabelle_ueb = notentabelle_ueb;
	}
}
