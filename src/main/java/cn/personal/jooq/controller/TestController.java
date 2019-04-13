package cn.personal.jooq.controller;

import cn.personal.jooq.model.vo.UserVo;
import cn.personal.jooq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TestController : (请描述该类).
 *
 * @author : wangyibin
 * @date : 2019/4/13 16:09
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

  @Autowired
  private TestService testService;

  @RequestMapping(value = "/getUser")
  @ResponseBody
  public UserVo testGetUser() {
    return testService.testGetUser();
  }


}
