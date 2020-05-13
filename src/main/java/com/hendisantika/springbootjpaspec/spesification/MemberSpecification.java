package com.hendisantika.springbootjpaspec.spesification;

import com.hendisantika.springbootjpaspec.domain.Member;
import com.hendisantika.springbootjpaspec.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jpa-spec
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/05/20
 * Time: 08.00
 */
@Component
public class MemberSpecification extends BaseSpecification<Member, FilterRequest> {
    @Autowired
    private ClassRepository classRepository;

}
