package Entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class UserEntity {


    private String name;

    private int number;

    private Date birthday;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name セットする name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number セットする number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday セットする birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}