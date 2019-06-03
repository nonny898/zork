package io.muzoo.ooc.weapon;

import java.util.HashMap;
import java.util.Random;

public class WeaponFactory {
        private static final HashMap<Integer, Weapon> weapons = new HashMap<Integer, Weapon>() {
                {
                        put(1, new Sword());
                        put(2, new Bow());
                        put(3, new Axe());
                }
        };

        public static Weapon getWeapon() {
                Random random = new Random();
                return weapons.get(1 + random.nextInt(weapons.size()));
        }
}
