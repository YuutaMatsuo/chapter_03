
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("1～12の整数を入力してください。");
		int month = new java.util.Scanner(System.in).nextInt();
		
		if(month == 1 || month == 2 || month == 3) {
			System.out.println("冬です");
		}else if(month == 4 || month == 5 || month == 6) {
			System.out.println("春です");
		}else if(month == 7 || month == 8 || month == 9) {
			System.out.println("夏です");
		}else if(month == 10 || month == 11 || month == 12) {
			System.out.println("秋です");
		}else {
			System.out.println("入力値が誤りです");
		}
	}

}
