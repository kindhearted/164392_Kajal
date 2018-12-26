package ShapeDrawing;

import java.awt.Graphics;
import java.io.IOException;
import java.nio.CharBuffer;

public class TestShapes
{
	public static void testLine()
	{
	Line line1=new Line();
	line1.drawShapes();
	}
	
	public static void testRectangle()
	{
		Rectangle rect1=new Rectangle() ;
		rect1.drawShapes();				
	}
	
	public static void testCube()
	{
		Cube cube1=new Cube();
		cube1.drawShapes();
	}
	
	public static void main(String[] args)
	{
			testLine();
			testCube();
			testRectangle();
	}

}
