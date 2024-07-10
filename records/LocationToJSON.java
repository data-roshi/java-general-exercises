package records;

public record LocationToJSON(double latitude, double longitude, String city) implements ToJSON {
    @Override
    public String generateJSON() {
        return """
                {
                    "latitude": %g,
                    "longitude": %g,
                    "city": "%s"
                }
                """.formatted(latitude, longitude, city);
    }
}

interface ToJSON {
    String generateJSON();
}
