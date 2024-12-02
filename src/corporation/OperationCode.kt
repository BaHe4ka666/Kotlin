package src.corporation

enum class OperationCode(
    val title: String
) {
    EXIT("Exit"),
    REGISTER_NEW_ITEM("Register new item"),
    SHOW_ALL_ITEMS("Show all items"),
    DELETE_PRODUCT_CARD("Delete product card")
}