package com.hendisantika.springbootjpaspec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jpa-spec
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/05/20
 * Time: 07.58
 */
public interface ClassRepository extends JpaRepository<Class, Long>, JpaSpecificationExecutor {
    List<Class> findAllByNameContainsIgnoreCase(String searchString);
}
