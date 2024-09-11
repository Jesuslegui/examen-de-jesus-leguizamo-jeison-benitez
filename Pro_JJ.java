import javax.swing.*;

public class Pro_JJ {
    private double num1, num2;

    public void pedirDatos() {
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
    }

    public void verificarMultiplos() {
        if (num2 == 0 || num1 == 0) {
            JOptionPane.showMessageDialog(null, "No se puede buscar multiplos de 0");
        }
        else if (num1 % num2 == 0) {
            JOptionPane.showMessageDialog(null, num1 + " es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            JOptionPane.showMessageDialog(null, num2 + " es múltiplo de " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "Ninguno de los numeros es múltiplo del otro");
        }
    }
}

    
