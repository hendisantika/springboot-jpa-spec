package com.hendisantika.springbootjpaspec.spesification;

import org.springframework.data.jpa.domain.Specification;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jpa-spec
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/05/20
 * Time: 08.00
 */
public abstract class BaseSpecification<T, U> {
    public abstract Specification<T> getFilter(U request);
}
