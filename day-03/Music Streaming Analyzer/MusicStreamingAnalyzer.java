
// Mini-Project: Music Streamning Analyzer

public class MusicStreamingAnalyzer {
    public static void main(String[] args) {
        // Creating Array
        int[] dailyStreams = { 150, 320, 480, 210, 650, 390, 520 };

        int total = calculateTotal(dailyStreams);
        double average = calculateAverage(dailyStreams);
        int highest = findHighest(dailyStreams);
        int count = countAboveThreshold(dailyStreams, 500);

        System.out.println("Total streams: " + total);
        System.out.printf("Average Daily Streams: %.2f\n", average);
        System.out.println("Highest Daily Streams: " + highest);
        System.out.println("Days Above 400 Streams: " + count);
    }

    public static int calculateTotal(int[] dailyStreams) {
        int total = 0;
        // Loop through the array dailyStreams
        for (int i = 0; i < dailyStreams.length; i++) {
            total += dailyStreams[i];
        }
        return total;
    }

    public static double calculateAverage(int[] dailyStreams) {
        double average = (double) calculateTotal(dailyStreams) / dailyStreams.length;
        return average;
    }

    public static int findHighest(int[] dailyStreams) {
        int highest = dailyStreams[0];
        for (int i = 1; i < dailyStreams.length; i++) {
            if (dailyStreams[i] > highest) {
                highest = dailyStreams[i];
            }
        }
        return highest;
    }

    public static int countAboveThreshold(int[] dailyStreams, int threshold) {

        int count = 0;

        for (int i = 0; i < dailyStreams.length; i++) {
            if (dailyStreams[i] > threshold) {
                count += 1;
            }
        }

        return count;

    }

}