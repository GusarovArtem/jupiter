package ua.jupiter.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.jupiter.database.entity.User;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, String> {
}