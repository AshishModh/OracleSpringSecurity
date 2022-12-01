package Repository;

import Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao {

    int save(UserEntity userEntity);

    List<UserEntity> getAllUser();

    UserEntity getUserByID(int id);

    int update(UserEntity userEntity);

    int deleteUser(int id);
}
