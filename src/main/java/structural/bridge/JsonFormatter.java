package structural.bridge;

import java.util.List;

public class JsonFormatter implements Formatter{

    @Override
    public String format(String header, List<Detail> details) {

        StringBuilder sb = new StringBuilder();

        sb.append('{');

        for (int i = 0; i < details.size(); i++) {
            sb.append("\"").append(escapeJson(details.get(i).label())).append("\"");
            sb.append(":");
            sb.append("\"").append(escapeJson(details.get(i).value())).append("\"");
            if (i < details.size() - 1) {
                sb.append(",");
            }
        }

        sb.append("}");

        return sb.toString();


    }

    private String escapeJson(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\b", "\\b")
                .replace("\f", "\\f")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
