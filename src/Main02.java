
public class Main02 {
	public static void main(String[] args) {
		// 変数の宣言と初期化
		boolean doorClose = true;
		doorClose = false;
		// 繰り返し(ループ）処理をする
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
//			doorClose = false;
		}
	}
}
