package com.acorn.day2.after;

public class Screen {
    private String screenName;   // 상영관 이름 (예: IMAX관, 1관)
    private int seatCount;       // 좌석 수

    public Screen() {
    	
    	this("큰상영관",20);
    }

    public Screen(String screenName, int seatCount) {
        this.screenName = screenName;
        this.seatCount = seatCount;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screenName='" + screenName + '\'' +
                ", seatCount=" + seatCount +
                '}';
    }
}
