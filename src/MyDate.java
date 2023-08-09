public class MyDate {
    int day;
    int month;
    int yar;
    public MyDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.yar=year;
    }

    public String toString(){
        return day + " - " + month + " - " + yar;
    }
}
