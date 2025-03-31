/*
 * Search the 'Target ' value in a 2D integer matrix of dimension N x M and return true , if found 
 * else return false .
 * this matrix has the following properties:>
 * 
 * 1. Integers in each row are sorted from left to right 
 * 2. The first Integers of each row is Greater than the last integer of the previous now .
 *                           !   !         !    !
 * Input >> Matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
 * TARGET  = 3  // OUTPUT = true.
 * where r = row , and c = column
 * [r,c] >>  mid element = r*m+c/m = row number 
 *  and                    r*m+c%m = column number  
 */



// Refer the second Method which is very easy to follow
public class Question6_2DArray {
    static boolean SearchMatriX(int[][] arr, int target){
        // number of rows = n , number of cols = m;
        int n = arr.length , m = arr[0].length;
        int st = 0 , end = n*m-1;
        while(st <= end ){
            int mid = st+(end-st)/2;  // this is mid element if 2D array in 1D 
            int midElement = arr[mid/m][mid%m];   // now converted in 2D array
            if(midElement == target) return true;
            if(target<midElement){
                end = mid-1;
            }else st = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] Matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(SearchMatriX(Matrix, 3));
    }
}

// second question like this avaliable on leetcode that i have sloved
// based on second methos >>>  

// int i = 0 , j=m-1;
// while(i<m && j>=0){  // this means i which start from 0 can not go out of matrix.length
//     // and the j which is last element of 0th row at first must not go less than = 0 because 0 is the last index 
//     // while we are going j--;
//         if(matrix[i][j] == target) return true;
//         if(target>matrix[i][j]) i++;  // going down << because we know if target is greater than matrix[i][j] element then it must be down somewhere>>

//         else {  // if(target is < matrix[i][j])
//             j--;   // j-- means going left side 
//         }  
//     }
    // return false;

