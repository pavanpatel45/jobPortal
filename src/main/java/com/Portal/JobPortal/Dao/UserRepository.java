package com.Portal.JobPortal.Dao;

import com.Portal.JobPortal.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
