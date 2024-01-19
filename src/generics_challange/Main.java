package generics_challange;

/*
 *
 *
 *
 *
 * */
public class Main {

    public static void main(String[] args) {


        var nationalUsParks = new Park[]{new Park("yellowstone", "44.4482, -110.5916"),
                new Park("grand canyon", "36.1085, -112.0965"),
                new Park("yosemite", "36.5,-115.5845")};

        Layer<Park> parkLayer = new Layer<>(nationalUsParks);
        parkLayer.renderLayer();

        var majorUsRivers = new River[]{new River("missipi","47.2, -95.23","55.3, 25.5","-35.1156, -90.06"),
                new River("missouri","45.9239, -111.4983","38.81, -90.1218")};

        Layer<River> riverLayer = new Layer<>(majorUsRivers);
        riverLayer.addElements(new River("colorado","40.90, -101.443","31.41, -95.148"));
        riverLayer.renderLayer();






    }

}
