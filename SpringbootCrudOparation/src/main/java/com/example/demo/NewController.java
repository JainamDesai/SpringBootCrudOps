package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.userdo.UserDaoOps;

@Controller
public class NewController {
	@Autowired
	UserDaoOps repo;
	@RequestMapping("/regform")
	public String getIndex() {
		return "index.jsp";
	}
	@RequestMapping("/userdetail")
	public String  getUserDetail(UserDao usedao) {
	    repo.save(usedao);
		return "Operations.jsp";
	}
	@RequestMapping("/update")
	public String  getUserupdate(UserDao usedao,@RequestParam("id") int id) {
	  UserDao usd = repo.findById(id).orElse(new UserDao());
	  usd.setName(usedao.getName());
	  usd.setLname(usedao.getLname());
	  repo.save(usd);
		return "Operations.jsp";
	}
	@RequestMapping("/operations")
	public ModelAndView  getUserOperation(@RequestParam("id") int idss,@RequestParam("ddlflag") String ddlflagss) {
		 ModelAndView mv = new ModelAndView("UserDetail.jsp");
		  if(ddlflagss.equals("Select")) {
			  UserDao usd = repo.findById(idss).orElse(new UserDao());
			  System.out.println(usd.getName());
			  ModelMap model = new ModelMap();
			  model.addAttribute("name",usd.getName());
			  model.addAttribute("lname",usd.getLname() );
			  model.addAttribute("sarname",usd.getSarname());
			  model.addAttribute("password",usd.getPass());
			  mv.setViewName("UserDetail.jsp");
			  mv.addObject("obj",model); 
		
		 } else if(ddlflagss.equals("Update"))
		 { 
			  UserDao usd = repo.findById(idss).orElse(new UserDao());
			  System.out.println(usd.getName());
			  ModelMap model = new ModelMap();
			  model.addAttribute("id",usd.getId());
			  model.addAttribute("name",usd.getName());
			  model.addAttribute("lname",usd.getLname() );
			  model.addAttribute("sarname",usd.getSarname());
			  model.addAttribute("password",usd.getPass());
			  mv.setViewName("update.jsp");
			  mv.addObject("obj",model);
		 }
		 else
		 { System.out.println("Delete");
		 UserDao usd = repo.findById(idss).orElse(new UserDao());
		 repo.delete(usd);
		 mv.setViewName("delete.jsp");
		 }
		 
	    return mv;
	}
}
