package structural.bridge;

public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie("Action", "John Wick", "2:15", "2014");

        //The Printer and Formatter classes are the two sides of a bridge, they determine the behaviour of the bridge
        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);


        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);

        //This makes it easy to change the output format by simply adding it into the Printer object
        Formatter jsonFormatter = new JsonFormatter();
        String jsonMaterial = moviePrinter.print(jsonFormatter);
        System.out.println(jsonMaterial);
    }
}
