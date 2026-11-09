import java.util.ArrayList;

public class ArraysPractice {
    public static void main(String[] args) {
        // Arrays

        int[] streams = { 50, 120, 75, 200, 90 };
        int total = 0;

        for (int i = 0; i < streams.length; i++) {
            total += streams[i];
        }
        System.out.println(total);

        // Create an array
        // Loop the array
        // Write an if statement to update
        // highestStreams whenever a larger value found
        // Print the highest stream count once
        // Use .length instead of hardcoding array

        // int[] dailyStreams = { 120, 85, 240, 175, 310, 95, 205 };
        // int lowestStreams = dailyStreams[0];

        // for (int i = 0; i < dailyStreams.length; i++) {
        // if (dailyStreams[i] < lowestStreams) {
        // lowestStreams = dailyStreams[i];
        // }
        // }

        // System.out.println("Lowest streams: " + lowestStreams);

        // Music Streaming Analyzer
        /*
         * -- Total streams: Sum all seven values
         * -- Average streams: Calculate the average as a double
         * -- Highest streams: Find the largest value
         * -- Lowest streams: Find the lowest value
         * -- Print the results
         */

        // int[] dailyStreams = { 120, 85, 240, 175, 310, 95, 205 };
        // int sum = 0;
        // int highestStreams = 0;
        // int lowestStreams = dailyStreams[0];

        // for (int i = 0; i < dailyStreams.length; i++) {
        // sum += dailyStreams[i];
        // if (dailyStreams[i] > highestStreams) {
        // highestStreams = dailyStreams[i];

        // }
        // if (dailyStreams[i] < lowestStreams) {
        // lowestStreams = dailyStreams[i];
        // }
        // }

        // double average = (double) sum / dailyStreams.length;

        // System.out.println("Total streams: " + sum);
        // System.out.println("Average streams: " + average);
        // System.out.println("Highest streams: " + highestStreams);
        // System.out.println("Lowest streams: " + lowestStreams);

        int[] dailyStreams = { 120, 85, 240, 175, 310, 95, 205 };
        int totalStreams = 0;
        int daysBelow = 0;

        for (int i = 0; i < dailyStreams.length; i++) {

            if (dailyStreams[i] < 150) {
                daysBelow += 1;
                totalStreams += dailyStreams[i];
            }
        }

        System.out.println("Days below 150: " + daysBelow);
        System.out.println("Total streams below 150: " + totalStreams);

        // New Challenge

        int[] plays = { 45, 120, 80, 200, 55 };
        int count = 0;
        int sum = 0;

        for (int i = 0; i < plays.length; i++) {

            if (plays[i] > 75) {
                count += 1;
                sum += plays[i];
            }
        }

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);

        // Array Lists

        // Build a program that creates an empty Array List
        // Addd three songs: Blinding Lights, Levitating, Bad Habits
        // Replaces Levitating > Starboy
        // Print the remaining songs
        // Print the number of songs in the array list

        ArrayList<String> playlist = new ArrayList<>();

        playlist.add("Blinding Lights");
        playlist.add("Levitating");
        playlist.add("Bad Habit");

        playlist.set(1, "Starboy");
        playlist.remove(0);

        System.out.println(playlist);
        System.out.println("Number of songs: " + playlist.size());

        // Array List Stream Calc

        // Creates the ArrayList
        // Adds all 5 values
        // Loops through the total number of streams
        // Calculates the average as a double after the loop
        // Prints the total and average

        ArrayList<Integer> dailyStreamsTwo = new ArrayList<>();

        dailyStreamsTwo.add(150);
        dailyStreamsTwo.add(220);
        dailyStreamsTwo.add(85);
        dailyStreamsTwo.add(310);
        dailyStreamsTwo.add(175);

        int totalNumStreams = 0;

        for (int i = 0; i < dailyStreamsTwo.size(); i++) {
            totalNumStreams += dailyStreamsTwo.get(i);
        }

        double average = (double) totalNumStreams / dailyStreamsTwo.size();

        System.out.println("Total streams: " + totalNumStreams);
        System.out.println("Average streams: " + average);

        // ArrayList Filtering
        // Counts how many values are greater than 150
        // Calculates their combined total
        // Prints out the count and total

        ArrayList<Integer> values = new ArrayList<>();

        values.add(75);
        values.add(180);
        values.add(95);
        values.add(250);
        values.add(120);
        values.add(310);

        int countAbove150 = 0;
        int totalAbove150 = 0;

        for (int i = 0; i < values.size(); i++) {

            if (values.get(i) > 150) {
                countAbove150 += 1;
                totalAbove150 += values.get(i);
            }
        }

        System.out.println("Counts above 150: " + countAbove150);
        System.out.println("Total above 150: " + totalAbove150);
    }
}
