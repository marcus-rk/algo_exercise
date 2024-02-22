package minimum_dist

import kotlin.math.min

fun main() {

    val numbers = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 3, 9)
    val hashMap: HashMap<Int, Int> = hashMapOf();

    for (i in numbers.indices) {

        for (j in i+1 until numbers.size) {

            if (numbers[i] == numbers[j]){
                val dist: Int = j-i
                hashMap.put(numbers[i], dist) // hashMap[numbers[i]] = dist
            }
        }

    }

    var minimumDist: Int =
        if (hashMap.size == 0)
            -1
        else
            numbers.size

    hashMap.forEach { (key, value) ->
        if (value < minimumDist)
            minimumDist = value
    }

    println(minimumDist)

}