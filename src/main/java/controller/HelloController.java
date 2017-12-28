package controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Entity.UserEntity;
import service.SampleService;

@Controller
public class HelloController {

    private static final Date date = new Date();

    @Autowired
    public SampleService sampleService;

	@RequestMapping(value = "/", method = GET)
	public String Hello(Model model){

	    UserEntity userEntity= new UserEntity();
	    userEntity = sampleService.userAdd("âÕñÏçWä∞", 17, date);
	    model.addAttribute(userEntity);

		return "hello";
	}
}