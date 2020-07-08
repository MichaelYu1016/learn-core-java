package socket;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * This program set timeout for a socket connection
 * @author ynx
 * @version V1.0
 * @date 2020-07-08
 */
public class SocketTimeoutTest {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket();
        try {
            s.connect(new InetSocketAddress("baidu.com",8001),5000);
        } catch (InterruptedIOException e) {
            System.out.println("连接超时");
        }
    }
}
