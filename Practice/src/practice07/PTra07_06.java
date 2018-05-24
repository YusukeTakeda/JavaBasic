package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};


	// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		double total = 0;

		for(int value : array[0]) {
			System.out.println(value);
			total += value;

		}
		for(int value : array[1]) {
			System.out.println(value);
			total += value;
		}
		System.out.println(total / (array[0].length + array[1].length));


	}
}
