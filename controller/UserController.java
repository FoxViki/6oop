import java.time.LocalDate;

import data.User;

public interface UserController<T extends User>{
    T create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
    T add(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}