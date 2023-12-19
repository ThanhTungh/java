
import java.awt.event.*;
import java.io.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.Font;
import java.awt.Color;

public class Client_ContactBook {

        public static void main(String[]args) throws MalformedURLException, RemoteException, NotBoundException
        {

        	String url="rmi:///";
    		Contact m = (Contact)Naming.lookup(url+"toaster");
        	
            JFrame frame = new JFrame();
            frame.getContentPane().setBackground(Color.BLACK);
            JTable table = new JTable();

          
            Object[] columns = {"FirstName", "LastName", "Phone Number"}; // Arraylist of headers names
            
            DefaultTableModel model = new DefaultTableModel();
            
            model.setColumnIdentifiers(columns);// headers
            table.setModel(model);
          
            TableRowSorter<TableModel> tr = new TableRowSorter<TableModel>(model);
            table.setRowSorter(tr);


            //Textfields
            JTextField textName = new JTextField("");
            textName.setBackground(Color.WHITE);
            JTextField textLastName = new JTextField("");
            JTextField textPhNumber = new JTextField("");
            JTextField textSearch = new JTextField("");

            //Buttons
            JButton buttonLoad = new JButton("Load");
            buttonLoad.setForeground(Color.BLUE);
            buttonLoad.setBackground(Color.LIGHT_GRAY);
            buttonLoad.setFont(new Font("Tahoma", Font.PLAIN, 14));
            JButton buttonSave = new JButton("Save");
            buttonSave.setBackground(Color.LIGHT_GRAY);
            buttonSave.setForeground(Color.BLUE);
            buttonSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
            JButton buttonADD = new JButton("Add");
            buttonADD.setBackground(Color.LIGHT_GRAY);
            buttonADD.setForeground(Color.BLUE);
            buttonADD.setFont(new Font("Tahoma", Font.PLAIN, 14));
            JButton buttonDelete = new JButton("Delete");
            buttonDelete.setForeground(Color.BLUE);
            buttonDelete.setBackground(Color.LIGHT_GRAY);
            buttonDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //labels for textfields
            JLabel searchLabel = new JLabel("Search ");
            searchLabel.setForeground(Color.WHITE);
            searchLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
            JLabel nameLabel = new JLabel("First Name");
            nameLabel.setForeground(Color.WHITE);
            nameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
            JLabel lastNameLabel = new JLabel("Last Name");
            lastNameLabel.setForeground(Color.WHITE);
            lastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
            JLabel PhNumberLabel = new JLabel("Phone Number");
            PhNumberLabel.setForeground(Color.WHITE);
            PhNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

            //position of textfields
            textName.setBounds(150,220,100,25);
            textLastName.setBounds(150,265,100,25);
            textPhNumber.setBounds(150,310,100,25);
            textSearch.setBounds(510,265,300,25);

            // poistion of buttons
            buttonLoad.setBounds(640,220,100,25);
            buttonSave.setBounds(410,220,100,25);
            buttonADD.setBounds(280,220,100,25);
            searchLabel.setBounds(440,265,100,25);
            buttonDelete.setBounds(280,310,100,25);
            
            // poistion of labels
            nameLabel.setBounds(20,220,100,25);
            lastNameLabel.setBounds(20,265,100,25);
            PhNumberLabel.setBounds(20,310,113,25);

            // poistion of table and wraping on new pane
            JScrollPane pane = new JScrollPane(table);
            pane.setBounds(0,46,884,154);
           

            //add everything on frame
            frame.getContentPane().setLayout(null);

            frame.getContentPane().add(pane);

            frame.getContentPane().add(nameLabel);
            frame.getContentPane().add(lastNameLabel);
            frame.getContentPane().add(PhNumberLabel);

            frame.getContentPane().add(textName);
            frame.getContentPane().add(textLastName);
            frame.getContentPane().add(textPhNumber);
            frame.getContentPane().add(textSearch);

            frame.getContentPane().add(buttonLoad);
            frame.getContentPane().add(buttonSave);
            frame.getContentPane().add(buttonADD);
            frame.getContentPane().add(searchLabel);
            frame.getContentPane().add(buttonDelete);
            
            JLabel lblPhone = new JLabel("PHONEBOOK DIRECTORY");
            lblPhone.setVerticalAlignment(SwingConstants.BOTTOM);
            lblPhone.setForeground(Color.RED);
            lblPhone.setBackground(Color.WHITE);
            lblPhone.setFont(new Font("Tahoma", Font.BOLD, 20));
            lblPhone.setBounds(318, 11, 300, 25);
            frame.getContentPane().add(lblPhone);

            // each index representing column
            
            Object[] row = new Object[3];

            buttonADD.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                	
                    //getting the  text from text fields and add them into the  table
                	
                    row[0] = textName.getText();
                    row[1] = textLastName.getText();
                    row[2] = textPhNumber.getText();

                    model.addRow(row);
                }
            });
            
            buttonDelete.addActionListener(new ActionListener() {
                @Override
                
                //remove  the selected row
                
                public void actionPerformed(ActionEvent actionEvent) {
                    int i = table.getSelectedRow();
                    if(i >= 0 )
                    {
                        model.removeRow(i);
                    }
                    else{
                        System.out.println("Delete error");
                    }
                }
            });

            table.addMouseListener(new MouseAdapter() {
                @Override
                
                public void mouseClicked(MouseEvent e) {
                	
                    //double click selected row and update it
                    int i = table.getSelectedRow();
                    textName.setText(model.getValueAt(i,0).toString());
                    textLastName.setText(model.getValueAt(i,1).toString());
                    textPhNumber.setText(model.getValueAt(i,2).toString());
                }
            });

            textSearch.addKeyListener(new KeyListener() {
                @Override
                
                public void keyTyped(KeyEvent keyEvent) {
                    String query = textSearch.getText().toLowerCase();
                    tr.setRowFilter(RowFilter.regexFilter(query));

                }

                @Override
                public void keyPressed(KeyEvent keyEvent) {
                    String query = textSearch.getText().toLowerCase();
                    tr.setRowFilter(RowFilter.regexFilter(query));

                }

                @Override
                public void keyReleased(KeyEvent keyEvent) {
                    String query = textSearch.getText().toLowerCase();
                    tr.setRowFilter(RowFilter.regexFilter(query));

                }
            });


            buttonSave.addActionListener(new ActionListener() {
                @Override
                // function to save file 
                public void actionPerformed(ActionEvent actionEvent) {
                	
                    try {
                        JFileChooser jF = new JFileChooser(new File("D://"));
                        jF.setDialogTitle("Save a file");
                        int result = jF.showSaveDialog(null);
                        if (result == JFileChooser.APPROVE_OPTION)
                                System.out.println("File: "+ jF.getSelectedFile());
                            FileOutputStream  out;
                            PrintStream pS;
                            out = new FileOutputStream(jF.getSelectedFile());
                            pS = new PrintStream(out);
                            // Print to file
                        for (int i = 0;i < table.getRowCount();i ++) {
                            for (int j = 0; j < table.getColumnCount(); j++) {
                                pS.print(table.getValueAt(i, j).toString()+" ");
                            }
                            pS.println(" ");

                        }
                        pS.close();
                            JOptionPane.showMessageDialog(null, " File Saved!");

                    }catch(Exception e){ System.out.println(e);}
                }
            });
            buttonLoad.addActionListener(new ActionListener() {
                @Override
                //load  the file 
                public void actionPerformed(ActionEvent actionEvent) {
                    JFileChooser fc = new JFileChooser(new File( "C://"));
                    int returnVal = fc.showOpenDialog(null);
                    if(returnVal == JFileChooser.APPROVE_OPTION)
                        System.out.println("File: " + fc.getSelectedFile());
                    try{
                      
                        FileReader fr = new FileReader(fc.getSelectedFile());
                        BufferedReader in = new BufferedReader(fr);

                        Object[] inLine = in.lines().toArray();
                       
                        for (int i = 0; i < inLine.length; i++){
                            String[] row1 = inLine[i].toString().split(" ");
                            model.addRow(row1);
                            }
                            in.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
            });


            frame.setSize(900,400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
}
