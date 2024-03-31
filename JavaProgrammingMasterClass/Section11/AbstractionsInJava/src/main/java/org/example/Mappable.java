package org.example;

public interface Mappable {

    String JSON_PROPERTY = """
                            "properties" : {%s}
                        """;
    String getLabel();
    String getMarker();
    Geometry getShape();
    default String toJSON() {
        return """
                "type" : "%s", "label" : "%s", "marker" : "%s"
                """.formatted(getShape(), getLabel(), getMarker());
    }
    static String mapIt(Mappable mappable) {
        return JSON_PROPERTY.formatted(mappable.toJSON());
    }
}
