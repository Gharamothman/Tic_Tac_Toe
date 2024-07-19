import javax.sound.sampled.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class nnn {
 
  static Clip clip ;
   public  void setStart(boolean stat){
    
      clip.stop();
   }
     public static void playSound(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
          clip = AudioSystem.getClip();
        
            clip.open(audioInputStream);
            clip.start();
            clip.loop(100000000);
        
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }
    public static void stopmusic(){
    if (clip!= null && clip.isRunning()){
   clip.stop();
}
    }

}
