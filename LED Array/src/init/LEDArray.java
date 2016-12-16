package init;

import javax.swing.JFrame;

import array7.Array7;
import array7.Array7x7;
import arrays.ArraySupporter;
import characters.Characters;
import init.TestEnvironmentArrays;

public class LEDArray {
	//Note that as little code as possible should be inside the main, the exception is testing.
	public static void main(String[] args) {
		//LEDArray app = new LEDArray();
		//app.initTestSuite();
		
		Array7x7 arr = Characters.getChar('A');
		Array7 arr7 = new Array7(new int[] {1, 1, 1, 1, 1, 1, 1});
		
		arr.shiftLeft(arr7);
		arr.shiftLeft(arr7);
		System.out.println(arr.toString());
		Array7x7 copy = Characters.getChar('A');
		System.out.println(copy.toString());
	}
	
	private void initTestSuite(){
		/*
		 *	Test Suite 
		 */
		TestEnvironmentArrays testA = new TestEnvironmentArrays(Characters.getChar('A'));//Creates test environment
		JFrame frame = new JFrame("Test Environment Arrays");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.add(testA);
		frame.pack();
		frame.setVisible(true);
	}
}
