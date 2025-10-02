public class TemplateObject {
    private Long objectId;
    private String objectName;

    public Long getObjectId() {
        return objectId;
    }

    public String getObjectName() {
        return objectName;
    }

    TemplateObject(Long id, String name) {
        this.objectName = name;
        this.objectId = id;
    }
}
