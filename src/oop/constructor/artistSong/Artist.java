package oop.constructor.artistSong;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Artist {
    private String name;
    private final Date birthdate;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        return dateFormat.format(this.birthdate);
    }

    public int getAge() {
        return age;
    }

    public Artist(String name, String _birthdate) throws ParseException {
        this.name = name;
        this.birthdate = new SimpleDateFormat("yyyy-MM-dd").parse(_birthdate);

        Date date = new Date();
        LocalDate nowDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate tmp = this.birthdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.age = nowDate.getYear() - tmp.getYear();
    }

    public void displayInfo(){
        System.out.println("Artist name\t:\t" + getName());
        System.out.println("Birthdate\t:\t" + getBirthdate());
        System.out.println("Age\t\t\t:\t" + getAge());
    }

}
