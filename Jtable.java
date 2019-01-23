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

public class Jtable extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2279449734323674635L;
	private JTable table;
	private DefaultTableModel dtm;
	static JButton btnAdd;
	static JButton btnRemove;
	
	public Jtable() {
		super();
		dtm = new DefaultTableModel();
		
		dtm.addColumn("FistName");
		dtm.addColumn("LastName");
		dtm.addColumn("Class");
		dtm.addColumn("Description");
		
		String[] itc15 =  {"xit","dev","it","development&research"};
		dtm.addRow(itc15);
		
		String[] newdata = {"","",""};
		
		table = new JTable(dtm);
		btnAdd = new JButton("Add line");
		btnAdd.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent event) {
						dtm.addRow(newdata);
					}
			
				});
		btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent event) {
				dtm.removeRow(table.getSelectedRow());
			}
	
		});
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(btnAdd);
		inputPanel.add(btnRemove);
		
		Container container = getContentPane();
		container.add(new JScrollPane(table),BorderLayout.CENTER);
		container.add(inputPanel,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Jtable();
		
	}
}
