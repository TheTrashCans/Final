package main;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameWithColor extends JFrame
{
	private final int SIZE = 180; 
	private Container con = getContentPane();
	private JButton button = new JButton("NOOOOO!!!");
	public JFrameWithColor()
	{
		setSize(SIZE, SIZE);
		con.setLayout(new FlowLayout());
		con.add(button);
		con.setBackground(Color.red);
		button.setBackground(Color.black);
		button.setForeground(Color.WHITE);
		
		
}	

	public static void main(String[] args) 
	{
		
		JFrameWithColor frame = new JFrameWithColor();
		frame.setVisible(true);
	}

}
