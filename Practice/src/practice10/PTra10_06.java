package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
		Car[] cars= new Car[3];

		Car car1 = new Car();
		car1.color = "blue";
		car1.gasoline = 100;

		Car car2 = new Car();
		car2.color = "yellow";
		car2.gasoline = 70;

		Car car3 = new Car();
		car3.color = "orange";
		car3.gasoline = 30;

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		final int distance = 300;

		for(int i = 0; i < cars.length; i++) {
			int n = 0; //時間
			int x ; //残りのガソリン
			int susumi = 0;

			while(true) {
			susumi += cars[i].run();
			n++; //一回のループ（１時間ずつ増える）
			x = cars[i].gasoline;
			System.out.println(cars[i].color+"の車の現在の走行距離:"+susumi+" 残りのガソリン:"+x);

				if(cars[i].gasoline < 0) {
					System.out.println(cars[i].color+"の車は目的地に到達できませんでした");
					break;
				}

				if(distance <= susumi) {
					System.out.println(cars[i].color+"の車は目的地にまで"+n+"時間かかりました。残りのガソリンは、"+x+"リットルです");
					break;
				}

			}
		}

	}

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */


}
