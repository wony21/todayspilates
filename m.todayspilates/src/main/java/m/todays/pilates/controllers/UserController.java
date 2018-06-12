package m.todays.pilates.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import m.todays.pilates.common.BaseController;
import m.todays.pilates.domain.user.UserService;

@Controller
@RequestMapping(value = "/api/v1/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService; 
	
	@RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getUser() {
		return userService.getUser();
	}
	
	
	
}
