package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType=in.next();
		int redComponent=in.nextInt();
		int greenComponent=in.nextInt();
		int blueComponent=in.nextInt();
		boolean isfilled=in.nextBoolean();
		double parametOne=in.nextDouble();
		double parametTwo=in.nextDouble();
		double parametThree=in.nextDouble();
		double parametFour=in.nextDouble();
		StdDraw.rectangle(parametOne, parametTwo, parametThree, parametFour);
	}
}
