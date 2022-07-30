import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class ImageViewer{

 public static void main(String[] args) {
  
    JFrame frame = new ImageViewerFrame();
    frame.setTitle("Image Viewer App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
  });
 }

}

@SuppressWarnings("serial")
class ImageViewerFrame extends JFrame {
 
 JLabel label;
 JFileChooser chooser;
 JMenuBar menubar;
 JMenu menu;
 JMenuItem open;
 JMenuItem exit;
 
 public ImageViewerFrame() {
  
  setSize(500,500);
  
  label = new JLabel();
  add(label);
  
  chooser = new JFileChooser();
  chooser.setCurrentDirectory(new File("."));
  
  menubar = new JMenuBar();
  setJMenuBar(menubar);
  
  menu = new JMenu("File");
  menubar.add(menu);
  
  open = new JMenuItem("Open");
  menu.add(open);
  
  open.addActionListener(new ActionListener() {
   
   public void actionPerformed(ActionEvent event) {
    
    int result = chooser.showOpenDialog(null);
    
    if(result == JFileChooser.APPROVE_OPTION) {
     String name = chooser.getSelectedFile().getPath();
     label.setIcon(new ImageIcon(name));
    }
   }
  });
 }
 
}