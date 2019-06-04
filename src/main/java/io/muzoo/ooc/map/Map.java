package io.muzoo.ooc.map;

import io.muzoo.ooc.game.Game;

public abstract  class Map {
        private int currentX = 0;
        private int currentY = 0;

        private int maxX = 2;

        private int maxY = 2;
        private int outX;
        private int outY;
        private Room[][] rooms = new Room[maxX][maxY];

        public int getCurrentX() {
                return currentX;
        }

        public void setCurrentX(int currentX) {
                this.currentX = currentX;
        }

        public int getCurrentY() {
                return currentY;
        }

        public void setCurrentY(int currentY) {
                this.currentY = currentY;
        }

        public int getMaxX() {
                return maxX;
        }

        public int getMaxY() {
                return maxY;
        }

        public int getOutX() {
                return outX;
        }

        public void setOutX(int outX) {
                this.outX = outX;
        }

        public int getOutY() {
                return outY;
        }

        public void setOutY(int outY) {
                this.outY = outY;
        }

        public  void setRooms(Room[][] rooms) {
                this.rooms = rooms;
        }

        public boolean goLeft(Game game) {
                return currentX - 1 >= 0;
        }

        public boolean goRight(Game game) {
                return currentX + 1 < maxX;
        }

        public boolean goUp(Game game) {
                return currentY + 1 < maxY;
        }

        public boolean goDown(Game game) {
                return currentY - 1 >= 0;
        }

        public Room getCurrentRoom() {
                return rooms[currentX][currentY];
        }

        public boolean checkIfMapClear(int x, int y) {
                return this.currentX == x && this.currentY == y;
        }
}
