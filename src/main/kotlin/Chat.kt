class Chat(
    val user1: User,
    val user2: User,
    var messages: MutableList<Message>
) {
    fun createMessage(message: Message){
        this.messages.add(message)
        message.isRead = true

    }
    fun editMessage(id: Int, text: String){
        this.messages.set(id-1,Message(text, false, true))

    }


}