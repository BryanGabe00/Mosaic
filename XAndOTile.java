import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class XAndOTile extends JPanel
{
  private int red, green, blue;
  private String letter;

  public XAndOTile()
  {
    super();
    setRandomValues();
  }
  final public void setRandomValues()
  {
    red = getRandomNumber(0, 255);
    green = getRandomNumber(0, 255);
    blue = getRandomNumber(0, 255);

    letter = "X";
    if(getRandomNumber(0, 1) == 1)
      letter = "O";
  }
  private int getRandomNumber(int min, int max)
  {
    Random r = new Random();
    return r.nextInt(max - min + 1) + min;
  }
  private int getContrastingColor(int color)
  {
    return (color + 128) % 256;
  }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    final int FONT_SIZE = 100;
    g.setColor(new Color(red, green, blue));
    g.fillRect(10, 10, getWidth() - 20, getHeight() - 20);
    g.setColor(new Color(getContrastingColor(red), getContrastingColor(green), getContrastingColor(blue)));

    g.setFont(new Font("TimesRoman", Font.PLAIN, FONT_SIZE));
    g.drawString(letter, getWidth() / 2 - 30, getHeight() / 2 + 30);
  }
}
