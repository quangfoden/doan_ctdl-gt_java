package Dslkdon;

import java.util.Scanner;

public class menuDSLKDON {

	Scanner sc = new Scanner(System.in);
	LinkList list = new LinkList();

	public void menuList() {
		int c1;
		do {
			System.out.println("1. Doc danh sach tu file");
			System.out.println("2. Hien thi Danh sach");
			System.out.println("3. Dien du lieu vao truong ket qua");
			System.out.println("4. Chen cuoi");
			System.out.print("Moi ban chon:");
			c1 = sc.nextInt();
			switch (c1) {
			case 1: {
				list.docfile();
				break;
			}
			case 2: {
				list.printList();
				break;
			}
			case 3: {
				list.kq();
				break;
			}
			case 4: {
				System.out.println("Nhap ma can chen:");
				sc.nextLine();
				String maNV = sc.nextLine();
				System.out.println("Nhap ho ten can chen:");
				String hoTen = sc.nextLine();
				System.out.println("Nhap diem can chen:");
				double diem = sc.nextDouble();
				list.chencuoi(maNV, hoTen, diem);
				break;
			}
			default:
				break;
			}
		} while (c1 < 5);
	}
}
