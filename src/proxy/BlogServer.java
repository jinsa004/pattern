package proxy;

public class BlogServer implements Server{
	@Override
	public void request() {
		System.out.println("요청을 받음");
	}

}
