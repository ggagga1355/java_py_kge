package exam;

//이메일로 보내던지 SMS로 보내던지 방법 상관없이 "전송만"하는 역할
public class NotificationService  {
	
	public void notifyUser(MessageSender sender, String message) {
		//어떤 종류의 전달방식이 오더라도 둘 다 send()메서드를 사용한다.
		sender.send(message);		
	}
	
}
