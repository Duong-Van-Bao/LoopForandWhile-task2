import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời nhập vào số n:");
		int n = Integer.parseInt(scan.nextLine());
		float tong = tinhTongFor(n);
		System.out.println("Tổng từ 1 - n là: " + tong);
		float tongWhile = tinhTongWhile(n);
		System.out.println("Tổng từ 1 - n là: " + tongWhile);
	}

	public static float tinhTongFor(int n) {
		float tong = 0;
		for (int i = 1; i <= n; i++) {
			tong += i;
		}
		return tong;
	}

	public static float tinhTongWhile(int n) {
		float tong = 0;
		int i = 1;
		while (i <= n) {
			tong += i;
			i++;
		}
		return tong;
	}
}
