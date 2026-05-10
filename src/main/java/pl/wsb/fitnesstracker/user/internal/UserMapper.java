package pl.wsb.fitnesstracker.user.internal;

import org.springframework.stereotype.Component;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.user.api.UserBasicInfoDto;
import pl.wsb.fitnesstracker.user.api.UserDto;

@Component
class UserMapper {

    UserDto toUserDto(User user) {
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getBirthdate(), user.getEmail());
    }

    UserBasicInfoDto toUserBasicInfoDto(User user) {
        return new UserBasicInfoDto(user.getId(), user.getFirstName(), user.getLastName());
    }
}