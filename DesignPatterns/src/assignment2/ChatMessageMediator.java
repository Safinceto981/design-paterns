package assignment2;

import java.util.ArrayList;
import java.util.List;



public class ChatMessageMediator implements MessageMediator {
    private List<User> users;

    private MessageMediator med;
    public ChatMessageMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(message, user);
            }
        }
        
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);

    }

	@Override
	public void removeUser(User user) {
this.users.remove(user);		
	}
}
