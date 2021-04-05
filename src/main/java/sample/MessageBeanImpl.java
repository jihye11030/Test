package sample;

public class MessageBeanImpl implements MessageBean{

	private String name; // ������ ���� ����
	private String greeting; // setter ���� ����
	
	public MessageBeanImpl(String name) {
		this.name = name;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	@Override
	public void sayHello() {
		System.out.println(greeting+"~ "+name+"!");
	}

}
