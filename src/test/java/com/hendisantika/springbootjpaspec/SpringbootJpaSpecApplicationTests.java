package com.hendisantika.springbootjpaspec;

import com.hendisantika.springbootjpaspec.domain.Class;
import com.hendisantika.springbootjpaspec.domain.Member;
import com.hendisantika.springbootjpaspec.repository.ClassRepository;
import com.hendisantika.springbootjpaspec.repository.MemberRepository;
import com.hendisantika.springbootjpaspec.spesification.FilterRequest;
import com.hendisantika.springbootjpaspec.spesification.MemberSpecification;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.banner-mode=off")
@Transactional
public class SpringbootJpaSpecApplicationTests {

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberSpecification memberSpecification;

    @Before
    public void init() {
        memberRepository.deleteAll();
        classRepository.deleteAll();

        Class classWaterPolo = new Class();
        classWaterPolo.setName("Water Polo");
        classRepository.save(classWaterPolo);

        Class classSwimming = new Class();
        classSwimming.setName("Swimming");
        classRepository.save(classSwimming);

        Class classLifting = new Class();
        classLifting.setName("Lifting");
        classRepository.save(classLifting);

        Class classPilates = new Class();
        classPilates.setName("Pilates");
        classRepository.save(classPilates);

        Class classZumba = new Class();
        classZumba.setName("Zumba");
        classRepository.save(classZumba);

        Set<Class> gregSet = new HashSet<>();
        gregSet.add(classWaterPolo);
        gregSet.add(classLifting);

        Member memberGreg = new Member();
        memberGreg.setActive(true);
        memberGreg.setFirstName("Uzumaki");
        memberGreg.setLastName("Naruto");
        memberGreg.setInterests("I love to cycle and swim");
        memberGreg.setZipCode("90210");
        memberGreg.setClasses(gregSet);
        memberRepository.save(memberGreg);

        Set<Class> marshaSet = new HashSet<>();
        marshaSet.add(classSwimming);
        marshaSet.add(classZumba);

        Member memberMarsha = new Member();
        memberMarsha.setActive(true);
        memberMarsha.setFirstName("Marsha");
        memberMarsha.setLastName("And The Bear");
        memberMarsha.setInterests("I love to do zumba and pilates");
        memberMarsha.setZipCode("90211");
        memberMarsha.setClasses(marshaSet);
        memberRepository.save(memberMarsha);

        Set<Class> aliceSet = new HashSet<>();
        aliceSet.add(classSwimming);

        Member memberAlice = new Member();
        memberAlice.setActive(false);
        memberAlice.setFirstName("Alice");
        memberAlice.setLastName("In Wonderland");
        memberAlice.setInterests("I used to love that belt machine-y thing");
        memberAlice.setZipCode("90201");
        memberAlice.setClasses(aliceSet);
        memberRepository.save(memberAlice);
    }

    @Test
    public void testMembersActive() {
        FilterRequest filter = new FilterRequest();
        filter.setActive(true);

        List<Member> memberList = memberRepository.findAll(memberSpecification.getFilter(filter));

        assertEquals(2, memberList.size());
    }

}
