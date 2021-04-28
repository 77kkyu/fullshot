package com.example.fullshot.common.result;

public enum ResultCodeSet {

    SUCCESS_COMMON(200, "Success"),
    SUCCESS_MAKERESERVATION_BUT_JUST_TICKETISSUE(301, "Success"),
    SUCCESS_MAKERESERVATION(300, "Success"),
    ;

    public int code;
    public String message;
    // Constructor
    private ResultCodeSet(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
