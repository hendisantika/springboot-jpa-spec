package com.hendisantika.springbootjpaspec.controller;

import com.hendisantika.springbootjpaspec.service.MemberService;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jpa-spec
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/05/20
 * Time: 08.06
 */
@CrossOrigin
@Controller
@RequestMapping(value = "/members", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MemberController {
    private final MemberService memberService;

    public MemberController(@Lazy MemberService memberService) {
        this.memberService = memberService;
    }
}
