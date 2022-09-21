package Chapter3;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){

        if(hour >= 0 && hour <= 23 ){
            this.hour = hour;

            if(minute >= 0 && minute <= 59){
                this.minute = minute;

                if(second >= 0 && second <= 59){
                    this.second = second;
                }
            }
        }
    }
        public void setHour(int hour){
        this.hour = 0;
        }

        public int getHour(){
        return hour;
        }

        public void setMinute(){
        this.minute = 0;
        }

        public int getMinute(){
        return minute;
        }

        public void setSecond(){
        this.second = 0;
        }

        public int getSecond(){
        return second;
        }

        public int displayTime(){

        return hour + minute + second;

        }
}
