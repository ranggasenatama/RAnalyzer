/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appranalyzer;

/**
 *
 * @author rezaa
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu implements ActionListener {
    private ProjectOpener projectopener = new ProjectOpener();
    Menu() 
    {
        JFrame f = new JFrame("Menu Demo");
        f.setSize(220, 200);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar jmb = new JMenuBar();

        JMenu jmFile = new JMenu("File");
        JMenuItem jmiOpen = new JMenuItem("Open an Existing Project");
        JMenuItem jmiClose = new JMenuItem("Close");
        JMenuItem jmiSave = new JMenuItem("Save");
        JMenuItem jmiExit = new JMenuItem("Exit");
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        JMenu jmOptions = new JMenu("Options");
        JMenu a = new JMenu("A");
        JMenuItem b = new JMenuItem("B");
        JMenuItem c = new JMenuItem("C");
        JMenuItem d = new JMenuItem("D");
        a.add(b);
        a.add(c);
        a.add(d);
        jmOptions.add(a);

        JMenu e = new JMenu("E");
        e.add(new JMenuItem("F"));
        e.add(new JMenuItem("G"));
        jmOptions.add(e);

        jmb.add(jmOptions);

        JMenu jmHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("About");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        jmiAbout.addActionListener(this);

        f.setJMenuBar(jmb);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        if(comStr == "Exit")
        {
            System.exit(0);
        }
        else if(comStr == "Open an Existing Project")
        {
            loading();
        }
        System.out.println(comStr + " Selected");
    }
    public void loading(){
        ProjectOpener.shows();
    }
    public static void main(String args[]) {
        new Menu();
    }
}