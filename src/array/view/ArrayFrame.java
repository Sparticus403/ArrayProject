package array.view;

import javax.swing.*;
import array.controller.ArrayController;
import java.awt.Dimension;

public class ArrayFrame extends JFrame
{
	private ArrayController baseController;
	private ArrayPanel appPanel;
	
	public ArrayFrame(ArrayController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new ArrayPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Array Window");
		this.setSize(new Dimension(600,400));
		this.setResizable(false);
		this.setVisible(true);
	}

}
