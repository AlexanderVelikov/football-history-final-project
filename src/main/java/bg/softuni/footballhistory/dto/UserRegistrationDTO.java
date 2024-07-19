package bg.softuni.footballhistory.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegistrationDTO {
    @Size(min = 2, max = 20, message = "First name cannot be less then 2 or more then 20 symbols")
    @NotBlank(message = "First name cannot be less then 2 or more then 20 symbols")
    private String firstName;
    @Size(min = 2, max = 20, message = "Last name cannot be less then 2 or more then 20 symbols")
    @NotBlank(message = "First name cannot be less then 2 or more then 20 symbols")
    private String lastName;
    @NotBlank(message = "Invalid email")
    @Email(message = "Invalid email")
    private String email;
    @NotBlank(message = "Password size cannot be less then 6 symbols")
    @Size(min = 6, message = "Password size cannot be less then 6 symbols")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public UserRegistrationDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegistrationDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegistrationDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegistrationDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "UserRegistrationDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
