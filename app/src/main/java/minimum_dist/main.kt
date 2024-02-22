package minimum_dist

import kotlin.math.min

fun main() {

    val numbers = arrayOf(3, 6, 8, 2, 4, 3, 9, 1, 7, 5, 4)
    val hashMap: HashMap<Int, Int> = hashMapOf();

    for (i in numbers.indices) {

        for (j in i+1 until numbers.size) {

            if (numbers[i] == numbers[j]){
                val dist: Int = j-i
                hashMap.put(numbers[i], dist) // hashMap[numbers[i]] = dist
            }
        }

    }


    var minimumDist: Int = -1 // If not empty -> set dist as first key value

    hashMap.forEach { (key, value) ->
        if (value < minimumDist)
            minimumDist = value
    }

    println(minimumDist)

}