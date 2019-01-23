package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class hello extends JFrame {
	private JTable table; 
	private DefaultTableModel dtm;
	private JButton btnAdd;
	private JButton btnRemove;
	
	public hello() {
		dtm = new DefaultTableModel();
		dtm.addColumn("FirstName");
		dtm.addColumn("LastName");
		dtm.addColumn("Income");
		dtm.addColumn("Description");
		
		String[] itc = {"xit","dev","1000","java senior"};
		dtm.addRow(itc);
		
		String[] rowData = {"","","",""};
		dtm.addRow(rowData);
		
		table = new JTable(dtm);
		btnAdd = new JButton("Add new");
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dtm.addRow(rowData);
			}			
		});
		btnRemove = new JButton("Remove line");
		btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dtm.removeRow(table.getSelectedRow());
			}
			
		});
		JPanel panel = new JPanel();
		panel.add(btnAdd);
		panel.add(btnRemove);
		
		Container container = getContentPane();
		container.add(new JScrollPane(table),BorderLayout.CENTER);	
		container.add(panel,BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new hello();
	}
}
