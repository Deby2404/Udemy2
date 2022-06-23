package rabbit;

//オブジェクト（もの）：　うさぎ
//メンバ変数（どんなものか）：　かわいい、怖がり、モフモフ, 基本的にはprivate
//メソッド(どう動けるか)：　寝る、食べる、跳ねる、走る


public class Rabbit {
	
	int age; //メンバ変数（年齢を格納）
	String personality; //メンバ変数（性格を格納）
	
	void setAge(int newAge) {//値を設定するもの
		age = newAge;
	}
	
	int getAge() {//getは「return」を使って値を返すもの
		return age;
	}

}
