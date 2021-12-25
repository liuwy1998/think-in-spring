package org.imokkkk.bean.lifecycle;

import org.liuwy.ioc.overview.domain.User;

/**
 * @author ImOkkkk
 * @date 2021/12/24 22:28
 * @since 1.0
 */
public class UserHolder {
    private final User user;

    public UserHolder(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserHolder{" +
                "user=" + user +
                '}';
    }
}
