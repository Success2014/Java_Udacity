// BlueJ project: Tiles
// Video: Your turn to do it by hand

import java.util.Scanner;

public class Tiles
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Width of wall: ");
        double width = in.nextDouble();

        System.out.print("Tile size: ");
        double tileSize = in.nextDouble();

        // TODO: Complete these computations
        int pairs = 0;
        int redTiles = 0;
        int whiteTiles = 0;
        
        pairs = (int)((width - tileSize)/(2 * tileSize));
        redTiles = pairs;
        whiteTiles = pairs + 1;
        

        System.out.println("Red tiles: " + redTiles);
        System.out.println("Whites tiles: " + whiteTiles);
    }
}
