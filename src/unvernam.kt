import java.util.*

fun Char.decode(other: Char): Char {
    val code = this - 'A'
    val otherCode = other - 'A'
    var decodedCode = otherCode - code
    if (decodedCode < 0) {
        decodedCode += 26
    }
    return 'A' + decodedCode
}

fun String.decode(text: String): String =
    this.asSequence().zip(text.asSequence()).map { (c1, c2) -> c1.decode(c2) }.joinToString("")

fun main(args: Array<String>) {
    val key = args.first()

    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val message = scanner.nextLine()
        println(key.decode(message))
    }
}
