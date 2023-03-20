import javax.swing.JOptionPane;
public class gui {
    public static void main(String [] args) {
        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your name") );
        JOptionPane.showMessageDialog(null, "Hello your age is " + age);

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Weight: "));
        JOptionPane.showMessageDialog(null, "Your weight is " + weight);
    }
}
