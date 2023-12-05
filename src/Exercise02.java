
public class Exercise02 {

	public static void main(String[] args) {
		 //for文を用いて、0から100までの値がスペース区切りで表示されるプログラムを作成してください。
		for(int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// while文を用いて、0から100までの値がスペース区切りで表示されるプログラムを作成してください。
		int k = 0;
		while(k <= 100) {
			System.out.print(k + " ");
			k++;
		}
		System.out.println();
		
		//for文を用いて、100から0までの値がスペース区切りで表示されるプログラムを作成してください。
		for (int j = 100;j >= 0; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		//while文を用いて、100から0までの値が２つとばしのスペース区切りで表示されるプログラムを作成してください。
		int n = 100;
		while(n >= 0) {
			System.out.print(n + " ");
			n -= 2;
		}
		System.out.println();
		
		//2重ネストのfor文を用いて、1から100までの値を以下の仕様で出力するプログラムを作成してください。
//		①各値はスペース区切りで表示する。
//		②値を10個出力する度に改行をおこなう。
//		③各行の初めには【行番号】を表示する。
		int g = 0; //行数をカウントする変数
		
		for(int s = 1;s <= 100; s++) {
			if(s % 10 == 1 || s == 1) { //各行の始まりなら
				System.out.print("\n【" + g + "】" + s + " ");
				g++;
			}else{
				System.out.print(s + " ");
			}
		}
	}

}
