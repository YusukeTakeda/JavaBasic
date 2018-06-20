/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		Java2Month j = (Java2Month) room ;
		//強制的にみなす
		String[] c = j.getCurriculum();
//ストリングス型の配列の変数を用意する。→こうなっちゃうから[Ljava.lang.String;@70dea4e

		// 取得したカリキュラム情報を全て出力してください
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		

	}
}
