package com.example.sidharth.ngosupport.backend.models;

import com.google.appengine.api.datastore.GeoPt;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by sidharth on 2/10/15.
 */
@Entity
public class Place {

    @Id
    private long id;

    private String name;

    private String address;

    private GeoPt location;

    public final long getPlaceId(){
        return id;
    }

    public final void setPlaceId(final long pPlaceId){

        this.id = pPlaceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GeoPt getLocation() {
        return location;
    }

    public void setLocation(GeoPt location) {
        this.location = location;
    }
}
