package Dequy;

import java.util.Scanner;

public class menuDeQuy {

	Scanner sc = new Scanner(System.in);
	baiKhuDeQuy khuDQ = new baiKhuDeQuy();
	cacBaiDeQuy deQuy = new cacBaiDeQuy();

	public void menuDQ() {
		int c1;
		do {
			System.out.println("1. De quy giai thua");
			System.out.println("2. De quy Fibonaci");
			System.out.println("3. De quy chuyen he 10 sang he 2");
			System.out.print("Moi ban chon:");
			c1 = sc.nextInt();
			switch (c1) {
			case 1: {
				System.out.println("Giai thua cua 5 la:" + deQuy.gthua(5));
				break;
			}
			case 2: {
				System.out.println(" So hang thu 8 cua Fibo la" + deQuy.f(8));
				break;
			}
			case 3: {
				deQuy.chuyenNP(11);
				;
				break;
			}

			default:
				break;
			}
		} while (c1 < 4);
	}

	public void menuKhuDQ() {
		int c2;
		do {
			System.out.println("1. Khu de quy Giai thua");
			System.out.println("2. Khu de quy day Fibo");
			System.out.print("Moi ban chon:");
			c2 = sc.nextInt();
			switch (c2) {
			case 1:
				System.out.println("Giai thua cua 5 la:" + khuDQ.gthua(5));
				break;
			case 2:
				System.out.println("So hang thu 8 cua day Fibo:" + khuDQ.Fibo(8));
				break;
			default:
				break;
			}
		} while (c2 < 3);
	}
}
