package day56_polymorphism.social_media;

public class Picture {
    final private byte[] image;
    final private String extension;
    private String caption;

    public Picture(byte[]image, String extension, String caption){
        this.image=image;
        this.extension=extension;
        this.caption=caption;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public byte[] getImage() {
        return image;
    }

    public String getExtension() {
        return extension;
    }
}
