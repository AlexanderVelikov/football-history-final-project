package bg.softuni.footballhistory.config;

import bg.softuni.footballhistory.dto.UserRegistrationDTO;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, UserRegistrationDTO> {
    @Override
    public boolean isValid(UserRegistrationDTO userRegistrationDTO, ConstraintValidatorContext context) {
        return userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword());
    }
}
