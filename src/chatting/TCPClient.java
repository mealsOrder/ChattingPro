package chatting;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {
	// 1. TCP 서버의 IP와 PORT를 상수로 할당
	// 실제로는 서버의 IP보다는 도메인을 작성하는 것이 좋다.
	private static final String SERVER_IP = "192.168.35.1";
	private static final int SERVER_PORT = 5000;

	public static void main(String[] args) {
		Socket socket = null;
		try {
			// 2. 서버와 연결을 위한 소켓을 생성
			socket = new Socket();

			// 3. 생성한 소켓을 서버의 소켓과 연결(connect)
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
