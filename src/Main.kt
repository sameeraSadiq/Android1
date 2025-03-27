
//fun sumUpTo(max: Int): Int {
//    var sum = 0
//    for (i in 1..max) {
//        sum += i  // Add each number from 1 to max
//    }
//    return sum
//}
//
//// Example Usage
//fun main() {
//    println(sumUpTo(10))  // Output: 55
//}
//1 2 3 4 5 6 7 8 9 10
//0+1=1 1+2=3 3+3=6 6+4=10 10+5=15 15+6=21 21+7=28 28+8=36 36+9=45 45+10=55



//fun factorialIterative(n: Int): Long {
//    var result = 1L
//    for (i in 1..n) {
//        result *= i // Multiply result by each number up to n
//    }
//    return result
//}
//
//// Example Usage
//fun main() {
//    println(factorialIterative(5))  // Output: 120
//}
//!(n-1)1*1=1 1*2=2 2*3=6 6*4=24 24*5=120


//val factorialLambda: (Int) -> Long = { n ->
//    var result = 1L
//    for (i in 1..n) {
//        result *= i
//    }
//    result
//}
//
//// Example Usage
//fun main() {
//    println(factorialLambda(5))  // Output: 120
//}


fun factorialRecursive(n: Int): Long {
    return if (n <= 1) 1 else n * factorialRecursive(n - 1)
}

// Example Usage
fun main() {
    println(factorialRecursive(5))  // Output: 120
}
//n=0 or n=1 ?1
//  factorial(n)=n*factorial(n-1)
//  5=5*(5-1)>n=5