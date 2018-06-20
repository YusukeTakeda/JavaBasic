package practice13.common;

public class Employee extends Person {
	private String departmentNm;
	
	public String getDepartmentNm() {
		return this.departmentNm;
	}
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	
	int departmentCnt;
	public int getDepartmentCnt() {
		return this.departmentCnt;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
	
	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

}
