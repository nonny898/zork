package io.muzoo.ooc.weapon;

public abstract class Weapon {

        private String name;
        private int power;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getPower() {
                return power;
        }

        public void setPower(int power) {
                this.power = power;
        }
}
