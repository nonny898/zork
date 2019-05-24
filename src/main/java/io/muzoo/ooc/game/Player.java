package io.muzoo.ooc.game;

public class Player {

        private int HP;
        private int FULL_HP;
        private int ATK;

        public Player(){
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
}
