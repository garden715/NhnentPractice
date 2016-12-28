package com.jungwon.nhn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jungwon.domain.Post;
import com.jungwon.service.SampleService;

@Controller
public class SampleController {
    @Resource(name="guestBoardPostService")
    private SampleService<Post> sampleService;
     
    @RequestMapping("list")
    public String index(Model model) {
        List<Post> posts = sampleService.getList();
        model.addAttribute("posts", posts);
        
        return "boardList";
    }
    
    @RequestMapping(value = "write", method = RequestMethod.GET)
    public String write() {
        return "write";
    }

    @RequestMapping(value = "write", method = RequestMethod.POST)
    public String doWrite(String email,
                          String name,
                          String password,
                          String contents) {

    	
        Post post = new Post(email, name, password, contents);
        
        sampleService.insert(post);

        return "redirect:list";
    }
}