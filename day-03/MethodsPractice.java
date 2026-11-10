// Single Parameters
// public class MethodsPractice {
//     public static void main(String[] args) {
//         displayWelcome("Alex");
//         displayWelcome("Taylor");
//     }

//     public static void displayWelcome(String name) {
//         System.out.println("Welcome to the Music Analyzer, " + name + "!");
//     }
// }

// Multiple Parameters
// public class MethodsPractice {
//     public static void main(String[] args) {
//         displaySongReport("Starboy", "The Weeknd", 500);
//         displaySongReport("Bad Habit", "Steve Lacy", 750);
//     }

//     public static void displaySongReport(String song, String artist, int streams) {
//         System.out.println("Song: " + song + " | Artist: " + artist + " | Streams: " + streams);
//     }
// }

// Returning Values

// public class MethodsPractice {
//     public static void main(String[] args) {
//         int totalStreams = calculateTotalStreams(1250, 750, 2000);
//         System.out.println("Total streams: " + totalStreams);
//     }

//     public static int calculateTotalStreams(int spotifyStreams, int appleStreams, int youtubeStreams) {
//         int result = spotifyStreams + appleStreams + youtubeStreams;
//         return result;
//     }
// }

// Finding Highest Streaming Count

// public class MethodsPractice {
//     public static void main(String[] args) {
//         int[] dailyStreams = { 120, 450, 280, 670, 390, 520 };
//         System.out.println("Highest Daily Streams: " + findHighestStreams(dailyStreams));

//     }

//     public static int findHighestStreams(int[] dailyStreams) {
//         // Creating the variable for highestStreams
//         int highestStreams = dailyStreams[0];
//         // Looping throught the array
//         for (int i = 1; i < dailyStreams.length; i++) {
//             if (dailyStreams[i] > highestStreams) {
//                 highestStreams = dailyStreams[i];
//             }
//         }

//         return highestStreams;
//     }
// }

// Overloading Streaming Method

public class MethodsPractice {
    public static void main(String[] args) {
        int total = calculateTotalStreams(500, 300);
        int result = calculateTotalStreams(500, 300, 200);

        System.out.println("Two Platforms: " + total);
        System.out.println("Three Platforms: " + result);
    }

    public static int calculateTotalStreams(int spotify, int appleMusic) {
        int total = spotify + appleMusic;
        return total;
    }

    public static int calculateTotalStreams(int spotify, int appleMusic, int youtube) {
        int result = spotify + appleMusic + youtube;
        return result;
    }

}