package day52_final_key_word.practice_unit_5;

public class KevinHart extends LiveShow {
    String performer;
    String date;

    public KevinHart(String company, String location, String performer, String date) {
        super(company,location );
        this.performer = performer;
        this.date = date;
    }

    @Override
    public String toString() {
        return "KevinHart{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", performer='" + performer + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
