package id.kulinear.intermediate.object;

import java.io.Serializable;

/**
 * Created by Rupi Adam on 25/08/2017.
 * reach me at: rupi.adam@gmail.com
 * Licious ID
 */

public class AddressObject implements Serializable {
    public String id;
    public double lat;
    public double lng;
    public String placename;
    public String pic;
    public String pic_contact;
    public String province;
    public String city;
    public String distric;
    public int postcode;
    public String country;
    public String full_address;

    public AddressObject(String id, double lat, double lng, String placename, String pic, String pic_contact, String province, String city, String distric, int postcode, String country, String full_address) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.placename = placename;
        this.pic = pic;
        this.pic_contact = pic_contact;
        this.province = province;
        this.city = city;
        this.distric = distric;
        this.postcode = postcode;
        this.country = country;
        this.full_address = full_address;
    }
}
