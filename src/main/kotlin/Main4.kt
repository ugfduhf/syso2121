


//In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
//
//Function Description
//
//Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
//
//aVeryBigSum has the following parameter(s):
//
//int ar[n]: an array of integers .
//Return
//
//long: the sum of all array elements
//Input Format
//
//The first line of the input consists of an integer .
//The next line contains  space-separated integers contained in the array.
//
//Output Format
//
//Return the integer sum of the elements in the array.
//
//Constraints
//
//
//Sample Input
//
//5
//1000000001 1000000002 1000000003 1000000004 1000000005
//Output
//
//5000000015
//Note:
//
//The range of the 32-bit integer is .
//When we add several integer values, the resulting sum might exceed the above range. You might need to use long int C/C++/Java to store such sums.
fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here
    var  sum = 0L
    for(element in ar){
        sum += element
    }
    return sum
}

fun main(args: Array<String>) {
   var i = Int.MAX_VALUE
    println(i)
    //int maxsmum is 2147483647

}

//    val listA = listOf("yasser", "b", "c")
//    val listB = listOf("safer", 2, 3, 4)
//    println(listA zip listB) // [(a, 1), (b, 2), (c, 3)]





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