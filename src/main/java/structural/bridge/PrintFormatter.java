package structural.bridge;


import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Detail detail : details) {
            builder.append(detail.label());
            builder.append(":");
            builder.append(detail.value());
            builder.append("\n");
        }

        return builder.toString();
    }
}