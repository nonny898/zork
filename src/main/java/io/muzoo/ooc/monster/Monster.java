package io.muzoo.ooc.monster;

public abstract class Monster {

        private String name;
        private String description;
        private int HP;
        private int FULL_HP;
        private int ATK;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
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

        public int getATK() {
                return ATK;
        }

        public void setATK(int ATK) {
                this.ATK = ATK;
        }
}
