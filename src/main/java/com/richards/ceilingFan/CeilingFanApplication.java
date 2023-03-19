package com.richards.ceilingFan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.time.LocalDate;

@SpringBootApplication
public class CeilingFanApplication {
    public static void main(String[] args) {
        SpringApplication.run(CeilingFanApplication.class, args);
        CeilingFan newFan = new CeilingFan();
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        boolean isChristmas = (today.getMonthValue() == 12 && today.getDayOfMonth() == 25);
        newFan.setIsChristmas(isChristmas);
        char pull;

        while (true) {
            System.out.print("\nPull Cord:\n ");
            pull = Character.toLowerCase(scanner.next().charAt(0));
            if (!isChristmas) {
                if (pull == 'd') {
                    System.out.print(newFan.pullDirectionCord());
                }

                else if (pull == 's') {
                    System.out.print(newFan.pullSpeedCord());
                }
                else {
                    System.out.println("Please press either S or D");
                }
            } else {
                System.out.println("The fan is off for Christmas");
            }
        }

    }

}
