package array.controller;

import array.model.Hipster;
import array.view.*;

public class ArrayController
{
	private String [] words = {"This", "is", "the", "next", "level", "of", "hipster", "the", "initialization", "sequence"};
	private Hipster [] hipsters;
	private int [] numbers;
	private ArrayFrame appFrame;
	
	public ArrayController()
	{
		showHipsterLevelThree();
		
		hipsters = new Hipster[5];
		appFrame = new ArrayFrame(this);
	}
	
	public void start()
	{
	
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster #" + index);
		}
		
		for(Hipster current : hipsters)
		{
			System.out.println(current);
		}
	}
	
	public Hipster[] getHipsters()
	{
		return hipsters;
	}
	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	
	public String[] getWords()
	{
		return words;
	}
}
