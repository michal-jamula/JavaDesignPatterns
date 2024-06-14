package structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private final Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.title()));
        details.add(new Detail("Year", movie.year()));
        details.add(new Detail("Runtime", movie.runtime()));

        return details;
    }

    @Override
    protected String getHeader() {
        return movie.classification();
    }
}
