public class main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------    Welcome to LuxTech  Car Competition    ---------------------------------");
        System.out.println();

        Manual manual = new Manual("MANUAL", "MP4", 0.757f, 0.570f, 4,
                2.540f, 1.920f, 1.520f, 1.000f);
        manual.showSpecs();

        Amt amt = new Amt("AMT", "AMTP4", 0.432f, 4, 0.630f, 2.540f, 1.920f, 1.510f);
        amt.showSpecs();
        System.out.println();

        AutometicCvt automaticCvt = new AutometicCvt("Automatic - CVT", "CVT6", 0.680f, 0.499f, 6,
                2.631f, 1.440f, 1.165f, 0.096f);
        automaticCvt.showSpecs();
        System.out.println();

        AutometicDct automaticDct = new AutometicDct("Automatic - DCT", "DCT8", 0.456f, 0.543f, 8, 1.456f, 0.456f,
                6.345f, 1.765f, 2.098f, 4.876f);
        automaticDct.showSpecs();
        System.out.println();

        System.out.println("****************************   THANKYOU    ********************************************");
    }
}

