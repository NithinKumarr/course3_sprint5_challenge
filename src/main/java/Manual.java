public class Manual extends Transmission{
    float fifthGear;
    float sixthGear;
    String transmissionType;
    Manual(String transmissionType,String modelNo,float fifthGear,float sixthGear, int forwardGears,float firstGear,
           float secondGear,float thirdGear, float fourthGear)
    {
        super(modelNo,forwardGears,firstGear,secondGear,thirdGear,fourthGear);
        this.transmissionType=transmissionType;
        this.fifthGear=fifthGear;
        this.sixthGear=sixthGear;

    }
    void  showSpecs()
    {
        System.out.println("Transmission Type : " +transmissionType+ "\nTransmission model no : " +modelNo);
        System.out.println("1.Forward Gears : "+forwardGears+"\n2.1st gear ratio : "+firstGear+"\n3.2nd gear ratio : "+secondGear+
                "\n4.3rd gear ratio : "+thirdGear+ "\n5.4th gear ratio : "+fourthGear);
        if (transmissionType.equalsIgnoreCase("manual") && modelNo.equalsIgnoreCase("mp4"))
        {
            System.out.println();
        }
        if(transmissionType.equalsIgnoreCase("manual")&& modelNo.equalsIgnoreCase("mp5"))
        {

            System.out.print("6.5th gear ratio : "+fifthGear);
        }
        if(transmissionType.equalsIgnoreCase("manual")&& modelNo.equalsIgnoreCase("mp6"))
        {

            System.out.print("\n6.5th gear ratio : "+fifthGear+"\n7.6th gear ratio : "+sixthGear);
        }
        if(transmissionType.equalsIgnoreCase("manual")&& modelNo.equalsIgnoreCase("md5"))
        {

            System.out.println("\n6.5th gear ratio : "+fifthGear);
        }
        if(transmissionType.equalsIgnoreCase("manual")&& modelNo.equalsIgnoreCase("md6"))
        {

            System.out.println("\n6.5th gear ratio : "+fifthGear+"\n7.6th gear ratio : "+sixthGear);
        }

    }
}
