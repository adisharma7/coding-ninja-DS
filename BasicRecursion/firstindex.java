import java.util.*;

public class firstindex {

    public static void main(String[] args) {
        int[] input = { 9,8,10,8};
        System.out.println(firstIndex(input, 8));

    }
    
    public static int firstIndex(int input[], int y) {
        return index(input, 0, y);

    }

    public static int index(int[] input, int starti, int x) {
        if (starti == input.length) {
            return -1;
        }
        if (input[starti] == x) {
            return starti;
        }
        return index(input, starti + 1, x);
        
    }
}
