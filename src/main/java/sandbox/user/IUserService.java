package sandbox.user;

public interface IUserService {
    void register(String name, String password, String email, int age, Sex sex);
}
