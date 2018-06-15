/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Slime s1 = new Slime(10, 5, 2);

		h1.setName("勇者");
		s1.setName("スライム");

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		while(true){
			if(s1.damage(h1.attack())) {
				System.out.println(h1.getName()+"は"+s1.getName()+"との戦闘に勝利した");
				break;
			}

			if(h1.damage(s1.attack())) {
				System.out.println(s1.getName()+"は"+h1.getName()+"との戦闘に勝利した");
				break;
			}

		}


		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
