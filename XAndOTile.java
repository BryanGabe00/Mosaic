import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.Random;

public class XAndOTile extends JPanel implements MouseListener
{
  private int red, green, blue;
  private String letter, shape;
  private int randomNumber, randomShape;
  private Color shapeColor, letterColor;

  public XAndOTile()
  {
    super();
    setRandomValues();
    addMouseListener(this);
  }
  final public void setRandomValues()
  {
    red = getRandomNumber(0, 255);
    green = getRandomNumber(0, 255);
    blue = getRandomNumber(0, 255);

    randomNumber = getRandomNumber(0, 25);
    randomShape = getRandomNumber(0, 1);

    switch(randomNumber)
    {
      case 0:
        letter = "A";
        break;
      case 1:
        letter = "B";
        break;
      case 2:
        letter = "C";
        break;
      case 3:
        letter = "D";
        break;
      case 4:
        letter = "E";
        break;
      case 5:
        letter = "F";
        break;
      case 6:
        letter = "G";
        break;
      case 7:
        letter = "H";
        break;
      case 8:
        letter = "I";
        break;
      case 9:
        letter = "J";
        break;
      case 10:
        letter = "K";
        break;
      case 11:
        letter = "L";
        break;
      case 12:
        letter = "M";
        break;
      case 13:
        letter = "N";
        break;
      case 14:
        letter = "O";
        break;
      case 15:
        letter = "P";
        break;
      case 16:
        letter = "Q";
        break;
      case 17:
        letter = "R";
        break;
      case 18:
        letter = "S";
        break;
      case 19:
        letter = "T";
        break;
      case 20:
        letter = "U";
        break;
      case 21:
        letter = "V";
        break;
      case 22:
        letter = "W";
        break;
      case 23:
        letter = "X";
        break;
      case 24:
        letter = "Y";
        break;
      case 25:
        letter = "Z";
        break;
      default:
        break;
    }
  }

  //utility methods
  private int getRandomNumber(int min, int max)
  {
    Random r = new Random();
    return r.nextInt(max - min + 1) + min;
  }
  private int getContrastingColor(int color)
  {
    return (color + 128) % 256;
  }

  //getters
  public final Color getLetterColor() { return letterColor; }
  public final Color getShapeColor() { return shapeColor; }
  public final String getLetter() { return letter; }
  public final String getShape() { return shape; }

  @Override
  public String toString()
  {
    return "Shape: " + getShape() + "\n" +
           "Letter: " + getLetter() + "\n" +
           "Shape Color: " + getShapeColor() + "\n" +
           "Letter Color: " + getLetterColor() + "\n";
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    final int FONT_SIZE = 75;
    shapeColor = new Color(red, green, blue);
    g.setColor(shapeColor);
    if(randomShape == 1)
    {
      shape = "Square";
    g.fillRect(10, 10, getWidth() - 20, getHeight() - 20);
    }
    else
    {
      shape = "Circle";
    g.fillOval(10, 10, getWidth() - 20, getHeight() - 20);
    }
    letterColor = new Color(getContrastingColor(red), getContrastingColor(green), getContrastingColor(blue));
    g.setColor(letterColor);

    g.setFont(new Font("TimesRoman", Font.PLAIN, FONT_SIZE));
    g.drawString(letter, getWidth() / 2 - 30, getHeight() / 2 + 30);
    System.out.println("Start Paint*** \n" + this);
  }

  //MouseListener methods
  public void mouseClicked(MouseEvent e){}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e)
  {
    setRandomValues();
    System.out.println(this);
    repaint();
  }
  public void mouseReleased(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
}
