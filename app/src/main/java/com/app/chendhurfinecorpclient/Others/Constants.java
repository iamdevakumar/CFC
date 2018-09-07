package com.app.chendhurfinecorpclient.Others;

import android.content.SharedPreferences;

public class Constants {

    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    /** FaceBook App id **/
    public static final String App_ID = "203876700441500";

    //Keywords
    public static String mobileno="mobileno";
    public static String password="password";
    public static String userimage="userimage";
    public static String otp="otp";
    public static String type="type";
    public static String firstname="firstname";
    public static String socialimage="socialimage";
    public static String userimageurl="userimageurl";
    public static String lastname="lastname";
    public static String status="status";
    public static String timestamp="timestamp";
    public static String email="email";
    public static String id="id";
    public static String cno="cno";
    public static String model="model";
    public static String brand="brand";
    public static String plateno="plateno";
    public static String flatbed="flatbed";
    public static String logo="logo";

    public static String serviceid="serviceid";
    public static String servicename="servicename";
    public static String service_name="service_name";
    public static String serviceprovider_id="serviceprovider_id";
    public static String companyname="companyname";
    public static String company_name="company_name";
    public static String address="address";
    public static String providerimage="providerimage";
    public static String service_description="service_description";
    public static String overall_rating="overall_rating";
    public static String client_id="client_id";
    public static String pickup_location="pickup_location";
    public static String drop_location="drop_location";
    public static String lat="lat";
    public static String lon="lon";
    public static String rating="rating";
    public static String review="review";
    public static String serviceimg="serviceimgurl";
    public static String servicecharge="serviceamount";
    public static String priceperkm="priceperkm";
    public static String Requested_Time="reqtime";

    /** Twitter App id **/
    public static final String CONSUMER_KEY = "xsAxHRyZ3AoycrRpeK9F1rFqs";
    public static final String CONSUMER_SECRET = "BjqT5aGwG4lvY4sOCyT8fO61kNvw0yH07HLUTVax3nVxbbT9fH";

    /** Push notification key **/
    public static final String SENDER_ID = "876306079294";
    public static String REGISTER_ID="";
    public static String ANDROID_ID="";
    // PUSH API KEY AIzaSyBMsq7PBaRZpNP_0B27cuKtC0hfZK5kuBs //
    // global topic to receive app wide push notifications
    public static final String TOPIC_GLOBAL = "global";
    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";
    public static final String DATA_NOTIFICATION = "dataNotification";
    // id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;
    public static final String SHARED_PREF = "ah_firebase";

    //Requests
    public static String BaseURL="http://mycinema.shadowws.in/jsons/";

    public static String registration="registration.php?";
    public static String login="login.php?";



}
