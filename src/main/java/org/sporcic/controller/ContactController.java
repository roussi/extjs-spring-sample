package org.sporcic.controller;

import org.sporcic.domain.Contact;
import org.sporcic.extjs.ExtData;
import org.sporcic.extjs.ExtResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@Controller
@RequestMapping("/contacts")
public class ContactController {

    private final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ExtResponse getUser() {

        logger.info("getUser called");

        ExtData s = new ExtData();
        //s.add(new User(1,"Tim"));
        //s.add(new User(2,"Nat"));

        return s;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody ExtResponse addUser(@RequestBody Contact[] users) {

        logger.info("addUser called");

        ExtData ret = new ExtData();
        /*for(User user : users) {
            System.out.println(user);
            user.setId(3);
            ret.add(user);
        }*/
        return ret;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public @ResponseBody ExtResponse deleteUser(@RequestBody int[] ids) {

        logger.info("deleteUser called");

        for(int id : ids ) {
            System.out.println("id: " + id);
        }

        return ExtResponse.SUCCESS;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody ExtResponse updateUser(@RequestBody Contact[] users) {

        logger.info("updateUser called");

        ExtData ret = new ExtData();

       /* for(User user : users) {
            System.out.println(user);
            ret.add(user);
        }*/

        return ret;
    }


}
