package wix.challenge;
import java.util.*;
/**
 *
 * @author liron
 */
public class WixChallenge {
    /**
     * Assuming '(' means go up and ')' means go down, 
     * which floor will you end up on given the input? 
     * The building you are in has an infinite number of floors and 
     * an infinite number of basements. 
     * You start at floor 0.
     * @param str
     * @return Floor number
     */
    public static int NumberOfFloor(String str)
    {
        int Floor = 0;
        for(int i = 0; i< str.length(); i++)
        {
            if(str.charAt(i) == '(')
                Floor++;
            else if(str.charAt(i) == ')')
                Floor--;
        }
        return Floor;
    }
    /**
     * Assuming '<' means left, '>' means right, 
     * '^' means up and 'v' means down, 
     * you start at a position in the middle of a huge field, 
     * where you have more than enough room to move. 
     * You start walking according to the directions in input. 
     * How many positions did you visit more than once? 
     * The position you start in is considered a visit.
     * @param str
     * @return 
     */
    public static int visitMoreThanOnce(String str)
    {
        int[][] arr = new int[2000][2000];
        int x = arr.length/2;
        int y = arr[0].length/2;
        arr[x][y] = 1;
        
         for(int i = 0; i< str.length(); i++)
         {
             switch (str.charAt(i))
             {
                case '<' : {
                    y--;
                    arr[x][y]++;
                    break;
                }
                case '>' : {
                     y++;
                     arr[x][y]++;
                     break;
                }
                case '^' : {
                    
                    x--;
                    arr[x][y]++;
                    break;
                }
                case 'v' : {
                    x++;
                    arr[x][y]++;
                    break;
                }
             }
         }
         int number = 0;
         for(int i = 0; i < arr.length; i++)
             for(int j = 0; j < arr[0].length; j++)
                 if(arr[i][j] > 1)
                     number++;
       
        return number;
    }
    
    public static void main(String[] args) {
        String str = ")(()(()(()(())))((())((()(())((()(()()())(((()())))()(()))"
                + "())((()))))()()))))))()))())(()(())()((())((()()())(()())()("
                + "()(()()(()))())((((((()())())(())))))(()()())()))(()()()()()"
                + "(())(()((()()))())()((()))()()))())())))()(())(()))))())((((("
                + "(()))((())))())(((()(((()())))))(((()()((((()(()((()()(((((()"
                + "))(()())(())(()())))))(())))))))((()()()))((()())))((()))((()"
                + "())()()(())))())))(()))(())(((()(((((())))(())(((((((()())))"
                + "())((()((((()((()()(()((((())())()()()(()))))))(((())))())(()"
                + "(()()))()()))(())()())())))))))(((((()()(()()(()())())))()((("
                + "()()()(((()()()()(())())()(((())()))))())((()())(()))())(((()"
                + ")())(())()()()(((()()()(((()())))(())()((()))())))))()(())(("
                + "()())())(())(())(()(())(()((()(())))))(()()))(())))()((())))"
                + "()))()(()(())))))(((((()(()())))()()(())()))(((())())(()((()"
                + "())))(()))()())(()(()((((((((()()())())(())()()(()((())(()))"
                + "()()))))())()()()((((((())()))))(()())(()()))(()((()((())((()"
                + ")(())(())))))(((())()(()((()()()()(()((()))(()(()))))()()(())"
                + "))()(()(()())))()(()()(())()(())(((((())()(((()))()))))())()"
                + "()((())))()()((())()((())((())))";
       int floor =  NumberOfFloor(str);
       System.out.println("The floor number is  " + floor);
        String str2 = "^><v<v>^v^^>^<<<v^><^<>^vv^^^vv><^^<>vv>>>v^v>^<v^<>^v>"
                + "vvv^vvv<><>^v<>^^v<v^<vv<<<^v^^>^^<vv<<>^^<>>>^>>vvv^>vvv>v>"
                + "><vvv>vv>>^^^<<>^v^><v^>v^<<>>>><><>^vv>vv>v><^<^<>^<v<>^v^>"
                + "v^><><^<>v>v>^vvvv>v><^^>vvv><^<>><^<><>>vv><^<^vv<^v><>vv<>"
                + "^v^v>>v^>^<><vv^^v^>^<>>v<v>>vv>vvv>>><^^v^><<^><^^v^>v^<>^v"
                + "<^><^^>^>^<v<<>v<<>^<<v<<<vv<vvv^^v<v<^^>v>^v>v^<v>^v<<vv<>v"
                + "^v^<^<><<>^v<v>><<>v>^<<><<v<>>>>vvvv><<<^>vv><<<^>v>vvvv><<"
                + "v<^<vv^>>^^^^vv>^>^v<^vv><^v<v<>^<v>^^^<<^<v>>>^>^><>^v^v^<<"
                + "^^v^<^^<<^^>^<^^v><^v><>^<><>^><^>vv^><<<>v<>><v><>><^vvv>v^"
                + ">v<vv<>>v^v^<v><>>vv<<v<^^v^<^v^v>^<<v>vv<<<>v>>^^^v<^^<>^<v"
                + ">^>v<>v>^><<v<<v><^<<^v<<^<v<<>>^<^vvv>^v^vvv<v>^<><<>>><><>"
                + "<<^^^^v^^<><vv<><^v<<v^<v^^><v^>^v^v<v><^>vvvv<<^v^<^^<>v<v<"
                + ">><><v>vvv>^^vvvv^^vv^^>v>>><^v^v>vv<<<><^^v>vvv<^^<^<^>v<>v"
                + "^^>vv><>v>>v><vv>><<><<^<<<<^<<>v>^^v^<v<^^<<^^<v<v^v<<vv<v<"
                + "<^^v>^<<v^v<<>v<>v<^^v<v^^<>v^<<>><v>vv^>v^v><v>v^v^vv^<<v<>"
                + "vvv<>^^><^^>^>^<v><^<><>>^>>>^><^<vvv<>><<^^^>>^v<<>^^>^vvv"
                + "v^<^vvv>>vv>><>^>^v><v^v^<^vv^vv<^^^<<vv^v<v^^<<>vv>v<<><^^v"
                + "^>^>^^v>>^^<^v<>>v<vv><^<^v^<v>v^v>>^v<vvvv<<<v^v^v<>v^>>^<^"
                + "vvv><><^^<^^>v<^<^<>v<<vv>vv<<v>^^^>>^v^<v^v>>v<^<>^v<v<^<>>"
                + "><<^^>^<v>><^<vv^<<^v><<>><>v><v>v<vvv>>v^^>v<^<<<<^^v<^>^^>"
                + "vv^<<<vv<v^^><^vv>v<^>^vv><^^vv<<>v<<^<>v^v^<>v<<v><>>v^<>><"
                + "^<>^vv^^^^v^v><><<^<>v<^<>^^^><<v>^v>^<<v><>>v<<<<<vv<<>vv<>"
                + "<<<<^>^<v><<><>>v><v<<v^^<>v>vv^>vv^^>v<vv<v^>^^vv>v^<<^<>^v"
                + ">v>^>^>^^vv>>^>v<<>><<v^^v<^^v>>^<<<^>^v<>^^v>v^^^^>v<><v>v>"
                + "^>^vvvv>v>^v<^^<<^vvv>>>^vv>^^<>>^^><>>v^v^>^<<>v^>^^>^^<^<v"
                + "^^v^v>>^<>^>^>v^>v^<<v<>v^>v<><^^v>^<vv<<^vv^<v>^<^<>>v><>>>"
                + ">v<><^<^v<^>^<v<>^^vv^>><>^<><>v<>>^^v<v>^v>v<^v<^<<<^>v>>^>"
                + "<^>>vv>><<<v^><^^<^<>>>>>^v<><><<<^><<v<>v<<^<>v>v<<<v><v>^v"
                + "vv^^><><v>><>>^>^^><v^>><<>^<^v<^^v^vv>^^>>>v^v<<v^v^v^vv^>v"
                + "^v<^>><v^<>><v^vvv^vvv<<^v^>v<vv^^<v<<<^<^v^v><>v><<vvv>^>>^"
                + "vv<<>v^>vv<^^<^<vvv<>>v^^v><<><>v<><>>^v^v>>v^v<v^vv^><vv^>>"
                + ">><^>^v^v<<>>>vv><>v^<>>>^vv^<v><vvv>>v<^^v^>v><<><>v><^><>^"
                + "^><v^>v^>v><v>v<^>v>v><<>^<^v><<^><>v>>vvvv^><<^<>v<v>^^<v^>"
                + "vv<v<<v";
       int visit =  visitMoreThanOnce(str2);
       System.out.println("The visit number is  " + visit);
    }
    
}
