package io.muzoo.ooc.game;

import io.muzoo.ooc.weapon.Fist;
import io.muzoo.ooc.weapon.Weapon;

import java.util.HashMap;
import java.util.Map;

public class Player {

        private int HP;
        private int FULL_HP;
        private Weapon currentWeapon;
        private Map<String, Weapon> inventory = new HashMap<String, Weapon>();

        public Player() {
                this.HP = 10;
                this.FULL_HP = 10;
                inventory.put("fist", new Fist());
                setCurrentWeapon(inventory.get("fist"));
        }

        public int getHP() {
                return HP;
        }

        public void setHP(int HP) {
                this.HP = HP;
        }

        public int getFULL_HP() {
                return FULL_HP;
        }

        public void setFULL_HP(int FULL_HP) {
                this.FULL_HP = FULL_HP;
        }

        public void takeWeapon(Weapon weapon) {
                System.out.println("You picked up " + weapon.getName());
                inventory.put(weapon.getName().toLowerCase(), weapon);
        }

        public int getAttackPowerWithWeapon(String weaponName) {
                return getWeapon(weaponName).getPower();
        }

        public Weapon getWeapon(String weaponName) {
                if (inventory.containsKey(weaponName.toLowerCase())) {
                        return inventory.get(weaponName.toLowerCase());
                } else {
                        System.out.println("You do not have this weapon to attack.\n" +
                                "Use fist?");
                        return null;
                }
        }

        public void dropWeapon(String weaponName, Game game) {
                if (inventory.containsKey(weaponName.toLowerCase())) {
                        System.out.println("You drop " + weaponName);
                        game.getLevel().getMap().getCurrentRoom().weaponDrop(inventory.get(weaponName.toLowerCase()));
                        inventory.remove(weaponName.toLowerCase());
                } else {
                        System.out.printf("You do not have this %s weapon to drop.\n", weaponName);
                }
        }

        public Weapon getCurrentWeapon() {
                return currentWeapon;
        }

        public void setCurrentWeapon(Weapon currentWeapon) {
                this.currentWeapon = currentWeapon;
        }
}
