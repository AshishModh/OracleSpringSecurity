package Model;

public class UserEntity {

    private int id;
    private String name;
    private String gender;
    private String address;
    private String password;

//    public UserEntity(int id, String name, String gender, String address, String password) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.address = address;
//        this.password = password;
//    }
//
//    public UserEntity() {
//        super();
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
