package Chapter04.Simple04;

public class Test {
	public static void main(String[] args) {
		// 1.U��
		UsbInterface uDisk = new UDisk();
		uDisk.service();

		// 2.USB����
		UsbInterface usbFan = new UsbFan();
		usbFan.service();
	}
}
