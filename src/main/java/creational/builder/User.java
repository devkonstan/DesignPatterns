package creational.builder;

public class User {
    private String name;
    private int age;

    private User() {

    }
    // FluentBuilder
    public static class BobTheBuilder { //ta klasa jest wewnatrzna i ma dostep do klasy User
        private User user = new User();

        public BobTheBuilder setName(String name) {
            user.name = name;
            return this;
        }

        public BobTheBuilder setAge(int age) {
            user.age = age;
            return this;
        }

        public User build() {
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
