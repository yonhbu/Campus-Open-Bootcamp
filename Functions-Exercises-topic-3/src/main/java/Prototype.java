public class Prototype {

    public static void main(String[] args) {

        //First Part
        int getResult = getSum(10,10,10);
        System.out.println(getResult);


        //Second Part
        Coche renaul = new Coche();
        renaul.getIncreaseTotalNumDoor(5);
        System.out.println(renaul.getTotalNumDoor());



    }



    //First Part
    public static int getSum (int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

}
