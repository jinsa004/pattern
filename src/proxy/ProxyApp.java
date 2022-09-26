package proxy;

public class ProxyApp {
	public static void main(String[] args) {
//		BlogServer s = new BlogServer();
		ProxyServer ps = new ProxyServer(new BlogServer());	 // 바라보는 대상이 프록시 서버로 변경됨
		ps.request();
	}
 }
