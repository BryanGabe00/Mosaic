import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class MainMenuFrame extends JFrame implements ActionListener
{
  public MainMenuFrame()
  {
    setBounds(100, 100, 300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel buttonPanel = new JPanel();
    contentPane.add(buttonPanel, BorderLayout.CENTER);

    JButton threeButton = new JButton("3 x 3");
    buttonPanel.add(threeButton);
    threeButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        dispose();
        MosaicFrame mosaic = new MosaicFrame(3);
        mosaic.setVisible(true);
      }
    });
    JButton fourButton = new JButton("4 x 4");
    buttonPanel.add(fourButton);
    fourButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        dispose();
        MosaicFrame mosaic = new MosaicFrame(4);
        mosaic.setVisible(true);
      }
    });
    JButton fiveButton = new JButton("5 x 5");
    buttonPanel.add(fiveButton);
    fiveButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        dispose();
        MosaicFrame mosaic = new MosaicFrame(5);
        mosaic.setVisible(true);
      }
    });
  }
  public void actionPerformed(ActionEvent e) {}
}
