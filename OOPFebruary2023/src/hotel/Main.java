package hotel;

import enumaration.Seasons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputSplit = input.split("\\s+");

        double pricePerDay = Double.parseDouble(inputSplit[0]);
        int numberOfDays = Integer.parseInt(inputSplit[1]);
        Season season = Season.valueOf(inputSplit[2].toUpperCase());
        DiscountType discountType = DiscountType.valueOf(inputSplit[3].toUpperCase());

        double holidayPrice = PriceCalculator.calculateHolidayPrice
                (pricePerDay,numberOfDays,
                season,discountType);

        System.out.printf("%.2f", holidayPrice);
    }
}
