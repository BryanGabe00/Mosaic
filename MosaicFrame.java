import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.Container;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class MosaicFrame extends JFrame implements ActionListener
{
  private final double VERSION = 2.0;
  private ArrayList<XAndOTile> tiles;
  private int tileAmount;
  public MosaicFrame(int tileAmount)
  {
    setTitle("Mosaic " + VERSION);
    setBounds(100, 100, 800, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.tileAmount = tileAmount;
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel buttonPanel = new JPanel();
    contentPane.add(buttonPanel, BorderLayout.SOUTH);

    JButton randomButton = new JButton("Randomize");
    buttonPanel.add(randomButton);
    randomButton.addActionListener(this);

    JPanel tilePanel = new JPanel();
    contentPane.add(tilePanel, BorderLayout.CENTER);
    tilePanel.setLayout(new GridLayout(tileAmount, tileAmount));

    tiles = new ArrayList<XAndOTile>();
    for(int i = 0; i < tileAmount * tileAmount; i++)
    {
      XAndOTile tile = new XAndOTile();
      tiles.add(tile);
      tilePanel.add(tile);
    }
  }
  public void actionPerformed(ActionEvent e)
  {
    for(XAndOTile tile : tiles)
    {
      tile.setRandomValues();
      System.out.println(tile);
    }
    repaint();
  }
}
