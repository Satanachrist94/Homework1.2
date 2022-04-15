
fun main() {
    var likes = "562"
    var last_index = likes.last()

    if (last_index.equals('1') && likes.toInt() != 11) println("Понравилось " + likes + " человеку ")
    else println("Понравилось " + likes + " людям ")
}