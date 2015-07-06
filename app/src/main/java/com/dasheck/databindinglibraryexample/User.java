package com.dasheck.databindinglibraryexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by das heck on 28.06.2015.
 */
public class User extends BaseObservable {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.dasheck.databindinglibraryexample.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.dasheck.databindinglibraryexample.BR.lastName);
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }
}
