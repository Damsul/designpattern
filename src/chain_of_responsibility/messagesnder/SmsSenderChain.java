package chain_of_responsibility.messagesnder;

public class SmsSenderChain extends MessageSenderChain {

    @Override
    protected void execute(User user, MessageDetail messageDetail) {
        System.out.println("SMS 메세지 전송!");
    }
}
