// class Rotating_the_Box {

     //?  https://leetcode.com/problems/rotating-the-box/
class Solution {
     public char[][] rotateTheBox(char[][] box) {
          if (box == null || box.length == 0 || box[0].length == 0) {
               return box;
          }

          int m = box.length;
          int n = box[0].length;
          char[][] res = new char[n][m];
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    res[i][j] = box[m - j - 1][i];
               }
          }

          for (int j = 0; j < m; j++) {
               int cur = n - 1;
               for (int i = n - 1; i >= 0; i--) {
                    if (res[i][j] == '*') {
                         cur = i - 1;
                    } else if (res[i][j] == '#') {
                         res[i][j] = '.';
                         res[cur--][j] = '#';
                    }
               }
          }

          return res;
     }
}



/*
 * 
 * You are given an m x n matrix of characters box representing a side-view of a box. Each cell of the box is one of the following:

* A stone '#'
* A stationary obstacle '*'
* Empty '.'
* The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it * lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the * inertia from the box's rotation does not affect the stones' horizontal positions.
* 
* It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.
* 
* Return an n x m matrix representing the box after the rotation described above.
* 
*  
* 
* Example 1:
* 
* 
* 
* Input: box = [["#",".","#"]]
* Output: [["."],
*          ["#"],
*          ["#"]]
* Example 2:
* 
* 
* 
* Input: box = [["#",".","*","."],
*               ["#","#","*","."]]
* Output: [["#","."],
*          ["#","#"],
*          ["*","*"],
*          [".","."]]
* Example 3:
* 
* 
* 
* Input: box = [["#","#","*",".","*","."],
*               ["#","#","#","*",".","."],
*               ["#","#","#",".","#","."]]
* Output: [[".","#","#"],
*          [".","#","#"],
*          ["#","#","*"],
*          ["#","*","."],
*          ["#",".","*"],
*          ["#",".","."]]
*  
* 
* Constraints:
* 
* m == box.length
* n == box[i].length
* 1 <= m, n <= 500
* box[i][j] is either '#', '*', or '.'.
* Accepted
* 37.2K
* Submissions
* 57.4K

 */