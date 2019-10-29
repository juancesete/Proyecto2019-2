package pingalamaquina;

import java.io.IOException;
import java.net.InetAddress;

public class Pingalamaquina {
public static void main(String[] args) {
InetAddress ping;
String ip = "172.21.2.23"; // Ip de la máquina remota
try {
ping = InetAddress.getByName(ip);
if(ping.isReachable(5000)){
System.out.println(ip+" - responde!");
}else {
System.out.println(ip+" - no responde!");
}
} catch (IOException ex) { System.out.println(ex); }
}
}


