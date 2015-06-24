//
// Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson.
// You can find the pictures required in in the bluej project
//

import java.util.ArrayList;

public class ShiftFirstToEnd
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("degas1.jpg"));
      gallery.add(new Picture("gaugin1.jpg"));
      gallery.add(new Picture("monet1.jpg"));
      gallery.add(new Picture("monet2.jpg"));
      gallery.add(new Picture("renoir1.jpg"));
      
      Picture tmp = gallery.remove(0);
      gallery.add(gallery.size(),tmp);
      
      int offset = 10;
      for (Picture pic: gallery)
      {
          pic.translate(offset,0);
          offset = pic.getMaxX() + 10;
          pic.draw();
        }

      // TODO Write code to shift the first picture (the one at index 0)
      // to the end of the array list and  display the pictures object in the modified list
      // horizontally
   }
}
