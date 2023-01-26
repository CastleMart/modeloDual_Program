package Graficos;

import ModeloDual.Actividad;

import javax.swing.*;
import java.awt.event.*;

public class Actividades extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textIdAct;
    private JButton BtnInsertarAct;
    private JTextField textNombreAct;
    private JTextField textHorasAct;
    private JTextField textDescAct;
    private JTextField textTema;
    ConexionBD con = new ConexionBD();

    private Actividad act;

    public Actividades() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        ConexionBD con = new ConexionBD();

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        BtnInsertarAct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println("Se precionó Crear.");

                    crearActividad();

            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private void crearActividad(){
        act = new Actividad( Integer.parseInt(textIdAct.getText()) , textNombreAct.getText(), Double.parseDouble(textIdAct.getText()),  textDescAct.getText());
        con.insertarActividad(act, Integer.parseInt(textTema.getText()));

    }

}
