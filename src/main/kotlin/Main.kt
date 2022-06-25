class Main {
    fun main() {
        val user1 = User(
            "Евгений",
            1
        )
        val user2 = User(
            "Василий",
            2
        )
        var userList = mutableListOf<User>(user1, user2)
        var message1 = Message(
            "Привет!",
            user1,
            false,
            true
        )
        var message2 = Message(
            "Как дела?",
            user2,
            false,
            true
        )
        var messages1 = mutableListOf<Message>(message1, message2)
        val chat1 = Chat(
            1,
            user1,
            user2,
            messages1
        )
        var message3 = Message(
            "Во сколько сегодня встречаемся?",
            user1,
            false,
            false
        )
        val user3 = User(
            "Татьяна",
            3
        )
        var message4 = Message(
            "В 11",
            user3,
            false,
            false
        )
        var messages2 = mutableListOf<Message>(message3,message4)
        val chat2 = Chat(
            2,
            user1,
            user3,
            messages2
        )
    }
}