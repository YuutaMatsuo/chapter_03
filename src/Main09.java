
public class Main09 {
	public static void main(String[] args) {

//		for (int i = 1; i < 10; i++) {
//			if (i == 3) {
////				break;
//				continue;
//			}
//			for (int j = 1; j < 10; j++) {
//
//				System.out.print(i * j);
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}

		for(int i = 1;i < 10; i++) {
			for(int j = 1;j < 10; j++) {
				if(i*j < 10) {
					String sumA = "0" + i * j;
					System.out.print(sumA);
				}else {
					int sumB = i * j;
					System.out.print(sumB);
				}
				System.out.print(" ");
			}
			System.out.println("");
		}

	}
}
