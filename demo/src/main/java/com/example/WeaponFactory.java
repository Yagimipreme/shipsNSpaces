package com.example;

import java.util.ArrayList;
import java.util.List;

public class WeaponFactory {
    private static List<Weapon> standardWeapons = new ArrayList<>();

    static void createStandartWeapons(){
        standardWeapons.add(new Weapon("Laser Cannon", 10, 80, 300, 1, 5, 1));
        standardWeapons.add(new Weapon("Plasma Rifle", 15, 70, 250, 2, 4, 1));
        standardWeapons.add(new Weapon("Photon Torpedo", 25, 60, 200, 3, 3, 2));
        standardWeapons.add(new Weapon("Ion Blaster", 20, 75, 275, 2, 4, 2));
        standardWeapons.add(new Weapon("Neutron Beam", 30, 65, 150, 4, 2, 2));
        standardWeapons.add(new Weapon("Quantum Missiles", 35, 55, 350, 5, 3, 3));
        standardWeapons.add(new Weapon("Railgun", 40, 85, 400, 6, 1, 3));
        standardWeapons.add(new Weapon("Graviton Bomb", 50, 50, 100, 7, 2, 4));
        standardWeapons.add(new Weapon("A Bomb", 50, 50, 100, 7, 2, 5));
    }

    public static Weapon getStandardWeapon(String name) {
        for (Weapon weapon : standardWeapons) {
            if (weapon.getName().equals(name)) {
                return weapon;
            }
        }
        return null;
    }
    // Logik für dynamisch erstellte Waffen
    public static Weapon createSpecialWeapon(String name, int damage, int accuracy, int range, int levelRequired, int maxUses, int cooldownRounds) {
        
        return new Weapon(name, damage, accuracy, range, levelRequired, maxUses, cooldownRounds); // Beispiel
    }
}
