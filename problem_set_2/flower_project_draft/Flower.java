// Write a class that describes a flower. A flower has a location, a
// constructor and a draw method.
// The flower should look like the picture below:
// http://imgur.com/OC4EA29

// The constructor takes the (x, y) coordinate of the upper left-hand
// corner of the flower. The arrow points to the x,y coordinates of
// the flower.
 
// There are four pink petals and a yellow center. Each petal and the
// center is a circle with a diameter of 20. A circle is an ellipse in
// which the width and height are both equal to the diameter of the
// circle. The pink circles touch the yellow one.

// The stem is green and is on the center line of the flower. Its
// length is 3 times the diameter.

// When implementing the draw method, I recommend that you start with
// the top petal, figure out its coordinates, instantiate a circle at
// that point with a diameter of 20, and call its draw method.

// Then test. You can create a flower object in BlueJ and invoke its
// draw method. Pick another of the circles; calculate its coordinates;
// instantiate a circle at that location; and. Call its draw method.
// Now test again.

// I believe you will find it much less intimidating to draw one
// little thing, get it right, and go to the next. You may want to use
// pencil and paper to do this. I did.

// Note: When drawing an Ellipse, you specify the x, y coordinates and
// the width and height of the rectangle that would surround the
// ellipse. See the video "More about Graphics"

// Here is how you would draw a circle of diameter 20 when the
// surrounding rectangle has x, y coordinates of 30, 50
//      Ellipse circle = new Ellipse(30, 50, 20,20);
//      circle.draw();

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 2 - Question 3" for some tips on 
// how to begin. 


public class Flower
{
   private int x;
   private int y;
   
   public Flower(int theX, int theY)
   {
       // todo
       x = theX;
       y = theY;
   }
    
   /**
    * This function draws the flower.
    */
   public void draw()
   {
       // todo
       Ellipse circle1 = new Ellipse(x,y+20,20,20);
       Ellipse circle2 = new Ellipse(x+20,y,20,20);
       Ellipse circle3 = new Ellipse(x+40,y+20,20,20);
       Ellipse circle4 = new Ellipse(x+20,y+40,20,20);
       Ellipse circle5 = new Ellipse(x+20,y+20,20,20);
       
       
       circle1.setColor(Color.PINK);
       circle2.setColor(Color.PINK);
       circle3.setColor(Color.PINK);
       circle4.setColor(Color.PINK);
       circle5.setColor(Color.YELLOW);
       circle1.fill();
       circle2.fill();
       circle3.fill();
       circle4.fill();
       circle5.fill();
       
       Line stem = new Line(x+30,y+60,x+30,y+60+60);
       stem.setColor(Color.GREEN);
       stem.draw();
       
       

   }
}
