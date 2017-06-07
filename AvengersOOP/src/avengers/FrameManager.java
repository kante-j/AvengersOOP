package avengers;

import java.util.*;

import javax.swing.*;

public class FrameManager {

   private static FrameManager _instance;
   
   public static final int FRAME_MAIN = 0;
   public static final int FRAME_STORY = 1;
   public static final int FRAME_SELECT = 2;
   
   private ArrayList<JFrame> frames = new ArrayList<JFrame>();
    
   
   int x;
   int char_val;
   
   

private FrameManager() {
   
      frames.add(new Main());
      frames.add(new Story());
      frames.add(new Select_Char());
      
   } 
   
   public void change(JFrame current, int next){
      if(current != null)
         current.setVisible(false);
      frames.get(next).setVisible(true);
   }
   
   
   
   public static FrameManager getInstance() {
      if (_instance == null)
         _instance = new FrameManager();
      return _instance;
   }
   
   
   
}