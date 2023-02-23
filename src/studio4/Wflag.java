package studio4;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Wflag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color purply = new Color(204, 255, 255);
		StdDraw.setPenColor(purply);
		StdDraw.filledRectangle(0.25,0.5,0.25,0.5);

		double[] arr_tx= {0.1,0.3,0.2};
		double[] arr_ty= {0.1,0.1,0.3};
		purply = new Color(255, 51, 51);
		StdDraw.setPenColor(purply);
		StdDraw.filledPolygon(arr_tx,arr_ty);
		double rt_x1=0.2;
		double rt_y1=0.5;
		double rt_w=0.05;
		double rt_h=0.3;
		StdDraw.filledRectangle(rt_x1,rt_y1,rt_w,rt_h);
		
	}

}
