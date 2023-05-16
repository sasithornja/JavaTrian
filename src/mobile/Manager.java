package mobile;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Manager {

		public static void main(String[] args) {
			
			//Test
			/*System.out.println("Hello");
			Iphone myIphone = new Iphone();
			System.out.println(myIphone);
			String song = myIphone.playSong("31");
			System.out.println(song);*/
			List <Iphone> mylistIphone = new ArrayList<Iphone>();
			Iphone Iphoneadvice1 = new Iphone();
			Iphone Iphoneadvice2 = new Iphone();
			Iphone Iphoneadvice3 = new Iphone();
			mylistIphone.add(Iphoneadvice1);
			mylistIphone.add(Iphoneadvice2);
			mylistIphone.add(Iphoneadvice3);
		
			
			Map<String,Iphone> mapIphone = new HashMap<>();
			Iphone Iphoneadvice4 = new Iphone();
			Iphone Iphoneadvice5 = new Iphone();
			Iphone Iphoneadvice6 = new Iphone();
			mapIphone.put("0898885555",Iphoneadvice4);
			mapIphone.put("0813334444",Iphoneadvice5);
			mapIphone.put("0827776666",Iphoneadvice6);
			//display Phone
			System.out.println("Phone");
			for(Iphone iphone : mylistIphone) {
				System.out.println(iphone);
			}
			for(Map.Entry m:mapIphone.entrySet()) {
				System.out.println(m.getValue());
			}
			
			//Phone1
			System.out.println("--- Phone 1 ---");
			Iphoneadvice1.slideToUnlock();
			Iphoneadvice1.makeCall("0123456789");
			Iphoneadvice1.receiveCall("9876543210");
			String song1 = Iphoneadvice1.playSong("�ô�����");
			System.out.println(song1);
			String video1 = Iphoneadvice1.playSong("����͹��� 1");
			System.out.println(video1);
			Iphoneadvice1.installApplication("IG");
			String address1 =Iphoneadvice1.getLocation();
			System.out.println("Location : "+address1);
			System.out.println("===============");
			//Phone2
			System.out.println("--- Phone 2 ---");
			Iphoneadvice2.slideToUnlock();
			Iphoneadvice2.makeCall("0111111111");
			Iphoneadvice2.receiveCall("099999999");
			String song2 = Iphoneadvice2.playSong("��ҷ��ѹ��ŧ�");
			System.out.println(song2);
			String video2 = Iphoneadvice2.playSong("����͹��� 2");
			System.out.println(video2);
			Iphoneadvice2.installApplication("Line");
			String address2 =Iphoneadvice2.getLocation();
			System.out.println("Location : "+address2);
			System.out.println("===============");
			
			//Phone3
			System.out.println("--- Phone 3 ---");
			Iphoneadvice3.slideToUnlock();
			Iphoneadvice3.makeCall("022222222");
			Iphoneadvice3.receiveCall("0777777777");
			String song3 = Iphoneadvice3.playSong("�ѹ���������");
			System.out.println(song3);
			String video3 = Iphoneadvice3.playSong("����͹��� 3");
			System.out.println(video3);
			Iphoneadvice3.installApplication("Tiktok");
			String address3 =Iphoneadvice3.getLocation();
			System.out.println("Location : "+address3);
			System.out.println("===============");
			
			//Phone4
			System.out.println("--- Phone 4 ---");
			Iphoneadvice4.slideToUnlock();
			Iphoneadvice4.makeCall("0444444444");
			Iphoneadvice4.receiveCall("0666666666");
			String song4 = Iphoneadvice4.playSong("�ô�����");
			System.out.println(song4);
			String video4 = Iphoneadvice4.playSong("����͹��� 4");
			System.out.println(video4);
			Iphoneadvice4.installApplication("Shopee");
			String address4 =Iphoneadvice4.getLocation();
			System.out.println("Location : "+address4);
			System.out.println("===============");
			
			//Phone5
			System.out.println("--- Phone 5 ---");
			Iphoneadvice5.slideToUnlock();
			Iphoneadvice5.makeCall("0123456789");
			Iphoneadvice5.receiveCall("0005557777");
			String song5 = Iphoneadvice5.playSong("�ء��������");
			System.out.println(song5);
			String video5 = Iphoneadvice5.playSong("����͹��� 5");
			System.out.println(video5);
			Iphoneadvice5.installApplication("Facebook");
			String address5 =Iphoneadvice5.getLocation();
			System.out.println("Location : "+address5);
			System.out.println("===============");
			
			//Phone6
			System.out.println("--- Phone 6 ---");
			Iphoneadvice6.slideToUnlock();
			Iphoneadvice6.makeCall("0222222222");
			Iphoneadvice6.receiveCall("0333333333");
			String song6 = Iphoneadvice5.playSong("�ѹ���������෢�Ҵ�˹");
			System.out.println(song6);
			String video6 = Iphoneadvice6.playSong("����͹��� 6");
			System.out.println(video6);
			Iphoneadvice6.installApplication("Zoom");
			String address6 =Iphoneadvice6.getLocation();
			System.out.println("Location : "+address6);
		}
}
