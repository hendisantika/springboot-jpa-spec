package com.hendisantika.springbootjpaspec.controller;

import com.hendisantika.springbootjpaspec.domain.Member;
import com.hendisantika.springbootjpaspec.service.MemberService;
import com.hendisantika.springbootjpaspec.spesification.FilterRequest;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

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
@RequestMapping(value = "/members")
public class MemberController {
    private final MemberService memberService;

    public MemberController(@Lazy MemberService memberService) {
        this.memberService = memberService;
    }

    @ResponseBody
    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Member>> getAllMembers(@RequestParam(required = false) String searchString,
                                                      FilterRequest filter) {
        return new ResponseEntity<>(memberService.getMembers(filter, searchString), HttpStatus.OK);
    }
}
