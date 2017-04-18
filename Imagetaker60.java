package NefariousScreenshots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

class NefariousScreenshots {
  public static void main(String args[]) throws
           AWTException, IOException, InterruptedException {

      int x=0;
      int y=99999;
      
      while (x<y)
      {
      BufferedImage screencapture = new Robot().createScreenCapture(
           new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );

      File file = new File("screencapture"+(x)+".jpg");
     ImageIO.write(screencapture, "jpg", file);
     
     x = x+1;
     Thread.sleep(10000);
      }
  }
}