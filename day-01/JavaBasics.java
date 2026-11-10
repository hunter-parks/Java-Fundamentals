// public class JavaBasics {
// public static void main(String[] args) {
// int total = 0;

// for (int i = 1; i <= 20; i++) {
// if (i % 3 == 0) {
// total += i;
// }
// }
// System.out.println(total);

// // Calculates the sum of numbers
// // We need a loop from numbers 1-30
// // that meets these conditions:
// // number must be divisible by 3
// // number must be greater than 10

// int sum = 0;

// for (int i = 1; i <= 30; i++) {
// if (i % 3 == 0 && i > 10) {
// sum += i;
// }
// }

// System.out.println(sum);

// // Loop numbers 1-20
// // Find all numbers divisble by 4
// // Retrieve the sum of those numbers

// int sum = 0;
// int count = 0;

// for (int i = 1; i <= 20; i++) {
// if (i % 4 == 0) {
// sum += i;
// count += 1;
// }
// }

// System.out.println(count);
// System.out.println(sum);

// // Loop through numbers 1-50
// // Number is divisble by 5
// // Number must be greater than 15
// // Get the average value
// // Print the output to the console

// int sum = 0;
// int count = 0;

// for (int i = 1; i <= 50; i++) {
// if (i % 5 == 0 && i > 15) {
// sum += i;
// count += 1;
// }
// }

// double average = (double) sum / count;

// System.out.println("Count is: " + count);
// System.out.println("Sum is: " + sum);
// System.out.println("Average is: " + average);

// // FizzBuzz Challenge
// // Loop through 1-100
// // If divisible by 3 and 5, print "FizzBuzz"
// // If divisible by 3 only, print "Fizz"
// // If divisible by 5 only, print "Buzz"
// // Otherwise, print num

// for (int i = 1; i <= 100; i++) {
// if (i % 3 == 0 && i % 5 == 0) {
// System.out.println("FizzBuzz");
// } else if (i % 3 == 0) {
// System.out.println("Fizz");
// } else if (i % 5 == 0) {
// System.out.println("Buzz");
// } else {
// System.out.println(i);
// }
// }

// // Loop through 1-100
// // Numbers must be divisible by 3
// // Numbers must NOT be divisible by 5
// // Calculate Count, Sum, Average, Largest

// int sum = 0;
// int count = 0;
// int largestNumber = 0;

// for (int i = 1; i <= 100; i++) {
// if (i % 3 == 0 && i % 5 != 0) {
// sum += i;
// count += 1;
// if (i > largestNumber) {
// largestNumber = i;
// }
// }

// }

// double average = (double) sum / count;

// System.out.println("Count is: " + count);
// System.out.println("Sum is: " + sum);
// System.out.println("Average is: " + average);
// System.out.println("Largest number is: " + largestNumber);
// }
// }
