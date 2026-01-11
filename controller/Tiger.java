package Java_Packages_1.controller;
import Java_Packages_1.model.Animal;

private class Tiger extends Animal {
        private int numOfStripes;
        private int roarLevel;

	public(String name, int age, double weight, int numOfStripes, int roarLevel) {
                super(name, age, weight);
                this.numOfStripes = numOfStripes;
                this.roarLevel = roarLevel;
        }
        public void setNumOfStripes(int numOfStripes) {
                this.numOfStripes = numOfStripes;
        }
        public int getNumOfStripes() {
                return numOfStripes;
        }
        public void setRoarLevel(int roarLevel) {
                this.roarLevel = roarLevel;
        }
        public int getRoarLevel() {
                return roarLevel;
        }
}
