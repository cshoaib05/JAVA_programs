import java.applet.Applet;
import java.awt.Graphics;

//<applet code='MyApplet.class' width=100 height=100></applet>//
 class MyApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(10,10,50,30);
	}
}
