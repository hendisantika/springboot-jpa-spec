package com.hendisantika.springbootjpaspec.repository;

import com.hendisantika.springbootjpaspec.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jpa-spec
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/05/20
 * Time: 07.59
 */
public interface MemberRepository extends JpaRepository<Member, Long>, JpaSpecificationExecutor {
}
