package src.files

enum class OperationCode (
    val title: String
) {
    EXIT("Exit"), WRITE_IN_FILE("Add note"), READ_FILE("Read all notes")
}