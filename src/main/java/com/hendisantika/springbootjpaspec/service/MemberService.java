package com.hendisantika.springbootjpaspec.service;

import com.hendisantika.springbootjpaspec.repository.MemberRepository;
import com.hendisantika.springbootjpaspec.spesification.MemberSpecification;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jpa-spec
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/05/20
 * Time: 07.59
 */
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberSpecification memberSpecification;

    public MemberService(@Lazy MemberRepository memberRepository, @Lazy MemberSpecification memberSpecification) {
        this.memberRepository = memberRepository;
        this.memberSpecification = memberSpecification;
    }

    public List<Member> getMembers(FilterRequest filter, String searchString) {
        return memberRepository.findAll(Specification.where(memberSpecification.hasString(searchString)
                .or(memberSpecification.hasClasses(searchString)))
                .and(memberSpecification.getFilter(filter)));
    }
}
