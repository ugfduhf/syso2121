import kotlin.math.abs
//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
//
//Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
//
//Example
//
//There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
//
//0.400000
//0.400000
//0.200000
//Function Description
//
//Complete the plusMinus function in the editor below.
//
//plusMinus has the following parameter(s):
//
//int arr[n]: an array of integers
//Print
//Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.
//
//Input Format
//
//The first line contains an integer, , the size of the array.
//The second line contains  space-separated integers that describe .
//
//Constraints
//
//
//
//Output Format
//
//Print the following  lines, each to  decimals:
//
//proportion of positive values
//proportion of negative values
//proportion of zeros
//Sample Input
//
//STDIN           Function
//-----           --------
//6               arr[] size n = 6
//-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
//Sample Output
//
//0.500000
//0.333333
//0.166667
//Explanation
//
//There are  positive numbers,  negative numbers, and  zero in the array.
//The proportions of occurrence are positive: , negative:  and zeros: .
fun plusMinus(arr: Array<Int>)  {
    // Write your code here
    var positives = 0
    var negatives = 0
    var zeros = 0

    for (number in arr){
        if (number > 0){
            positives += 1
        }else if (number < 0 ){
            negatives +=1
        }else {
            zeros += 1
        }
    }
    //"%.6f" .format يزود اصفار في الناتج
    println("%.6f".format(positives / arr.size.toDouble()))
    println("%.6f".format(negatives / arr.size.toDouble()))
    println("%.6f".format(zeros / arr.size.toDouble()))
}
fun main() {
    plusMinus(arrayOf(-4,0,0,2,3,4,30,-1,-1,-2))
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