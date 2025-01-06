package chapter04;

public class ParkingFee {
    public static void main(String[] args) {

        int parkingTime = 10;
        String carType = "장애인";

        int parkingFee = 4000 * parkingTime;

        if (parkingFee >= 30000){
            parkingFee = 30000;
        }
        if (carType == "경차" || carType == "장애인"){
            parkingFee /= 2;
        }
        System.out.println("주차 요금은 " + parkingFee + " 원입니다.");

    }
}
