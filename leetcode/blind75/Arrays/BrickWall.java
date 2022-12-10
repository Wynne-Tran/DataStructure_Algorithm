//554. Brick Wall

// ask least brick hole if cut verticle

// hint: find a large brick
package leetcode.blind75.Arrays;
import java.util.*;
public class BrickWall {
    static int brickEdge = 0;
    static Map<Integer, Integer> freg = new HashMap<>();
    public static void main(String[] args) {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(1, 2, 2, 1));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 2, 3));
        wall.add(Arrays.asList(2, 4));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 1, 1));
        
        System.out.print(leastBrick(wall));
    }
    
    
    public static void processRows (List<Integer> rows) {
        int sumRow = rows.get(0);
        for (int i = 1; i < rows.size(); i++) {
            int temp = freg.getOrDefault(sumRow, 0) + 1;
            freg.put(sumRow, temp);
            if(temp > brickEdge) {
                brickEdge = temp;
            }
            sumRow += rows.get(i);
        }
    }
    
    public static int leastBrick(List<List<Integer>> wall) {
        for (int i = 0; i < wall.size(); i++) {
            processRows(wall.get(i));
        }
        return wall.size() - brickEdge;
    }
}
