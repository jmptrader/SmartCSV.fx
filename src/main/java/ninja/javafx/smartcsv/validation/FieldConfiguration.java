package ninja.javafx.smartcsv.validation;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * @author abi
 */
public class FieldConfiguration {

    public enum Type {
        @SerializedName("string") STRING,
        @SerializedName("integer") INTEGER,
        @SerializedName("number") NUMBER,
        @SerializedName("date") DATE,
        @SerializedName("datetime") DATETIME,
        @SerializedName("time") TIME
    }

    private String name;
    private String title;
    private Type type;
    private String description;
    private String format;
    private Object missingValue;
    private Map<String, Object> constraints;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Object getMissingValue() {
        return missingValue;
    }

    public void setMissingValue(Object missingValue) {
        this.missingValue = missingValue;
    }

    public Map<String, Object> getConstraints() {
        return constraints;
    }

    public void setConstraints(Map<String, Object> constraints) {
        this.constraints = constraints;
    }
}
