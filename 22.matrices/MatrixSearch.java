//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix search example 

import static java.lang.System.*;

public class MatrixSearch
{
 /*
  *  method searchMat should determine how many
  *  occurrences of toFind exist in the matrix mat
  */
 public static int searchMat( int[][] mat, int toFind)
 {
   int count = 0;
   for(int[] ray : mat){
     for(int elem : ray){
        if(elem == toFind)
          count += 1;
     }
   }
   return count;
 }

 public static void main(String args[])
 {
  int[][] twoDRay = {{5,7,7,8,7,8},{5,3,4,6},{0,8,7,1,2,3,4,5}};
  System.out.println( searchMat( twoDRay, 7) );
 }
}