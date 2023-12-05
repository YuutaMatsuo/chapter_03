
public class Exerise01 {

	public static void main(String[] args) {
		//キーボードから入力を受け付け（半角整数のみ入力されることを前提としてよい）、
		//受け取った値に応じて以下の文字列を表示するプログラムをif文を用いて作成してください。
		
		System.out.print("１～１２までの数値を入力してください >");
		int scan = new java.util.Scanner(System.in).nextInt();
		
		switch(scan) {
		case 1:
		case 2:
		case 3:
			System.out.println("冬です");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("春です");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("夏です");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("秋です");
			break;
		}
	}
}
