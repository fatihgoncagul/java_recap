package oop_interfaces_challange;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("sydeny town hall",UsageType.GOVERNMENT));
        mappables.add(new Building("Syndey opera house",UsageType.ENTERTAINMENT));
        mappables.add(new Building("stadium australia",UsageType.SPORTS));


        mappables.add(new UtilityLine("college st",UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("olympic blvd",UtilityType.WATER));

        for (var m : mappables){
            Mappable.mapIt(m);
        }

    }

}
