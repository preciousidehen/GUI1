import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Admin1
 *
 */
public class Dialog1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("What is your name");
		String message = String.format("welcome %s to java", name);
		JOptionPane.showMessageDialog(null, message);

	}

}
