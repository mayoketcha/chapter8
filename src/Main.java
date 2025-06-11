//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        // 引数なし
        Hero h = new Hero();
        System.out.println(h.name + "のHPは" + h.hp + "です");
        // 引数あり String
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.name + "のHPは" + h1.hp + "です");
        // 引数あり int
        Hero h2 = new Hero(999);
        System.out.println(h2.name + "のHPは" + h2.hp + "です");
        // 引数2つ
        Hero h3 = new Hero(999, "ミナト");
        System.out.println(h3.name + "のHPは" + h3.hp + "です");
    }
}
