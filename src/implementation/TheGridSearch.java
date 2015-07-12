package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheGridSearch {
    public static void main(String[] args) throws IOException {
        TheGridSearch solution = new TheGridSearch();
        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            int numTestCases = Integer.parseInt(input.readLine());
            assert numTestCases >= 1 && numTestCases <= 5;
            int[][] grid;
            int[][] pattern;

            for(int t = 0; t < numTestCases; t++) {
                grid = solution.buildArray(input);
                pattern = solution.buildArray(input);
                // Gotta STDOUT in HackerRank for problem to be graded.
                System.out.println(solution.findPattern(grid, pattern));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Determines whether pattern exists in grid.
     *
     * @param grid       2D array of digits
     * @param pattern    the 2D sequence of digits to be found in grid
     * @return "YES" if grid contains pattern. "NO" if not.
     */
    public String findPattern(int[][] grid, int[][] pattern){
        // R, C, r, & c are the same letters used in the problem
        for(int R = 0; R < grid.length - pattern.length + 1; R++){
            for(int C = 0; C < grid[0].length - pattern[0].length + 1; C++){
                outerLoop:
                for(int r = 0; r < pattern.length; r++){
                    for(int c = 0; c < pattern[0].length; c++){
                        if(grid[R + r][C + c] != pattern[r][c]){
                            break outerLoop;
                        }
                    }
                    if(r == pattern.length - 1){
                        return "YES";
                    }
                }
            }
        }
        return "NO";
    }

    /**
     * Builds and returns an array built according to data received from STDIN.
     *
     * @param input    STDIN stream
     * @return a 2D primitive array containing 0-9 digits
     * @throws IOException
     */
    public int[][] buildArray(BufferedReader input) throws IOException {
        String[] sizeParameters = input.readLine().split(" ");
        int rows = Integer.parseInt(sizeParameters[0]);
        int columns = Integer.parseInt(sizeParameters[1]);
        int[][] array = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            String rowOfNumbers = input.readLine();
            for(int j = 0; j < columns; j++){
                array[i][j] = Character.getNumericValue(rowOfNumbers.charAt(j));
            }
        }

        return array;
    }

}