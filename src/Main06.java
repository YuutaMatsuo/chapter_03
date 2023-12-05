
public class Main06 {
	public static void main(String[] args) {
		int month = 13;

		while (month > 0) {
			System.out.println("今は何月ですか？（数値で入力）");
			month = new java.util.Scanner(System.in).nextInt();
			
			switch (month) {
			case 1:
			case 2:
			case 3:
				System.out.println(month + "月は冬です");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println(month + "月は春です");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println(month + "月は夏です");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println(month + "月は秋です");
				break;
			}
		}
	}
}
