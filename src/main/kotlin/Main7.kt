
//This is a staircase of size :
//
//#
//##
//###
//####
//Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
//
//Write a program that prints a staircase of size .
//
//Function Description
//
//Complete the staircase function in the editor below.
//
//staircase has the following parameter(s):
//
//int n: an integer
//Print
//
//Print a staircase as described above.
//
//Input Format
//
//A single integer, , denoting the size of the staircase.
//
//Constraints
//
//.
//
//Output Format
//
//Print a staircase of size  using # symbols and spaces.
//
//Note: The last line must have  spaces in it.
//
//Sample Input
//
//6
//Sample Output
//
//#
//##
//###
//####
//#####
//######
//Explanation
//
//The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .


fun staircase(n: Int): Unit {
    // Write your code here
    for (i in 0 until n) {
        val spaces = n - i - 1
        val hashes = i + 1

        for (ir in 1..spaces) {
            print(" ")
        }
        for (ir in 1..hashes) {
            print("#")
        }
        println()
    }

    // shorter
    //for(i in 1..n){println(" ".repeat(n - i ) + "#".repeat(i))
}
fun main() {
staircase(4)
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