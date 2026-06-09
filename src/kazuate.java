
public class kazuate {

	public static void main(String[] args) {
		int targetNum;
		int yourNum;
		int kaisu = 0;
		
		System.out.println("数あてゲームを開始します。");  
		targetNum = new java.util.Random().nextInt(100) + 1;
		System.out.println("コンピュータは1-100までの数字を作成しました。さあ当ててみましょう！");
		
		
		while(true) {
			kaisu++;
			
			System.out.print(kaisu + "回目　あなた：　");
			yourNum = new java.util.Scanner(System.in).nextInt();
			
			if (targetNum == yourNum) {
				System.out.println("あたりです！");
				break;
			} else if (targetNum > yourNum) {
				System.out.println("もっと大きな数字です");
			} else {
				System.out.println("もっと小さな数字です");
			}
			
		}	// While の終わり
		
		System.out.println("\nゲーム終わり！");
	} // main の終わり

}
