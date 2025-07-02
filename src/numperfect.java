import javax.swing.*;
import java.awt.*;

public class numperfect{
    public JTextField textField2;
    public JPanel panelPrincipal;
    public JButton verificarButton;

    public numperfect(){
        verificarButton.addActionListener(e -> {
        try {
            String texto = textField2.getText();
            int np = Integer.parseInt(texto);

            if (np == 6 || np == 28 || np == 496 || np == 8128) {
                JOptionPane.showMessageDialog(null, "es un numero perfecto");
            } else {
                JOptionPane.showMessageDialog(null, "no es perfecto");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Por favor, escribe un número válido.");
        }

        });
    }}

