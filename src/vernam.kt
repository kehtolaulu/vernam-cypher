import java.util.*

operator fun Char.plus(other: Char) =
    'A' + ((this - 'A') + (other - 'A')) % 26

fun String.encode(text: String): String =
    this.asSequence().zip(text.asSequence()).map { (c1, c2) -> c1 + c2 }.joinToString("")

fun main(args: Array<String>) {
    val key = args.first()

    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val message = scanner.nextLine()
        println(key.encode(message))
    }
}
