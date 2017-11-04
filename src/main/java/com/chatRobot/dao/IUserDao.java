package com.chatRobot.dao;

/**
 * Created by sunleic on 2017/11/4.
 * Version by ${VERSION}
 */

import com.chatRobot.model.User;

public interface IUserDao {

    User selectUser(long id);

}
