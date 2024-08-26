
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(40);
        boss.setTypeOfProtection("kinetic");
        System.out.println("Boss Details:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Type of Protection: " + boss.getTypeOfProtection());


        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Details:");
        for (Hero hero : heroes) {
            System.out.println(hero);
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero petya = new Hero(45, 80, "Power");
        Hero ivan = new Hero(55, 70);
        Hero larisa = new Hero(65, "KingPower", 60);

        return new Hero[] { petya, ivan, larisa };
    }
}