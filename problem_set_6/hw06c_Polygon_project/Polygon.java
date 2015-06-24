//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing a class almost from scratch
//
//For the draft, finish the constructor.
//Have the perimeter method return 0 and have the draw mwthod draw a
//line from point 0, 0 to point 30, 40
//

import java.util.ArrayList;
import java.awt.Point;
public class Polygon
{
    // TODO: provide the required constructor, instance variable, and methods
    private ArrayList<Point> polygon;
    public Polygon()
    {
        this.polygon = new ArrayList<Point>();
    }
    
    public void add(Point newPoint)
    {
        polygon.add(newPoint);
    }
    
    public double perimeter()
    {
        double peri = 0;
        double distance = 0;
        for(int i = 0; i < polygon.size(); i++)
        {
            Point fP = polygon.get(i); // first point
            Point sP = polygon.get((i+1) % polygon.size()); // second point
            distance = Math.sqrt(Math.pow((fP.getX()-sP.getX()),2) + Math.pow((fP.getY()-sP.getY()),2));
            peri += distance;
        }
        return peri;
    }
    
    public void draw()
    {
        
        for(int i = 0; i < polygon.size(); i++)
        {
           Point fP = polygon.get(i); // first point
           Point sP = polygon.get((i+1) % polygon.size()); // second point
           double x1 = fP.getX();
           double x2 = sP.getX();
           double y1 = fP.getY();
           double y2 = sP.getY();
           new Line(x1,y1,x2,y2).draw();
        }
        
    }
  
}
