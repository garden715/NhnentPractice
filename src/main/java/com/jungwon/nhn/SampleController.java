package com.jungwon.nhn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jungwon.domain.MemberVO;
import com.jungwon.service.SampleService;

@Controller
public class SampleController {
    @Resource(name="memberService")
    private SampleService sampleService;
     
    @RequestMapping("list")
    public String index(Model model) {
        List<MemberVO> users = sampleService.getBoardList();
        model.addAttribute("Users", users);
        
        return "boardList";
    }
    
    @RequestMapping(value = "write", method = RequestMethod.GET)
    public String write() {
        return "write";
    }

    @RequestMapping(value = "write", method = RequestMethod.POST)
    public String doWrite(String userid,
                          String username,
                          String userpw,
                          String email) {

    	
        MemberVO member = new MemberVO(userid, username, userpw, email);
        
        sampleService.insertMember(member);

        return "redirect:list";
    }
}