package chain_of_responsibility.messagesnder;

public class Client {

    public static void main(String[] args) {
        User user = new User();

//        MessageSenderChain smsSenderChain = new SmsSenderChain();
//        MessageSenderChain pushSenderChain = new PushSenderChain();
//        MessageSenderChain emailSenderChain = new EmailSenderChain();
//        smsSenderChain.setNext(pushSenderChain)
//            .setNext(emailSenderChain);
//        smsSenderChain.setNext(pushSenderChain);
//        pushSenderChain.setNext(emailSenderChain);

        MessageSenderChain smsSenderChain = new SmsSenderChain();
        smsSenderChain.setNext(new PushSenderChain())
            .setNext(new EmailSenderChain());


        smsSenderChain.send(user, new MessageDetail());
    }

}
