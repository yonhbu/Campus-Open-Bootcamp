public class Coche {

  private int totalNumDoor = 4;

    public int getTotalNumDoor() {
        return totalNumDoor;
    }

    public int getIncreaseTotalNumDoor (int num) {
        totalNumDoor =+ num;
        return totalNumDoor;
    }
}
