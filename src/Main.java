//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.name);
        h1.name = "ミナト";
        h1.hp= 100;
        Hero h2 = new Hero();
        System.out.println(h2.name);
        h2.name = "アサカ";
        h2.hp= 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp= 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
        Sword s =new Sword();
        s.name="炎の剣";
        s.damage = 10;
        h1.sword = s;
        System.out.println("現在の武器は" + h1.sword.name);


        Matango  m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango  m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h1.slip();
        m1.run();
        m2.run();
        h1.run();
        h2.run();
        h2.slip();
    }
}
