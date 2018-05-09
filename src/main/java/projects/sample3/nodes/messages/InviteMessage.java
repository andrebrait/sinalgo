package projects.sample3.nodes.messages;

import lombok.Getter;
import lombok.Setter;
import sinalgo.nodes.messages.Message;

/**
 * Message sent by an antenna to invite adjacent mobile nodes to join
 */
@Getter
@Setter
public class InviteMessage extends Message {

    private boolean requireSubscription = false; // if true, the receiver needs to subscribe even if it is already
    // subscribed

    @Override
    public Message clone() {
        return this; // read-only policy
    }

}
