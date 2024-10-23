
/* <h2>Werbeanzeige </h2>
Legt ein neues Projekt mit dem Namen „XxWerbeanzeige“ an. Und setzt die folgende Werbeanzeige
um:
Ausgabe 15 TopSellern:
1. Rosen 5 € statt 10
2. Schuhe 30 € statt 80 €
3. Mehl heute nur 99 Cent statt 1,50 €
4. Tomaten 1,50 €  statt 3,00 €
5. ***Absoluter Spritzenpreis***
Sprudel 4,99 €
6. ####Jetzt aber zuschlagen####
Kaffee 2,99 €
7. Nudeln 0,65 €
8. Mundwasser 5,41 €
9. ->Bier 12,99 €
10. Tee 0,60 €
11. …
5 Weitere Produkte sind ich zu überlegen
Produktpreise sind als double zu definieren. Produktnamen als String.
Nachkommastellenformatierung ist egal.
Jeder Produktpreis soll vor der Ausgabe überprüft werden, sollte der Preis kleiner als 5 € sein soll der
Zusatz „Absoluter Spitzenpreis“ vor dem Produktnamen ausgegeben werden.
Ist der Preis unter 3 € so soll vor dem Produktnamen stehen „Jetzt aber zuschlagen“.
Ist der Preis zwischen 10 und 20 € so soll der Produktname mit einem Pfeil versehen werden: „->“
*/
public class Main {
    //region 0 : Konstanten
    private static final String APPLICATION_NAME = "\n\n##### Werbenanzeige ##### \n";
    private static final String ADVERTISEMENT_MESSAGE_ARROW     = "\n->\t";
    private static final String ADVERTISEMENT_MESSAGE_TOP_PRICE = "\n***Absoluter Spritzenpreis***\n";
    private static final String ADVERTISEMENT_MESSAGE_BUY_NOW   = "\n####Jetzt aber zuschlagen####\n";
    private static final String ADVERTISEMENT_MESSAGE_DEFAULT   = "\n";

    private static final int PRICE_RANGE_ARROW     = 0;
    private static final int PRICE_RANGE_TOP_PRICE = 1;
    private static final int PRICE_RANGE_BUY_NOW   = 2;

    private static final int PRICE_RANGE_DEFAULT = -1;

    //endregion
    //region 1. Mainmethode
    public static void main(String[] args) {
        startApplication();
    }
    //endregion
    //region 2.Start Application
    public static void startApplication (){
        printApplicationName ();
        startBillBoard();
    }
    //endregion
    //region 3. Ausgabe Name der Applikation
    public static void printApplicationName (){
        System.out.println(APPLICATION_NAME);
    }
    //endregion
    //region 4. Start Produktausgabe auf der Werbeankzeige
    public static void startBillBoard (){
        //Declaration und Initalizierung
        final String roses          = "Rosen ";
        final String shoes          = "Schuhe ";
        final String flour          = "Mehl ";
        final String tomatoes       = "Tomaten ";
        final String sparklingWater = "Sprudel ";
        final String coffee         = "Kaffee ";
        final String pasta          = "Nudeln ";
        final String mouthwash      = "Mundwasser ";
        final String beer           = "Bier ";
        final String tea            = "Tee ";
        final String onions         = "Zwiebeln ";
        final String cereal         = "Müslie ";
        final String pot            = "Kochtopf ";
        final String frostedVeggies = "TK Kaisergemüse ";
        final String iceCream       = "Eis ";

        final double priceOfRoses          = 15.00;
        final double priceOfShoes          = 30.00;
        final double priceOfFlour          = 0.99;
        final double priceOfTomatoes       = 1.50;
        final double priceOfSparklingWater = 4.99;
        final double priceOfCoffee         = 2.99;
        final double priceOfPasta          = 0.65;
        final double priceOfMouthwash      = 5.41;
        final double priceOfBeer           = 12.99;
        final double priceOfTea            = 0.60;
        final double priceOfOnions         = 2.00;
        final double priceOfCereal         = 6.78;
        final double priceOfPot            = 52.45;
        final double priceOfFrostedVeggies = 1.23;
        final double priceOfIceCream       = 2.69;
        int productNr = 1;
        printAdvertisementMessage(productNr, roses, priceOfRoses);

        ++productNr;
        printAdvertisementMessage(productNr, shoes, priceOfShoes);

        ++productNr;
        printAdvertisementMessage(productNr, flour, priceOfFlour);

        ++productNr;
        printAdvertisementMessage(productNr, tomatoes, priceOfTomatoes);

        ++productNr;
        printAdvertisementMessage(productNr, sparklingWater, priceOfSparklingWater);

        ++productNr;
        printAdvertisementMessage(productNr, coffee, priceOfCoffee);

        ++productNr;
        printAdvertisementMessage(productNr, pasta, priceOfPasta);

        ++productNr;
        printAdvertisementMessage(productNr, mouthwash, priceOfMouthwash);

        ++productNr;
        printAdvertisementMessage(productNr, beer, priceOfBeer);

        ++productNr;
        printAdvertisementMessage(productNr, tea, priceOfTea);

        ++productNr;
        printAdvertisementMessage(productNr, onions, priceOfOnions);

        ++productNr;
        printAdvertisementMessage(productNr, cereal, priceOfCereal);

        ++productNr;
        printAdvertisementMessage(productNr, pot, priceOfPot);

        ++productNr;
        printAdvertisementMessage(productNr, frostedVeggies, priceOfFrostedVeggies);

        ++productNr;
        printAdvertisementMessage(productNr, iceCream, priceOfIceCream);

    }

    //region 5. Analysiere Produkte und gib Kaueferhinweise aus


    //Analysiert das uebergebene Produkt bestehend aus den beiden unten aufgefuehrten Parametern.

    private static void printAdvertisementMessage(final int productNr, final String productName, final double productPrice) {

        final String productNrSuffix = ").\n";
        final String euroSign        = " €";

        final double startOfPriceRangeArrow = 10;
        final double endOfPriceRangeArrow   = 20;

        final double startOfPriceRangeTopPrice = 0;
        final double endOfPriceRangeTopPrice   = 5;

        final double startOfPriceRangeBuyNow = 0;


        int productPriceRange = PRICE_RANGE_DEFAULT;

        if ((productPrice >= startOfPriceRangeArrow) && (productPrice < endOfPriceRangeArrow)) {
            productPriceRange = PRICE_RANGE_ARROW;
        }

        if ((productPrice >= startOfPriceRangeTopPrice) && (productPrice < endOfPriceRangeTopPrice)) {
            productPriceRange = PRICE_RANGE_TOP_PRICE;
        }

        if ((productPrice > startOfPriceRangeBuyNow) && (productPrice < startOfPriceRangeTopPrice)) {
            productPriceRange = PRICE_RANGE_BUY_NOW;

        }

        //Produktnummer zuweisen
        String productOutputText = "\n" + productNr + productNrSuffix;


        //Kauferhinweis beschaffen
        productOutputText += getAdvertisementMessageProductOutputText(productPriceRange);

        //Produktinformation anhaengen
        productOutputText += productName + productPrice + euroSign;

        //Ausgabe des Produktes mit Kauferhinweis
        System.out.println(productOutputText);
    }
    //endregion
    //region 6. Kauferheinweis auswerten


     // Diese Funktion liefert den Kauferhinweis passend zu dem uebergebenen Typ als {@link String} zurueck

    private static String getAdvertisementMessageProductOutputText(int productPriceRange) {
        return switch (productPriceRange) {
            case PRICE_RANGE_ARROW -> ADVERTISEMENT_MESSAGE_ARROW;
            case PRICE_RANGE_TOP_PRICE -> ADVERTISEMENT_MESSAGE_TOP_PRICE;
            case PRICE_RANGE_BUY_NOW -> ADVERTISEMENT_MESSAGE_BUY_NOW;
            case PRICE_RANGE_DEFAULT -> ADVERTISEMENT_MESSAGE_DEFAULT;
            default -> "";
        };

    }
    //endregion
}

