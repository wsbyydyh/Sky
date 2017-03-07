

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;
public class TextA{
 public int getRandom(){
  Random r = new Random();
  return r.nextInt(2000) - 1000;
 }
 public static void main(String[] args)
 {   
    TextA t = new TextA();
    for(int i=0; i<100; i++)
    {
     System.out.println(t.getRandom());
    }
} 
}