package com.citygrid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nYou are facing North.");
        System.out.println("Movement: You may enter one or more movements with a comma and/or space(,) between each direction (ex: L3,R1, L4 , R2).");


        List<String> directionsList =
                Stream.of(sc.nextLine().split("\\s*,\\s*"))
                        .collect(Collectors.toList());

        System.out.println("\nDistance: " + BunnyPositioningSystem.walkAllAndGetDistanceFromHQ(directionsList) + " blocks");

    }
}
