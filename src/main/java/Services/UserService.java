package Services;

import Models.User;
import Models.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User, UserRepository> {
    public UserService(UserRepository userRepository) {
        super(userRepository);
    }
}
