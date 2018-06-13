/*
 * PTra13_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;

public class PTra13_02 {
	/*
	 * ★ common.Characterクラスを継承した、common.Heroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 */

	public static void main(String[] args) {
		Hero h1 = new Hero();

		// ★ common.Heroクラスをインスンタンス化してください
		h1.setName("勇者");
		// ★ common.Heroインスタンスのnameに"勇者"を設定して下さい
		System.out.println(h1.showParameter());


		// ★ common.Heroインスタンスのキャラクター情報を表示してください

	}
}

//インスタンスから呼ぶとき　staticがないメソッド
// クラスから呼ぶときstaticがついてるやつ