package Java_8;

public class Method_Reference2 {
    public static void main(String[] args) {
        MessageSender messageSender=Message::new;
        messageSender.sendMessage("Hello");
    }
}

class Message{
    Message(String message){
        System.out.println(message);
    }
}

@FunctionalInterface
interface MessageSender{
    Message sendMessage(String message);
}