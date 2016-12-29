package com.jungwon.nhn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jungwon.domain.Post;
import com.jungwon.service.SampleService;

@Controller
public class SampleController {
    @Resource(name="guestBoardPostService")
    private SampleService<Post> sampleService;
     
    @RequestMapping("/")
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
                          String contents,
                          String title) {

    	
        Post post = new Post(email, name, password, contents, title);
        
        sampleService.insert(post);

        return "redirect:/";
    }
    
    @RequestMapping(value = "view", method = RequestMethod.GET)
    public String view(@RequestParam int postId, Model model) {
    	Post post = sampleService.selectOne(postId);
    	System.out.println(post);
    	// 없는 경우 처리해야함 
    	
    	post.setContents(post.getContents().replaceAll("\n","<br>"));
    	
		model.addAttribute("post", post); 

        return "view";
    }
    
    @RequestMapping(value = "edit", method = RequestMethod.GET) 
    public String edit(@RequestParam int postId, Model model) {
    	Post post = sampleService.selectOne(postId);
    	System.out.println(post);
    	// 없는 경우 처리해야함 
    	
    	post.setContents(post.getContents().replaceAll("\n","<br>"));
    	
		model.addAttribute("post", post); 

        return "edit";
    }
    
    
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String doEdit(int id,
    					  String email,
                          String name,
                          String password,
                          String contents,
                          String title) {

    	
        Post post = new Post(email, name, password, contents, title);
        
        sampleService.validatePassword(id ,password);
        
        sampleService.insert(post);

        return "redirect:/";
    }
}