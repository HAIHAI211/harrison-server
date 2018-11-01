package com.rich.harrison.pojo;

import com.rich.harrison.entity.Appoint;
import com.rich.harrison.entity.User;

public class AppointInfo {
    private User creator;
    private Appoint appoint;

    // private Boolean hasJoin;

    public AppointInfo(Appoint appoint, User user) {
        this.appoint = appoint;
        this.creator = user;
    }

    public AppointInfo() {
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Appoint getAppoint() {
        return appoint;
    }

    public void setAppoint(Appoint appoint) {
        this.appoint = appoint;
    }

//    public Boolean getHasJoin() {
//        return hasJoin;
//    }
//
//    public void setHasJoin(Boolean hasJoin) {
//        this.hasJoin = hasJoin;
//    }
}
