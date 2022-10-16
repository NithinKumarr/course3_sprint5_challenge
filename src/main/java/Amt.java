public class Amt extends Transmission{
    float fifthGear;
    String transmissionType;
    Amt(String transmissionType, String modelNo, float fifthGear, int forwardGears, float firstGear,
        float secondGear, float thirdGear, float fourthGear)
    {
        super(modelNo,forwardGears,firstGear,secondGear,thirdGear,fourthGear);
        this.transmissionType = transmissionType;
        this.fifthGear = fifthGear;
    }
    void showSpecs()
    {
        if (transmissionType.equalsIgnoreCase("Amt") && modelNo.equalsIgnoreCase("Amtp4"))
        {

            System.out.println();
            System.out.println("Transmission Type : " + transmissionType);
            System.out.println("Transmission model no : " + modelNo);
            System.out.println("1) Forward Gears : " + forwardGears);
            System.out.println("2) 1st gear ratio : " + firstGear );
            System.out.println("3) 2nd gear ratio : " + secondGear);
            System.out.println("4) 3rd gear ratio : " + thirdGear);
            System.out.println("5) 4th gear ratio : " + fourthGear);

        }
        if (transmissionType.equalsIgnoreCase("Amt") && modelNo.equalsIgnoreCase("Amtd5"))
        {

            System.out.println();
            System.out.println("Transmission Type : " + transmissionType );
            System.out.println("Transmission model no : " + modelNo);
            System.out.println("1) Forward Gears : " + forwardGears );
            System.out.println("2) 1st gear ratio : " + firstGear);
            System.out.println("3) 2nd gear ratio : " + secondGear);
            System.out.println("4) 3rd gear ratio : " + thirdGear);
            System.out.println("5) 4th gear ratio : " + fourthGear );
            System.out.println("6) 5th gear ratio : " + fifthGear);

        }


    }
}
