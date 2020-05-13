package com.hendisantika.springbootjpaspec;

import com.hendisantika.springbootjpaspec.repository.ClassRepository;
import com.hendisantika.springbootjpaspec.repository.MemberRepository;
import com.hendisantika.springbootjpaspec.spesification.MemberSpecification;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.banner-mode=off")
@Transactional
class SpringbootJpaSpecApplicationTests {

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberSpecification memberSpecification;


}
