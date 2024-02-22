package First_repeating_element

fun main() {

    val input = arrayOf(10,5,4,6,3,5,3,2)

    for (i in input.indices) {
        var foundMatch = false;
        for (j in i+1 until input.size) {

            if (input[i] == input[j]){
                println("${input[i]} is ${input[j]}")
                foundMatch = true
            }
        }

        if (foundMatch == true) {
            break
        }
    }



}
