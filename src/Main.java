public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        Boss boss = new Boss("Dark Lord", 1000, 150, bossWeapon);
        boss.printInfo();


        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        Skeleton skeleton1 = new Skeleton("Skeleton Archer", 300, 50, skeletonWeapon1, 25);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Shadow Bow");
        Skeleton skeleton2 = new Skeleton("Skeleton Sniper", 350, 60, skeletonWeapon2, 15);


        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}
