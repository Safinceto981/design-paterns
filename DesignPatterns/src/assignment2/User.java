package assignment2;

public abstract class User {
	protected Messages mediator;
	protected String name;

	public void send(String msg, Messages mediator) {
		this.mediator = mediator;
		System.out.println(name + " sends: " + msg);
		mediator.sendMessage(msg, this);

	};

	public void add(Messages mediator) {
		mediator.addUser(this);
	}

	public void remove(User user) {
		mediator.removeUser(this);
	}

	public abstract void receive(String msg, User user);

}
