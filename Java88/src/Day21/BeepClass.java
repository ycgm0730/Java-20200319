package Day21;

import java.awt.Toolkit;

public class BeepClass {
	public static void main(String[] args) throws InterruptedException {
		Toolkit tk = Toolkit.getDefaultToolkit();
		System.out.println("���� �������:" + Thread.currentThread());

		for (int i = 0; i < 5; i++) {
			System.out.println("���");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		});
//      t1 = new Thread(()-> {//���ٽ�
//    	  System.out.println("t1 �������:" +Thread.currentThread().getName());
//         
//            for(int i=0;i<5;i++) {
//               tk.beep();
//               try {
//               Thread.sleep(500);
//            }catch (InterruptedException e) {
//            }
//         }
//      });
		t1.start();// ������ ���� �޼ҵ�

		for (int i = 0; i < 5; i++) {
			System.out.println("���");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}