//*
//fun solveMeFirst(a: Int, b: Int) = a + b
//    val sc = Scanner(System.`in`)
//    val num1 = sc.nextInt()
//    val num2 = sc.nextInt()
//    val sum = solveMeFirst(num1, num2)
//    println(sum)
//**

//Given an array of integers, find the sum of its elements.
//
//For example, if the array  so return .
//
//Function Description
//
//Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
//
//simpleArraySum has the following parameter(s):
//
//ar: an array of integers
//Input Format
//
//The first line contains an integer, , denoting the size of the array.
//The second line contains  space-separated integers representing the array's elements.
//
//Constraints
//
//
//Output Format
//
//Print the sum of the array's elements as a single integer.
//
//Sample Input
//
//6
//1 2 3 4 10 11

fun simpleArraySum2(ar: Array<Int>):Int {
    // Write your code here
    var sum = ar.sum()

    return sum
}

fun main() {


println( simpleArraySum2(arrayOf(2,5,4,8,8,2,8,1)))




}