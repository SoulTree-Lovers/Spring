package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    // 스프링 컨테이너와 멤버 서비스를 연결시켜주는 어노테이션
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
