
public class Exercise2 {

	public static void main(String[] args) {
		System.out.println("1～12の整数を入力してください。");
		int inputManth = new java.util.Scanner(System.in).nextInt();
		
		switch (inputManth) {
		case 1:
		case 2:
		case 3:
			System.out.println(inputManth + "月は冬です");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println(inputManth + "月は春です");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println(inputManth + "月は夏です");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println(inputManth + "月は秋です");
			break;
		default:
			System.out.println("入力値が誤りです");
		}
	}

}
