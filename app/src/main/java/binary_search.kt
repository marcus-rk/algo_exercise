
fun main() {

    val numbers: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    val target: Int = 2
    var low: Int = 0
    var high: Int = numbers.size - 1
    var mid: Int = (low + high) / 2

    for (i in low..high) {
        // Display subarrays for easier understanding
        // for (index in low..high) print("${numbers[index]} ")

        if (low >= high) break

        if (numbers[mid] == target) {
            println("\nTarget: $target found on Index:$mid")
            break
        }
        if (numbers[mid] < target) {
            low = mid + 1
            mid = (low + high) / 2
            println("\nMid is LOWER than target")
        } else {
            high = mid - 1
            mid = (low + high) / 2
            println("\nMid is HIGHER than target")
        }
    }

}