public class Main {

    public static void main(String[] args) {
	// write your code here
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyboard(100);
    }
    /**
     * output:
     * Sony: channel - 100
     * Logitech use keyword to set channel.
     */
}
