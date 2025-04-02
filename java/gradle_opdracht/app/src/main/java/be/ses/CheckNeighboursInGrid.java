package be.ses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.checkerframework.checker.units.qual.A;

public class CheckNeighboursInGrid {
/**
* This method takes a 1D Iterable and an element in the array and gives back an iterable containing the indexes of all neighbours with the same value as the specified element
*@return - Returns a 1D Iterable of ints, the Integers represent the indexes of all neighbours with the same value as the specified element on index 'indexToCheck'.
*@param grid - This is a 1D Iterable containing all elements of the grid. The elements are integers.
*@param width - Specifies the width of the grid.
*@param height - Specifies the height of the grid (extra for checking if 1D grid is complete given the specified width)
*@param indexToCheck - Specifies the index of the element which neighbours that need to be checked
*/
public static Iterable<Integer> getSameNeighboursIds(Iterable<Integer> grid,int width, int height, int indexToCheck){
    ArrayList<Integer> result = new ArrayList<>();
    ArrayList<Integer> gridList = new ArrayList<>();

    for (Integer value : grid) {
        gridList.add(value);
    }
    int waarde = gridList.get(indexToCheck);
    
    if (indexToCheck > height * width - 1 || indexToCheck < 0) {
        throw new IllegalArgumentException("Index out of bounds");
    }

    if (indexToCheck % width > 0) {
        if (gridList.get(indexToCheck + 1) == waarde) {
            result.add(indexToCheck + 1);
        }
    }
    if (indexToCheck % width > 0) {
        if (gridList.get(indexToCheck - 1) == waarde) {
            result.add(indexToCheck - 1);
        }
    }

    if (indexToCheck >= width){
        if (gridList.get(indexToCheck - width) == waarde) {
            result.add(indexToCheck - width);
        }
    }

    if (indexToCheck < (height - 1) * width){
        if (gridList.get(indexToCheck + width) == waarde) {
            result.add(indexToCheck + width);
        }
    }
    return result;
 }
 public static void main(String[] args) {
    // Maak de List<Integer> rechtstreeks aan
    List<Integer> grid = new ArrayList<>();
    grid.add(0); grid.add(1); grid.add(1); grid.add(0);
    grid.add(1); grid.add(1); grid.add(0); grid.add(2);
    grid.add(2); grid.add(1); grid.add(1); grid.add(3);
    grid.add(0); grid.add(1); grid.add(1); grid.add(1);

    // Roep de methode aan met index 5
    Iterable<Integer> result = getSameNeighboursIds(grid, 4, 4, 5);
    System.out.println("Buren met dezelfde waarde: " + result);
}
}
