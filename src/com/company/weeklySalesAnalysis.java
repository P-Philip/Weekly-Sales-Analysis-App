package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class weeklySalesAnalysis extends JFrame {
    private JLabel salePersonName;
    private JTextField salesPersonText;
    private JLabel weeklySalesLabel;
    private JTextField weeklySalesText;
    private JButton enterSalesButton1;
    private JButton enterSalesButton2;
    private JButton enterSalesButton3;
    private JButton clearButton;
    int total1=0,total2=0,total3=0;
    double bonus1,bonus2,bonus3;




    Object[] rows= new Object[5];//row table
    public weeklySalesAnalysis() throws HeadlessException {

        super("WEEKLY SALES OF SALESPERSON");
        setLayout(new BorderLayout());
        JPanel northPanel= new JPanel(new GridLayout(1,1));
        northPanel.setBackground(new Color(255,48,49));
        northPanel.add(salePersonName= new JLabel("NAME OF SALESPERSON:"));
        northPanel.add(salesPersonText= new JTextField(15));
        salesPersonText.setBackground(new Color(153,170,171));
        add(northPanel,BorderLayout.NORTH);

        JPanel centerPanel= new JPanel(new FlowLayout());
        centerPanel.setBackground(new Color(255,48,49));
        centerPanel.add(enterSalesButton1= new JButton("SALESPERSON 1"));
        enterSalesButton1.setBackground(new Color(103,230,220));
        centerPanel.add(enterSalesButton2= new JButton("SALESPERSON 2"));
        enterSalesButton2.setBackground(new Color(103,230,220));
        centerPanel.add(enterSalesButton3= new JButton("SALESPERSON 3"));
        enterSalesButton3.setBackground(new Color(103,230,220));
        centerPanel.add(clearButton= new JButton("CLEAR TABLE"));
        clearButton.setBackground(new Color(103,230,220));
        add(centerPanel,BorderLayout.CENTER);

        //create a table
        JTable table= new JTable();
        final String columnNames[]= new String[]{
                "NAME","TOTAL SALES","IF BONUS","IF NO BONUS"//column table
        };
        final DefaultTableModel tableModel= new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnNames);
        table.setModel(tableModel);
        table.setFillsViewportHeight(true);
        table.setPreferredScrollableViewportSize(new Dimension(450,200));
        table.setBackground(new Color(103,230,220));
        table.setForeground(Color.white);
        table.setFont(new Font("serif",Font.BOLD,14));
        table.setRowHeight(30);
        JScrollPane pane= new JScrollPane(table);
        add(pane,BorderLayout.SOUTH);

        enterSalesButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=1;i<=6;++i){
                    int dailySales1=Integer.parseInt(JOptionPane.showInputDialog(" Enter week "+i+" sales"));
                    total1+= dailySales1;
                    bonus1=0.155*total1;

                }
                if(total1>=1000){
                    rows[2]=bonus1;

                }else {
                    String text="No bonus";
                    rows[3]=text;
                    String text3="";
                    rows[2]=text3;
                }

                rows[0]=salesPersonText.getText();
                rows[1]=total1;
                tableModel.addRow(rows);
            }
        });

        enterSalesButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=1;i<=6;++i){
                    int dailySales2=Integer.parseInt(JOptionPane.showInputDialog(" Enter week "+i+" sales"));
                    total2+= dailySales2;
                    bonus2=0.155*total2;


                }
                if(total2>=1000){
                    rows[2]=bonus2;

                }else {
                    String text="No bonus";
                    rows[3]=text;
                    String text2="";
                    rows[2]=text2;
                }
                rows[0]=salesPersonText.getText();
                rows[1]=total2;
                tableModel.addRow(rows);

            }
        });

        enterSalesButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=1;i<=6;++i){
                    int dailySales3=Integer.parseInt(JOptionPane.showInputDialog(" Enter week "+i+" sales"));
                    total3+= dailySales3;
                    bonus3=0.155*total3;


                }
                if(total3>=1000){
                    rows[2]=bonus3;

                }else {
                    String text="No bonus";
                    rows[3]=text;
                    String text3="";
                    rows[2]=text3;
                }
                rows[0]=salesPersonText.getText();
                rows[1]=total3;
                tableModel.addRow(rows);

            }
        });




        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            tableModel.removeRow(0);





            }
        });











    }
}
