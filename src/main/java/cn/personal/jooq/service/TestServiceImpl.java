package cn.personal.jooq.service;

import cn.personal.jooq.model.vo.UserVo;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TestServiceImpl : (请描述该类).
 *
 * @author : wangyibin
 * @date : 2019/4/13 16:18
 */
@Service
public class TestServiceImpl implements TestService {

  @Autowired
  private DSLContext dslContext;

  @Override
  public UserVo testGetUser() {
    UserVo userVo = dslContext.selectFrom(DSL.table("p_user")).where(DSL.field("uid").eq(8))
        .fetchOneInto(UserVo.class);
    return userVo;
  }
}
