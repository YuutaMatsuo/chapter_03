
public class Main04 {
	public static void main(String[] args) {
		
		System.out.println("あなたの苗字をひらがなで入力してください");
		String name01 = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("あなたの名前をひらがなで入力してください");
		String name02 = new java.util.Scanner(System.in).nextLine();
		
		if(name01.equals("みなと") && name02.equals("ゆうすけ")) {
			System.out.println("同姓同名です。");
			
		}else if(name01.equals("みなと") || name02.equals("ゆうすけ")) {
			System.out.println("みなとゆうすけさんと一部氏名が一緒です");
			
//		}else{
//			System.out.println("みなとゆうすけさんとは違う名前です");
			
		//別解 !を先頭につけることで条件式の評価を反転（否定）することができる
		}else if(!(name01.equals("みなと") || name02.equals("ゆうすけ"))) {
			System.out.println("みなとゆうすけさんとは違う名前です");
		}
	}
}
