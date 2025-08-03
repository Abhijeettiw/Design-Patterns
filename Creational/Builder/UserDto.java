public class UserDto {
    private String name;
    private String address;
    private String phone;

    UserDto withName(String name) {
        this.name = name;
        return this;
    }

    UserDto withAddress(String address) {
        this.address = address;
        return this;
    }

    UserDto withPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
