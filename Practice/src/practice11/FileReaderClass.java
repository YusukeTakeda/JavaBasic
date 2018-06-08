package practice11;

/**
 * ファイルの読み込みを行います。
 * @author LIKEIT
 *
 */
public class FileReaderClass {

	private FileReaderClass() {
		/* インスタンス化を禁止 */
	}

	/**
	 * 本の情報をBook型配列で返す。
	 */
	public static Book[] readBookDataFile() {

		Book[] bookList = new Book[9];

		String[][] bookInfoList = {
					{"スッキリわかるJava入門","中山清喬／国本大悟","2600","657","インプレス"},
					{"Java言語プログラミングレッスン","結城浩","2400","379","ソフトバンク"},
					{"オブジェクト指向設計実践ガイド","Sandi Metz","3280","303","技術評論社"},
					{"リーダブルコード","Dustin Boswell／Trevor Foucher","2400","237","O","REILLY"},
					{"ピアノレッスン","Dustin Boswell／Trevor Foucher","2400","237","O","REILLY"},
					{"なんかよくわからんJava","Dustin Boswell／Trevor Foucher","2400","237","O","REILLY"},
					{"わかるコード","Dustin Boswell／Trevor Foucher","2400","237","O","REILLY"},
					{"プログラミングコード","Dustin Boswell／Trevor Foucher","2400","237","O","REILLY"},
					{"リーダブル指向","Dustin Boswell／Trevor Foucher","2400","237","O","REILLY"}
				};

		for (int i = 0; i < bookList.length; i++) {
			bookList[i] = new Book(
				bookInfoList[i][0],
				bookInfoList[i][1],
				Integer.parseInt(bookInfoList[i][2]) ,
				Integer.parseInt(bookInfoList[i][3]),
				bookInfoList[i][4]
			);
		}

		return bookList;
	}
}