package io.muzoo.ooc.game;

import io.muzoo.ooc.weapon.Weapon;

import java.util.HashMap;
import java.util.Map;

public class Player {

        private int HP;
        private int FULL_HP;
        private int ATK;
        private Map<String, Weapon> inventory = new HashMap<String, Weapon>();

        public Player() {
                this.HP = 10;
                this.ATK = 10;
                this.FULL_HP = 10;

        }

        public int getHP() {
                return HP;
        }

        public void setHP(int HP) {
                this.HP = HP;
        }

        public int getATK() {
                return ATK;
        }

        public void setATK(int ATK) {
                this.ATK = ATK;
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

        public void dropWeapon(String weaponName, Game game) {
                if (inventory.containsKey(weaponName.toLowerCase())) {
                        System.out.println("You drop " + weaponName);
                        game.getLevel().getMap().getCurrentRoom().weapoenDrop(inventory.get(weaponName.toLowerCase()));
                        inventory.remove(weaponName.toLowerCase());
                } else {
                        System.out.printf("You do not have this %s weapon to drop.\n", weaponName);
                }
        }
}
