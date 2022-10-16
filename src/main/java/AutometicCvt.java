public class AutometicCvt extends Transmission{
    float fifthGear;
    float sixthGear;
    String transmissionType;

    AutometicCvt(String transmissionType, String modelNo, float fifthGear, float sixthGear, int forwardGears, float firstGear,
                 float secondGear, float thirdGear, float fourthGear)
    {
        super(modelNo,forwardGears,firstGear,secondGear,thirdGear,fourthGear);
        this.transmissionType = transmissionType;
        this.fifthGear = fifthGear;
        this.sixthGear = sixthGear;

    }

    AutometicCvt(String modelNo, int forwardGears, float firstGear, float secondGear, float thirdGear, float fourthGear) {
        super(modelNo, forwardGears, firstGear, secondGear, thirdGear, fourthGear);
    }

    void showSpecs() {
        if (transmissionType.equalsIgnoreCase("Automatic - CVT") && modelNo.equalsIgnoreCase("cvt6"))
        {

            System.out.println("Transmission Type :  " + transmissionType +" "+ "\nTransmission model no : " +" "+ modelNo+" ");

            System.out.println("1.Forward Gears : " + forwardGears);
            System.out.println("2.1st gear ratio : " + firstGear );
            System.out.println("3.2nd gear ratio : " + secondGear);
            System.out.println("4.3rd gear ratio : " + thirdGear);
            System.out.println("5.4th gear ratio : " + fourthGear);
            System.out.println("5th gear ratio : " + fifthGear);
            System.out.println("7.6th gear ratio : " + sixthGear);
        }
    }
}
