package co.com.api.go.repair.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.api.go.repair.model.User;
import co.com.api.go.repair.service.UserService;

@RestController
@RequestMapping(value = "/api/v1/go/repair/")
public class UserController {

	public static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "get/users", method = RequestMethod.GET, produces = "application/json")
	public List<User> getAllUser() {
		List<User> user = null;
		try {
			user = userService.getAllUser();
			if (user != null) {
				log.info("Se encontraron los siguientes usuarios {}", user);

			}

		} catch (Exception e) {
			log.error("Problemas {}", e);
		}

		return user;

	}

}
