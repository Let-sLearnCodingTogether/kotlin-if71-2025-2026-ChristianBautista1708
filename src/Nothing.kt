fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    //Program akan berhenti di sini dengan error
    fail("Terjadi kesalahan fatal!")
}