package m.todays.pilates.controllers;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import m.todays.pilates.domain.user.UserService;

@Controller
public class UserController {
	
	protected static final String APPLICATION_JSON = "application/json; charset=UTF-8";
    protected static final String TEXT_PLAIN_UTF_8 = "text/plain; charset=UTF-8";
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getUser() {
		return userService.getUser();
	}
	
}
