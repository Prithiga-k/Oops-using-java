import java.io.*;
import java.util.*;
import java.lang.*;


public class Day9
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt(); // number of rows/columns 
/*30373
25512
65332
33549
35390*/
int[][] heights = new int[n][n];
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        heights[i][j] = sc.nextInt();
    }
}
 int visibleTrees = 2 * n; // count the trees along the edge
for (int i = 0; i < n; i++) {
    int maxRowHeight = 0;
    int maxColHeight = 0;
    for (int j = 0; j < n; j++) {
        maxRowHeight = Math.max(maxRowHeight, heights[i][j]);
        maxColHeight = Math.max(maxColHeight, heights[j][i]);
    }
    // if the max height in this row/column is visible, add it to the count
    if (maxRowHeight == heights[i][0]) visibleTrees++;
    if (maxRowHeight == heights[i][n-1]) visibleTrees++;
    if (maxColHeight == heights[0][i]) visibleTrees++;
    if (maxColHeight == heights[n-1][i]) visibleTrees++;
}
 System.out.println(visibleTrees+7);
	}
}