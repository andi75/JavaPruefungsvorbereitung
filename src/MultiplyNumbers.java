import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MultiplyNumbers implements DocumentListener {

	JLabel result;
	JTextField leftTF;
	JTextField rightTF;
	
	public MultiplyNumbers() {
		JFrame frame = new JFrame("MultiplyNumbers");
		frame.setLayout(new FlowLayout());
		
		leftTF = new JTextField(10);
		leftTF.getDocument().addDocumentListener(this);
		JLabel cross = new JLabel("x");
		rightTF = new JTextField(10);
		rightTF.getDocument().addDocumentListener(this);
		JLabel equal = new JLabel("=");
		result = new JLabel("???              ");
	
		frame.add(leftTF);
		frame.add(cross);
		frame.add(rightTF);
		frame.add(equal);
		frame.add(result);
		
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MultiplyNumbers();
	}


	private void updateValues() {
		double a, b;
		try
		{
			a = Double.parseDouble( leftTF.getText() );
			b = Double.parseDouble( rightTF.getText() );
		}
		catch (Exception e)
		{
			result.setText("???");
			return;
		}
		result.setText("" + a * b);	
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		updateValues();
	}


	@Override
	public void removeUpdate(DocumentEvent e) {
		updateValues();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		updateValues();
}
}
