package sample;

public class MessageBeanImpl implements MessageBean{

	private String name; // 생성자 통한 주입
	private String greeting; // setter 통한 주입
	
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
