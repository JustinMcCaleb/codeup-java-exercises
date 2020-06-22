//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class FileInputOutputLec {
//
//    public static void main(String[] args) {
//
//        Path gitignore = Paths.get(".gitignore");
//        System.out.println(Files.exists(gitignore));
//
//
//        //creating path to "test" folder
//        String directory = "test";
//        Path myTest = Paths.get(directory);
//
//        Path myFile = Paths.get(directory, "hello.txt");
//
//
//        if(Files.notExists(myTest)) {
//            try {
//                Files.createDirectory(myTest);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//        if(Files.notExists(myFile)){
//            try {
//                Files.createFile(myFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        //practicing again but adding different file to test
////        String directoryTwo = "test";
////        Path testDirectory = Paths.get(directoryTwo);
////
////        Path helloTwo = Paths.get(directoryTwo, "helloTwo.txt");
//
//
////        if (Files.notExists(testDirectory)) {
////            try {
////                Files.createDirectory(testDirectory);
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
////
////        if (Files.notExists(helloTwo)){
////            try {
////                Files.createFile(helloTwo);
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
//
//
//        //Write a list of strings to a hello.txt
//        String[] names = {"Cheyenne", "Cameron", "Jonathan"};
//        List<String> friends = Arrays.asList(names);
//
//        //or
//        List<String> classmates = new ArrayList<>();
//        classmates.add("Jahziel");
//        classmates.add("Larry");
//        classmates.add("Chris");
//        classmates.add("Aaron");
//        // and then doing File.write(myFile, classmates); in a try-catch
//
//        try {
//            Files.write(myFile, friends);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        //reading all lines
//            //returns a List<>
//            //readAllLines assumes you DON'T already have a list containing the values
//        try {
//            List<String> myFriends = Files.readAllLines(myFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (String friend : friends) {
//            System.out.println(friend);
//        }
//
//        //Appending
//        List<String> moreFriends = Arrays.asList("Manning", "Walsh", "bob");
//        try {
//            Files.write(myTest,moreFriends, StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        //Replacing
//        List<String> newFriends = new ArrayList<>();
//
//        for(String friend : moreFriends) {
//            if(friend.equals("bob")){
//                newFriends.add("tom");
//                continue;
//            }
//            newFriends.add(friend);
//        }
//
//
//
//    }
//}
