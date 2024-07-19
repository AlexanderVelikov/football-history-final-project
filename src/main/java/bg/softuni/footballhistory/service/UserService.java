package bg.softuni.footballhistory.service;

import bg.softuni.footballhistory.dto.UserRegistrationDTO;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistration);
}
