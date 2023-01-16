package chain_of_responsibility.messagesnder;

import static java.util.Objects.nonNull;

public abstract class MessageSenderChain {
    private MessageSenderChain next;

    public MessageSenderChain setNext(MessageSenderChain next) {
        this.next = next;
        return next;
    }

    public void send(User user, MessageDetail messageDetail) {
        // TODO
        execute(user, messageDetail); // 하위 메서드가 구현

        // next
        if (nonNull(next)) {
            next.send(user, messageDetail);
        }

    }

    protected abstract void execute(User user, MessageDetail messageDetail);

}
