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

public class MosaicFrame extends JFrame
{
  private final double VERSION = 1.0;
  private ArrayList<XAndOTile> tiles;
  public MosaicFrame()
  {
    setTitle("Mosaic " + VERSION);
    setBounds(100, 100, 400, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel buttonPanel = new JPanel();
    contentPane.add(buttonPanel, BorderLayout.SOUTH);

    JButton randomButton = new JButton("Randomize");
    buttonPanel.add(randomButton);

    JPanel xAndOPanel = new JPanel();
    contentPane.add(xAndOPanel, BorderLayout.CENTER);
    xAndOPanel.setLayout(new GridLayout(3, 3));

    tiles = new ArrayList<XAndOTile>();
    for(int i = 0; i < 9; i++)
    {
      xAndOPanel.add(new XAndOTile());
    }
  }
}
