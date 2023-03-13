import java.io.File

fun main() {
    fun parseInput(input: String): List<List<Int>> = input.split("\\s*\n\\s*\n".toRegex())
        .map { group -> group
            .lines()
            .map { it.toInt() }
    }


    fun part1(input: String): Int {
        val data: List<List<Int>> = parseInput(input)

        return data.maxOf { it.sum() }
    }


    fun part2(input: String): Int {
        val data: List<List<Int>> = parseInput(input)
        return data
            .map { it.sum()}
            .sortedDescending()
            .take(3)
            .sum()
    }


    val testInput: String = File("src/Day01.txt").readText()

    println(part1(testInput))
    println(part2(testInput))


}
