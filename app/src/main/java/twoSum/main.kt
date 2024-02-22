package twoSum

fun main() {
    val numbers: IntArray = intArrayOf(3, 2, 1, 3)

    val target: Int = 6

    for (i in numbers.indices) {
        var foundMatch = false;

        for (j in i + 1 until numbers.size) {
            if (numbers[j] + numbers[i] == target) {
                println("$i, $j")
                foundMatch = true
                break
            }
        }

        if (foundMatch == true) {
            break
        }
    }

}