import processing.core.PApplet;

public class Sketch extends PApplet {
  // Set how many rows and columns we will have
  int ROW_COUNT = 10;
  int COLUMN_COUNT = 10;
  
  // This sets the WIDTH and HEIGHT of each grid location
  int CELL_WIDTH = 20;
  int CELL_HEIGHT = 20;
  
  // This sets the margin between each cell and on the edges of the screen.
  int MARGIN = 5;
  
  // Do the math to figure out our screen dimensions
  int SCREEN_WIDTH = (CELL_WIDTH + MARGIN) * COLUMN_COUNT + MARGIN;
  int SCREEN_HEIGHT = (CELL_HEIGHT + MARGIN) * ROW_COUNT + MARGIN;

  // declare a 2D array
  int[][] intGrid;
  
  
  	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(SCREEN_WIDTH, SCREEN_HEIGHT);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
    intGrid = new int[10][10];
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    strokeWeight(0);

    //intGrid[1][5] = 1;

    for(int row = 0; row < ROW_COUNT; row++){
      for (int column = 0; column< COLUMN_COUNT; column++){
        fill(255);
        if (intGrid[row][column] == 1){
          fill(0,255,0);
        }
        rect((MARGIN + CELL_WIDTH)*column + MARGIN ,(MARGIN + CELL_HEIGHT)*row + MARGIN , CELL_WIDTH, CELL_HEIGHT);
      }
    }
    

  }

  public void mousePressed(){
    int intGridRow, intGridColumn;
    intGridColumn = mouseX/(CELL_WIDTH + MARGIN);
    intGridRow = mouseY/(CELL_HEIGHT + MARGIN);
    System.out.println("mouse coordinates: (" + mouseX + ", "+ mouseY + "); grid coordinates: (row:" + intGridRow + ", column: " + intGridColumn + ")");
    intGrid[intGridRow][intGridColumn] = 1;

  }

}