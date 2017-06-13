import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CircleAndSquare extends JPanel implements ActionListener {
	final static int NOTHING = 0;
	final static int CIRCLE = 1;
	final static int SQUARE = 2;
	
	int whatToDraw = NOTHING;
	public CircleAndSquare()
	{
		JFrame frame = new JFrame("CircleAndSquare");
		this.setPreferredSize(new Dimension(400, 400));
		frame.setLayout(new BorderLayout());
		frame.add(this, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		JButton circleButton = new JButton("circle");
		circleButton.addActionListener(this);
		JButton rectangleButton = new JButton("square");
		rectangleButton.addActionListener(this);
		buttonPanel.add(circleButton);
		buttonPanel.add(rectangleButton);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CircleAndSquare();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("circle"))
		{
			whatToDraw = CIRCLE;
		}
		if(button.getText().equals("square"))
		{
			whatToDraw = SQUARE;
		}
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		if(whatToDraw == CIRCLE)
		{
			g.setColor(Color.blue);
			g.fillOval(0, 0, 400, 400);
		}
		if(whatToDraw == SQUARE)
		{
			g.setColor(Color.red);
			g.fillRect(50, 50, 300, 300);
		}
	}
}
