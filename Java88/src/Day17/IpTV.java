package Day17;

public class IpTV implements RemoteControl, Internet {
	   private int volume;
	   
	   
	   @Override
	   public void searchWeb() {
	      System.out.println("���ͳ��� �˻��մϴ�.");
	   }

	   @Override
	   public void turnOn() {
	      System.out.println("TV�� �մϴ�.");
	   }

	   @Override
	   public void turnOff() {
	      System.out.println("TV�� ���ϴ�.");
	   }

	   @Override
	   public void setVolume(int volume) {
	      this.volume=volume;
	      System.out.println(this.volume+"���� ������ �����մϴ�.");
	   }
	   
	}