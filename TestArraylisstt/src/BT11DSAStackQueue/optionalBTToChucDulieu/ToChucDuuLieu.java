package BT11DSAStackQueue.optionalBTToChucDulieu;
import BT11DSAStackQueue.MyQueue;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ToChucDuuLieu {
    SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
    private String fullName;
    private final boolean isMale;
    private Date birthday;


    public ToChucDuuLieu(String fullName,boolean isMale , Date birthday) {
        this.fullName = fullName;
        this.isMale = isMale;
        this.birthday = birthday;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isMale() {
        if(isMale){
            return true;
        }else{
            return false;
        }
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString(){
        return "Name: "+isMale+" Gender: "+(isMale()? "Male":" Female")+" Birthday: " +format.format(birthday);
    }

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        MyQueue<ToChucDuuLieu> female=new MyQueue<>();
        MyQueue<ToChucDuuLieu> male=new MyQueue<>();
        ToChucDuuLieu[] people = new ToChucDuuLieu[3];

    }
}
