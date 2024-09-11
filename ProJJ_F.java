import javax.swing.*;
public class ProJJ_F {
    public static void main(String args[]) {
        Pro_JJ js = new Pro_JJ();
        String continuar;
        do {
            js.pedirDatos();
            js.verificarMultiplos();
            continuar = JOptionPane.showInputDialog("¿Desea continuar? (s/n)").toLowerCase();
            
        } while (continuar.equals("s"));
        
        JOptionPane.showMessageDialog(null, "final del examen.");
    }
}


