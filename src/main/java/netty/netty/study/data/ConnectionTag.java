package netty.netty.study.data;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConnectionTag {
    private final Integer equipmentId;
    private final String ip;
    private final Integer port;

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    /**
     * 접속 여부 (세터)
     */
    public void setConnected(boolean connected) {
        System.out.println("Connection Status : "+connected);
    }

}
