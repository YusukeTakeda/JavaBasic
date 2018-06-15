/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {
		SuperHero sh1 = new SuperHero();
		Slime s1 = new Slime(10, 5, 2);
		Item equipment = new Item("こんぼう",4);

		sh1.setName("勇者(装備あり)");
		s1.setName("スライム");



		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください


		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		


		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		sh1.setEquipment(equipment);
		
		
		
		while(true){
			if(s1.damage(sh1.attack())) {
				System.out.println(sh1.getName()+"は"+s1.getName()+"との戦闘に勝利した");
				break;
			}

			if(sh1.damage(s1.attack())) {
				System.out.println(s1.getName()+"は"+sh1.getName()+"との戦闘に勝利した");
				break;
			}

		}

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}