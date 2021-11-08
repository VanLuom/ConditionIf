package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 9.1 Kiem tra so nguyen duong hay nguyen am 
		double a = sc.nextInt();
		if(a > 0) {
			System.out.println("So nguyen duong: " + a);
		}else {
			if(a != 0)
				System.out.println("So nguyen am: " + a);
		}
		// 9.2 Kiem tra n chia het cho 3 hay 5
		int n = sc.nextInt();
		if(n %  3 == 0) {
			System.out.println("So chia het cho 3");
		}
		if(n % 5 == 0) {
			System.out.println("So chia het cho 5");
		}
		// 9.3 Viet chuong trinh nhap vao thang trong nam
		int t = sc.nextInt();
		System.out.println("Nhap vao thang trong nam");
		if( t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12)
			System.out.println("Thang co 30 ngay");
		else if( t == 4 || t == 6|| t == 9 || t == 11)
			System.out.println("Thang co 31 ngay");
		else if( t == 2)
			System.out.println("Thang co 28 ngay");
		// 9.4 Giai phuong trinh bac 2
		System.out.println("Nhap vao a , b, c");
		a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				}else {
					System.out.println("Phuong trinh vo nghiem");
				}
			}else {
				System.out.println("Phuong trinh co mot nghiem " + (-c/b));
			}
		}else {
			double x1 , x2;
			double denta = b*b - 4*a*c;
			if(denta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}else if(denta == 0) {
				x1 = -b / 2*a;
				System.out.println("Phuong trinh co nghiem kep x1 = x2= " +x1);				
			}else {
				x1 = (-b + Math.sqrt(denta))/ 2*a;
				x2 = (-b - Math.sqrt(denta))/ 2*a;
				System.out.println("Phuong trinh co hai nghiem x1 = "+ x1 +" x2= "+ x2);
			}
		}
		// 9.5 Kiem tra co phai ba canh cua tam giac
		int g = sc.nextInt();
		System.out.println("Nhap a:");
		int h = sc.nextInt();
		System.out.println("Nhap b:");
		int j = sc.nextInt();
		System.out.println("Nhap c:");
		if(g + h > j && h + j > g && g + j > h)
			System.out.println("a , b , c la ba canh cua 1 tam giac");
			
		
		
		
		
	}

}
