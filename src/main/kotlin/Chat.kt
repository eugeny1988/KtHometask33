class Chat(
    val id: Int,
    val user1: User,
    val user2: User,
    var messages: MutableList<Message>,
    var isChatRead: Boolean,
    var isLastMessage: Boolean
) {

    init {
        for (message: Message in messages){
            if (message.isRead){
                isChatRead = true
                break
            } else isChatRead = false
        }
        if (!messages.isEmpty()){
            isLastMessage = true
        } else isLastMessage = false
    }
    fun createMessage(message: Message) {
        this.messages.add(message)
        message.isRead = true

    }

    fun editMessage(id: Int, text: String) {
        this.messages.set(id - 1, Message(text, false, true))

    }
    fun deleteMessage(id: Int){
        this.messages.removeAt(id-1)
        messages[id-1].isDeleted = true
    }


}