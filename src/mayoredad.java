import javax.swing.*;

public class mayoredad {
    public JButton boton1;
    public JLabel etiqueta1;
    public JTextField textField1;
    public JPanel panelPrincipal;
    public JTextField textField2;
    public JButton verificarButton;

    public mayoredad() {
        boton1.addActionListener(e -> {
            try {
                String texto = textField1.getText();
                int edad = Integer.parseInt(texto);

                if (edad >= 18) {
                    JOptionPane.showMessageDialog(null,"Eche pola con cuidado");
                } else {
                    JOptionPane.showMessageDialog(null,"es menor de edad, regrese a casa ");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Por favor, escribe un número válido.");
            }
        });

    }


}
