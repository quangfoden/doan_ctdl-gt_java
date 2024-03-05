package Main;

import Dequy.menuDeQuy;
import Dslkdon.menuDSLKDON;
import java.util.Scanner;

public class menuMain {

	public static void main(String[] args) {
		int c1;
		Scanner sc = new Scanner(System.in);
		menuDeQuy deQuy = new menuDeQuy();
		menuDSLKDON list = new menuDSLKDON();
		do {
			System.out.println("1. Lam viec voi De quy va khu De quy");
			System.out.println("2. Lam viec voi Danh sach lien ket don");
			System.out.println("3. Lam viec voi Danh sach lien ket kep");
			System.out.print("Moi ban chon:");
			c1 = sc.nextInt();
			switch (c1) {
			case 1:
				int tam;
				do {
					System.out.println("1. Lam viec voi De quy ");
					System.out.println("2. Lam viec  khu De quy");
					System.out.println("3. Moi ban chon:");
					tam = sc.nextInt();
					switch (tam) {
					case 1:
						deQuy.menuDQ();
						break;
					case 2:
						deQuy.menuKhuDQ();
						break;
					default:
						break;
					}
				} while (tam < 3);
				break;

			case 2: {
				list.menuList();
				break;
			}
			default:
				break;
			}
		} while (c1 < 3);
	}

}
