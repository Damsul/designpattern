package chain_of_responsibility.messagesnder;

public class EmailSenderChain extends MessageSenderChain {

    @Override
    protected void execute(User user, MessageDetail messageDetail) {
        System.out.println("email 전송!");
    }
}
