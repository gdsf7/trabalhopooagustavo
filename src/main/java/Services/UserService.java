package Services;

import Models.User;
import Models.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<User, UserRepository> {
    public UserService(UserRepository userRepository) {
        super(userRepository);
    }
}
