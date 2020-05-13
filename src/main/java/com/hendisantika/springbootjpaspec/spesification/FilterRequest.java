package com.hendisantika.springbootjpaspec.spesification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jpa-spec
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/05/20
 * Time: 08.01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterRequest {
    private Boolean active;
    private String zipFilter;
}
