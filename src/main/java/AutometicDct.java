public class AutometicDct extends Transmission{
    float fifthGear;
    float sixthGear;
    float seventhGear;
    float eightGear;
    String transmissionType;

    AutometicDct(String transmissionType, String modelNo, float fifthGear, float sixthGear, int forwardGears, float firstGear,
                 float secondGear, float thirdGear, float fourthGear, float seventhGear, float eightGear) {
        super(modelNo,forwardGears,firstGear,secondGear,thirdGear,fourthGear);
        this.transmissionType = transmissionType;
        this.fifthGear = fifthGear;
        this.sixthGear = sixthGear;
        this.seventhGear = seventhGear;
        this.eightGear = eightGear;
    }
    void  showSpecs()
    {
        System.out.println("Transmission Type : "+ " " +transmissionType+ " " + "\nTransmission model no : " +" "+modelNo+" ");
        System.out.println("1.Forward Gears : " +forwardGears);
        System.out.println ("2.1st gear ratio : "+firstGear);
        System.out.println("3.2nd gear ratio : "+secondGear);
        System.out.println("4.3rd gear ratio : "+thirdGear);
        System.out.println("5. 4th gear ratio : "+fourthGear);
        System.out.println("6. 5th gear ratio : " + fifthGear);
        System.out.println ("7. 6th gear ratio : " + sixthGear);
        System.out.println("8. 7th gear ratio : "+seventhGear);
        System.out.println("9.8th gear ratio : "+eightGear);
    }
}
