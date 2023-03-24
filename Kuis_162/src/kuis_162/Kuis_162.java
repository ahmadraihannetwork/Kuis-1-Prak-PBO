/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_162;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Lab Informatika
 */
public class Kuis_162 extends JFrame implements ActionListener{
    private JLabel labelMenuUtama,labelMenuProgrammer,labelMenuDesigener;
    private JButton buttonMenuProgrammer,buttonMenuDesigner,buttonKembaliProgrammer,buttonKembaliDesigner,buttonHasilProgrammer,buttonHasilDesigner;
    private JTextField textFieldBiodataProgrammer,textFieldBiodataDesigner,textFieldPenilaianProgrammer,textFieldPenilaianDesigner,textFieldHasilProgrammer,textFieldHasilDesigner;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==buttonMenuProgrammer)
    
    

