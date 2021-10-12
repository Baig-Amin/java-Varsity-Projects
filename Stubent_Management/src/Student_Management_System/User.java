package Student_Management_System;

/**
 *
 * @author JOHN
 */
public class User {

    private String id;
    private String name;
    private int age;
    private String gender;
    private String mobile;

    public User(String id, String name, int age, String gender, String mobile) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;

    }
    
    public String getId()
    {
    return id;
    }
    public String getName()
    {
    return name;
    }
    public int getAge()
    {
    return age;
    }
    public String getGender()
    {
    return gender;
    }
    public String getMobil()
    {
    return mobile;
    }
}
