import kotlin.math.abs

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//For example, the square matrix  is shown below:
//
//  1 2 3
//  4 5 6
//  9 8 9
//The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
//
//Function description
//
//Complete the  function in the editor below.
//
//diagonalDifference takes the following parameter:
//
//int arr[n][m]: an array of integers
//Return
//
//int: the absolute diagonal difference
//Input Format
//
//The first line contains a single integer, , the number of rows and columns in the square matrix .
//Each of the next  lines describes a row, , and consists of  space-separated integers .
//
//Constraints
//
//Output Format
//
//Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

//  1 2 3
//  4 5 6
//  9 8 9

fun diagonalDifference(arr: Array<Array<Int>>):Int {
    // Write your code here
    var diagonal1 = 0
    var diagonal2 = 0
        var n = arr.size
    for (i in 0 until n){
        diagonal1 += arr[i][i] // [0][2] + [1][1]+[2][0]
        diagonal2 += arr[i][n-i-1]

    }
    return abs( diagonal1-diagonal2)
}
fun main() {
    var a :Array<Int> = arrayOf(1,2,3)
    var b: Array<Int> = arrayOf(4,5,6)
    var c: Array<Int> = arrayOf(10,8,8)
    var r : Array<Array<Int>> = arrayOf(a,b,c)

    println(diagonalDifference(r))
}




//fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
//    // Write your code here
//    var scoreOfYasser = 0
//    var scoreOfHor = 0
//
//    if (a[0]> b[0]) scoreOfYasser += 1
//    if (b[0] < a[0]) scoreOfHor += 1
//    if (a[1]> b[1]) scoreOfYasser += 1
//    if (b[1] < a[1]) scoreOfHor += 1
//    if (a[2]> b[2]) scoreOfYasser += 1
//    if (b[2] < a[2]) scoreOfHor +=1
//    return arrayOf(scoreOfYasser,scoreOfHor)
//
//}
//
//fun main() {
//    var a = arrayOf(5,6,7)
//    var b = arrayOf(3,6,10)
//    var res = compareTriplets(a,b)
//    println("${res[0]},${res[0]}")
//
//}