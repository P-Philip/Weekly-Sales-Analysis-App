package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	weeklySalesAnalysis object= new weeklySalesAnalysis();
	object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	object.setSize(new Dimension(400,100));
	object.setLocationRelativeTo(null);
	object.setVisible(true);
	object.pack();
    }
}
