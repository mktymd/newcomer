
/*
 * 			じゃんけんゲームの完成形です。
 * 
 * 			このソースコードは、ループ構造を使って、何回でも対戦できるように改良してあります。
 * 				また、判定をswitch 文に改良してあります
 * 
 */



public class janken2 {

	public static void main(String[] args) {
		int computerChoise;		// コンピュータの手
		int yourChoise;			// あなたの選んだ手
		String cont;			// ゲームをループする時に利用する変数
		cont = "y";					// 変数を初期化しておく
		
		
		// 繰り返し構造の始まり。
		// 最低1回はループを回るので　do ・・・・・ While のループを採用
		do {

			
			//	コンピュータの手を乱数によって生成する　
			computerChoise = new java.util.Random().nextInt(3) + 1;		// 乱数を生成し＋１をする　
																		// 1-3の乱数を生成し、computerChoise 変数に代入する
			// 乱数によって生成された数字によって、メッセージを表示する
			switch (computerChoise) {
				case  1 ->{
					System.out.println("コンピュータはグーを出しました");
				}
				case  2 ->{
					System.out.println("コンピュータはチョキを出しました");
				}
				case  3 ->{
					System.out.println("コンピュータはパーを出しました");
				}
				default -> {
						//  1-3まで歯科乱数の結果は生成されないが、一応作っておく
				}
			}
			
			// コンピュータと対戦するようにする（問題２）
			
			// あなたにグーチョキパーを選んでもらう　グー・チョキ・パーは１，２，３で選ぶ
			System.out.print("あなたの手を選んでください  1:グー　2:チョキ  3:パー　＞");
			yourChoise = new java.util.Scanner(System.in).nextInt(); 
			
			if (yourChoise == 1 ) {
				System.out.println("あなたはグーを出しました。");
			} else if (yourChoise == 2 ) {
				System.out.println("あなたはチョキを出しました。");
			} else if (yourChoise == 3 ) {
				System.out.println("あなたはパーを出しました。");
			}
	
			//		 対戦結果を判定する（問題３）
			//		条件判定の書き方はいろいろあります。下記は一例です。
			//			結果が正しければ正解とします
			
			switch (computerChoise) {
				case 1 -> {									//	コンピュータがグーを出したケース
					switch (yourChoise) {
						case 1 -> {
							System.out.println("\nあいこです");
						}
						case 2 -> {
							System.out.println("\nあなたの負けです");
						}
						case 3 -> {
							System.out.println("\nあなたの勝ちです");	
						}
						default -> {
							// 何もしない
						}
					}
				}
				case 2 -> {									//	コンピュータがチョキを出したケース
					switch (yourChoise) {
						case 1 -> {
							System.out.println("\nあなたの勝ちです");
						}
						case 2 -> {
							System.out.println("\nあいこです");
						}
						case 3 ->{
							System.out.println("\nあなた負けです");
						}
						default -> {
							// 何もしない
						}
					}
				}	
				case 3 -> {									//	コンピュータがパーを出したケース
					switch (yourChoise) {
						case 1 -> {
							System.out.println("\nあなたの負けです");
						}
						case 2 -> {
							System.out.println("\nあなたの勝ちです");
						}
						case 3 ->{
							System.out.println("\nあいこです");
						}
						default -> {
							// 何もしない
						}
					}
				}	
				default -> {
					//  何もしない
				}
			
			}
			
			
			
			//	対戦を続行するか入力を求める
			System.out.print("\n\n対戦を続けますか？(y/n) > ");
			cont = new java.util.Scanner(System.in).nextLine();
			
		}while ( cont.equals("y"));		//  入力値が　"y" なら対戦を続行する　"y"　以外なら終了する
		
		System.out.println("ゲームが終わりました");
		
		
	}

}
