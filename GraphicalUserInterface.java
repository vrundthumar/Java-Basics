import javax.swing.JOptionPane;

public class GraphicalUserInterface {
    
    public static void main(String[] args) {

        String name = javax.swing.JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

         String age = javax.swing.JOptionPane.showInputDialog("Enter your age");
        JOptionPane.showMessageDialog(null, "You are "+age+ "'s old");

        String college = javax.swing.JOptionPane.showInputDialog("Enter your college name");
        JOptionPane.showMessageDialog(null, "Your name is "+name+ ". Your age is "+age+ " years and you are studing in "+college+" University.");

    }
}


