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
        }
        );
        verificarButton.addActionListener(e -> {
            String texto = textField2.getText();

            try {
                int numero = Integer.parseInt(texto);

                if (numero <= 0) {
                    JOptionPane.showMessageDialog(null, "El número debe ser positivo.");
                    return;
                }

                int suma = 0;
                for (int i = 1; i < numero; i++) {
                    if (numero % i == 0) {
                        suma += i;
                    }
                }

                if (suma == numero) {
                    JOptionPane.showMessageDialog(null, numero + " es un número perfecto ");
                } else {
                    JOptionPane.showMessageDialog(null, numero + " no es un número perfecto ");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
            }
        });
    }

    }



