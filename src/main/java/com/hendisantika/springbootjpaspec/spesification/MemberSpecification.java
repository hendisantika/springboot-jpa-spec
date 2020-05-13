package com.hendisantika.springbootjpaspec.spesification;

import com.hendisantika.springbootjpaspec.domain.Member;
import com.hendisantika.springbootjpaspec.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import static org.springframework.data.jpa.domain.Specification.where;

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

    @Override
    public Specification<Member> getFilter(FilterRequest request) {
        return (root, query, cb) -> {
            query.distinct(true);
            query.orderBy(cb.asc(root.get("lastName")));
            return where(isActive(request.getActive())
                    .and(inZipCode(request.getZipFilter())))
                    .toPredicate(root, query, cb);
        };
    }

    public Specification<Member> hasString(String searchString) {
        return (root, query, cb) -> {
            query.distinct(true);
            if (searchString != null) {
                return cb.like(cb.lower(root.get("interests")), cb.lower(cb.literal("%" + searchString + "%")));
            } else {
                return null;
            }
        };
    }
}
