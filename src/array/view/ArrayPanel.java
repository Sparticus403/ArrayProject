package array.view;

import java.awt.Color;
import array.controller.ArrayController;
import javax.swing.*;

public class ArrayPanel extends JPanel
{

	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private ArrayController baseController;
	
	public ArrayPanel(ArrayController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click the button");
		this.infoLabel = new JLabel("Wow words!");
		this.dropDown = new JComboBox(baseController.getWords());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -135, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, myButton, -173, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 26, SpringLayout.SOUTH, myButton);
		baseLayout.putConstraint(SpringLayout.EAST, infoLabel, -191, SpringLayout.WEST, dropDown);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, -4, SpringLayout.NORTH, infoLabel);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -35, SpringLayout.EAST, this);
		
	}
	private void setupListeners()
	{
		
	}
}
