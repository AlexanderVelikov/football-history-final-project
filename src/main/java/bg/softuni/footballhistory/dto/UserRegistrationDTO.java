package bg.softuni.footballhistory.dto;

import bg.softuni.footballhistory.config.PasswordMatches;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
@PasswordMatches
public class UserRegistrationDTO {
    @Size(min = 2, max = 20, message = "First name cannot be less then 2 or more then 20 symbols")
    @NotBlank
    private String firstName;
    @Size(min = 2, max = 20, message = "Last name cannot be less then 2 or more then 20 symbols")
    @NotBlank
    private String lastName;
    @NotBlank
    @Email(message = "Invalid email")
    private String email;
    @NotBlank
    @Size(min = 6, message = "Password size cannot be less then 6 symbols")
    private String password;

    private String confirmPassword;

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegistrationDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
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
