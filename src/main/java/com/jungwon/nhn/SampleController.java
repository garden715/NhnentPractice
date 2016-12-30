package com.jungwon.nhn;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jungwon.domain.Post;
import com.jungwon.service.SampleService;

@Controller
public class SampleController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "guestBoardPostService")
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
	public String doWrite(String email, String name, String password, String contents, String title) {

		Post post = new Post(email, name, password, contents, title);

		sampleService.insert(post);

		return "redirect:/";
	}

	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(@RequestParam int postId, Model model) {
		Post post = sampleService.selectOne(postId);
		System.out.println(post);
		// 없는 경우 처리해야함
		post.setContents(post.getContents().replaceAll("\n", "<br>"));
		model.addAttribute("post", post);

		return "view";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit(@RequestParam int postId, Model model) {
		Post post = sampleService.selectOne(postId);
		System.out.println(post);
		// 없는 경우 처리해야함

		model.addAttribute("post", post);

		return "edit";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String doEdit(int id, String email, String name, String password, String contents, String title) {

		Post post = new Post(id, email, name, password, contents, title);
		if (sampleService.validatePassword(id, password)) {
			sampleService.update(post);
			return "redirect:/";
		}

		return "redirect:/";
	}

	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	    public String delete(int postId, String password) {
	        Post post = sampleService.selectOne(postId);
	        
	        String chk_passowrd=post.getPassword();

	        if(chk_passowrd.equals(password))
	        {
	            sampleService.deleteOne(post);
	            return "redirect:/";
	        }
	        return "redirect:/";
	    }

	@ExceptionHandler(value = RuntimeException.class)
	public String exception(RuntimeException e) {
		logger.error("Exception Handler IN Contrller : {}", e.toString());

		return "boardList";
	}
}