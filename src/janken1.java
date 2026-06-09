
/*
 * 			じゃんけんゲームの完成形です。
 * 
 * 			このソースコードは、まずは実行すると　1回だけコンピュータと対戦します。
 * 
 *   
 */


public class janken1 {

	public static void main(String[] args) {
		int computerChoise;		// コンピュータの手
		int yourChoise;			// あなたの選んだ手 
		
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

		// 対戦結果を判定する（問題３）
		//		条件判定の書き方はいろいろあります。下記は一例です。
		//			結果が正しければ正解とします
		
		if (computerChoise ==1 ) {		//  コンピュータがグーの場合
			if (yourChoise == 1 ) {				//		あなたがグーの場合
				System.out.println("\nあいこです");
			} else if (yourChoise == 2 ) {		//		あなたがチョキの場合
				System.out.println("\nあなたの負けです");
			} else if (yourChoise == 3) {		//		あなたがパーの場合
				System.out.println("\nあなた勝ちです");
			} else {
				//   何もしない（このケースは発生しないがブロックを一応作っておく）
			}
		} else if ( computerChoise == 2 ) {  // コンピュータがチョキを出した場合
			if (yourChoise == 1 ) {				//		あなたがグーの場合
				System.out.println("\nあなたの勝ちです");
			} else if (yourChoise == 2 ) {		//		あなたがチョキの場合
				System.out.println("\nあいこです");
			} else if (yourChoise == 3) {		//		あなたがパーの場合
				System.out.println("\nあなた負けです");
			} else {
				//   何もしない（このケースは発生しないがブロックを一応作っておく）
			}
		} else if ( computerChoise == 3 ) {  //コンピュータがパーを出した場合
			if (yourChoise == 1 ) {				//		あなたがグーの場合
				System.out.println("\nあなたの負けです");
			} else if (yourChoise == 2 ) {		//		あなたがチョキの場合
				System.out.println("\nあなたの勝ちです");
			} else if (yourChoise == 3) {		//		あなたがパーの場合
				System.out.println("\nあいこです");
			} else {
				//   何もしない（このケースは発生しないがブロックを一応作っておく）
			}
		} else {
			// 何もしない（このケースは発生しないがブロックを一応作っておく）
			
		}
		
		System.out.println("\nゲームが終わりました");
		
		
	}

}
