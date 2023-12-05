
public class Main08 {
	public static void main(String[] args) {
		
		//1から10までカウントアップで表示する
		System.out.println("１から１０まで表示する");
		for(int i = 0;i < 10; i++) {
			 System.out.println(i + 1);
		}
		
		//10から1までカウントダウンで表示する
		System.out.println("\n１０から１まで表示する");
		for(int i = 10;i > 0; i--) {
			System.out.println(i);
		}
		
		//2.4.6.8.10と２ずつ増やしてカウントアップで表示する
		System.out.println("\n２ずつ増やして表示する");
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i + 2);
		}
	}
}
