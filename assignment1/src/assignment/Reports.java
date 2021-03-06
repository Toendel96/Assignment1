package assignment;

public class Reports {

    public static void mainReport(StoreData storedata){

        int size = StoreData.sizeOfReport(storedata.objects);
        double totaltSalg = 0;
        System.out.println("----------------------------------------------");
        System.out.println("Salgsrapport");
        System.out.println("----------------------------------------------");
        System.out.println("Totalt antall salg er " + size);
        for (int i = 0; i < size; i ++) {
            totaltSalg = totaltSalg + storedata.getItem(i).getTotalProfit();
        }
        System.out.printf("Brutto inntekt er kr.  %.2f" + ",-\n", totaltSalg);
        System.out.println("----------------------------------------------");
        System.out.println(" ");
    }


    // Stub - TODO å gjøre ferdig
    public static String salesPerRegion (StoreData storedata){

        int size = StoreData.sizeOfReport(storedata.objects);
        double totaltSalg = 0;

        for (int i = 0; i < size; i ++) {
            totaltSalg = totaltSalg + storedata.getItem(i).getTotalProfit();
        }
        String salesPerRegion = String.format(
                "----------------------------------------------" +
                "\nSalgsrapport per region" +
                "\n----------------------------------------------" +
                "\nTotalt sales: %d"+
                "\n\nBrutto inntekt er kr.  %.2f,-\n", size, totaltSalg);
        System.out.println(salesPerRegion);
        return salesPerRegion;

    }

    public static double sumTotalRevenue (StoreData sd){
        int size = StoreData.sizeOfReport(sd.objects);
        double totaltSalg = 0;
        for (int i = 0; i < size; i ++) {
            totaltSalg = totaltSalg + sd.getItem(i).getTotalProfit();
        }
        return totaltSalg;
    }

    public String highestGrossingRegion (StoreData sd) {

        String country = "";
        double sort = 0;
        int cc = 0;
        int size = sd.getObjectsSize();
        for (int i = 0; i < size; i++) {
            if (sd.getItem(i).getTotalProfit() > sort) {
                country = sd.getItem(i).getRegion();
                sort = sd.getItem(i).getTotalProfit();
                cc = i;
            }
        }
        return sd.getItem(cc).getRegion();
    }
}
