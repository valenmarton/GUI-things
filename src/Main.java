import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class Main {
	public static void main(String[] args) {
	/*	String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is "+sum, "the title", JOptionPane.PLAIN_MESSAGE);
		*/
		/*GUI layout = new GUI();
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setSize(250,100);
		layout.setVisible(true);*/
		
		EventHandling obj = new EventHandling();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(350, 100);
		obj.setVisible(true);
		
	}

}
