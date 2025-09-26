fun main() {
//    Null
    var student : String = "Student 1"
    println(student)

//    student = null

    var prodiIf : String? = null
    println(prodiIf?.length)

    var prodiSi : String? = null
    println(prodiSi ?: "Tanpa Prodi")

    var token : String? = null
    println(token!!.length)

    val email : String? = "email"
    if(email != null) {
        print(email.length)
    }
}