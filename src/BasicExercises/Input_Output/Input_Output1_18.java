package BasicExercises.Input_Output;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Date;

public class Input_Output1_18 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java, чтобы получить список всех имен файлов/каталогов в заданном каталоге.
         */

        //Мой вариант
//        File folder = new File("E:/Java/");
//        for (File file : folder.listFiles()) {
//            System.out.println(file.getName());
//        }

        //Вариант 2
//        File file = new File("/home/students/");
//        String[] fileList = file.list();
//        for(String name:fileList){
//            System.out.println(name);
//        }

        System.out.println("Exercise 2");

        /*
        Напишите программу Java для получения определенных файлов с расширениями из указанной папки.
         */

//        File file = new File("/home/students/");
//        String[] list = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                if(name.toLowerCase().endsWith(".py")){
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        });
//        for(String f:list){
//            System.out.println(f);
//        }

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java, чтобы проверить, существует ли файл или каталог, указанный путем, или нет.
         */

        //Мой вариант
//        File file = new File("E:/Java/ideaIC-2020.3.3.exe");
//        if (file.exists()) {
//            System.out.println("Exists");
//        } else {
//            System.out.println("Does not Exists");
//        }

        //Вариант 2
        // Create a File object
//        File my_file_dir = new File("/home/students/xyz.txt");
//        if (my_file_dir.exists())
//        {
//            System.out.println("The directory or file exists.\n");
//        }
//        else
//        {
//            System.out.println("The directory or file does not exist.\n");
//        }

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java, чтобы проверить, есть ли у файла или каталога права на чтение и запись.
         */

        //Мой вариант
//        File file = new File("E:/Java/ideaIC-2020.3.3.exe");
//        boolean exists = file.exists();
//        if (exists == true) {
//            System.out.println("Executable: "
//                    + file.canExecute());
//            System.out.println("Readable: "
//                    + file.canRead());
//            System.out.println("Writable: "
//                    + file.canWrite());
//        } else {
//            System.out.println("File not found.");
//        }

        //Вариант 2
//        // Create a File object
//        File my_file_dir = new File("/home/students/abc.txt");
//        if (my_file_dir.canWrite())
//        {
//            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
//        }
//        else
//        {
//            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
//        }
//        if (my_file_dir.canRead())
//        {
//            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
//        }
//        else
//        {
//            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
//        }

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java, чтобы проверить, является ли заданный путь каталогом или файлом.
         */

        //Мой вариант
//        File file = new File("E:/Java/ideaIC-2020.3.3.exe");
//        if (file.isFile()) {
//            System.out.println("Is a file");
//        } else if (file.isDirectory()) {
//            System.out.println("Is a directory");
//        } else {
//            System.out.println("The file does not exist");
//        }

        //Вариант 2
//        // Create a File object
//        File my_file_dir = new File("/home/students/abc.txt");
//        if (my_file_dir.isDirectory())
//        {
//            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
//        }
//        else
//        {
//            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
//        }
//        if (my_file_dir.isFile())
//        {
//            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
//        }
//        else
//        {
//            System.out.println(my_file_dir.getAbsolutePath() + " is not a file.\n");
//        }

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java для лексикографического сравнения двух файлов.

        Согласно Википедии:
        в математике лексикографический или лексикографический порядок (также известный как
        лексический порядок, словарный порядок, алфавитный порядок или лексикографический (аль) продукт)
        является обобщением того, как алфавитный порядок слов основан на алфавитном порядке их составные буквы.
        Это обобщение состоит прежде всего в определении общего порядка
        последовательностей (часто называемых словами в информатике) элементов конечного полностью упорядоченного множества,
        часто называемого алфавитом.
         */

//        String str1 = "Java exercises";
//        String str2 = "Java exercises";
//        String str3 = "Java examples";
//
//        int var1 = str1.compareTo( str2 );
//        System.out.println("str1 & str2 comparison: "+var1);
//
//        int var2 = str1.compareTo( str3 );
//        System.out.println("str1 & str3 comparison: "+var2);

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java для определения даты последнего изменения файла.
         */

        //Мой вариант
//        String fileName = "E:/Java/ideaIC-2020.3.3.exe";
//
//        try {
//            Path file = Paths.get(fileName);
//            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
//
//            System.out.println("creationTime: " + attr.creationTime());
//            System.out.println("lastAccessTime: " + attr.lastAccessTime());
//            System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Вариант 2
//        File file = new File("test.txt");
//        Date date=new Date(file.lastModified());
//        System.out.println("\nThe file was last modified on: "+date+"\n");

        System.out.println("Exercise 8");

        /*
        Напишите программу Java для чтения ввода с консоли Java.

        Тестовые данные
        Введите ваше имя: Александра
         */

        //Мой вариант
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the line: ");
//        String name = null;
//        try {
//            name = reader.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("You have entered: " + name);

        //Вариант 2
//        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Input your name: ");
//        String name = null;
//        try {
//            name = R.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Your name is: " + name);

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java, чтобы получить размер файла в байтах, КБ, МБ.
         */

        //Мой вариант
        // create file object enter the path of
        // the file for which size is to be found
//        File file = new File ("E:/Java/ideaIC-2020.3.3.exe");
//        if (file.exists()) {
//            double bytes = file.length();
//            double kilobytes = (bytes / 1024);
//
//            // converting file size to bytes to kb
//            double megabytes = (kilobytes / 1024);
//
//            // converting file size tolb to mb
//            double gigabytes = (megabytes / 1024);
//
//            System.out.println("bytes : " + bytes);
//            System.out.println("kilobytes : " + kilobytes);
//            System.out.println("megabytes : " + megabytes);
//        } else {
//            System.out.println("File does not exists!");
//        }

        //Вариант 2
//        File file = new File("/home/students/test.txt");
//        if(file.exists())
//        {
//            System.out.println(filesize_in_Bytes(file));
//            System.out.println(filesize_in_kiloBytes(file));
//            System.out.println(filesize_in_megaBytes(file));
//        }
//        else
//            System.out.println("File doesn't exist");

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java для чтения содержимого файла в массив байтов.
         */

        //Мой вариант 1
//        // Write your code here
//
//        // Creating an object of File class and
//        // providing local directory path of a file
//        File path = new File(
//                "/Users/mayanksolanki/Desktop/demo.rtf");
//
//        // Calling the Method1 in main() to
//        // convert file to byte array
//        byte[] array = method(path);
//
//        // Printing the byte array
//        System.out.print(Arrays.toString(array));

        //Мой вариант 2
//        // Creating an object of Path class and
//        // assigning local directory path of file to it
//        Path path = Paths.get("/Users/mayanksolanki/Desktop/demo.rtf");
//
//        // Converting the file into a byte array
//        // using Files.readAllBytes() method
//        byte[] arr = Files.readAllBytes(path);
//
//        // Printing the above byte array
//        System.out.println(Arrays.toString(arr));

        //Вариант 2
//        String file_name = "/home/students/test.txt";
//        InputStream fins = null;
//        try {
//            fins = new FileInputStream(file_name);
//            byte file_content[] = new byte[2*1024];
//            int read_count = 0;
//            while((read_count = fins.read(file_content)) > 0){
//                System.out.println(new String(file_content, 0, read_count-1));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try{
//                if(fins != null) fins.close();
//            } catch(Exception ex){
//
//            }
//        }

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java для чтения содержимого файла построчно.
         */

        //Мой вариант
//        try {
//            // File file = new File("/Users/prologistic/file.txt");
//            File file = new File("E:/test task.docx");
//            //создаем объект FileReader для объекта File
//            FileReader fr = new FileReader(file);
//            //создаем BufferedReader с существующего FileReader для построчного считывания
//            BufferedReader reader = new BufferedReader(fr);
//            // считаем сначала первую строку
//            String line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                // считываем остальные строки в цикле
//                line = reader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Вариант 2
//        BufferedReader br = null;
//        String strLine = "";
//        try {
//            br = new BufferedReader( new FileReader("/home/students/test.txt"));
//            while( (strLine = br.readLine()) != null){
//                System.out.println(strLine);
//            }
//            br.close();
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found");
//        } catch (IOException e) {
//            System.err.println("Unable to read the file.");
//        }

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java для чтения содержимого файла построчно.
         */

        //Мой вариант
//        // File path is passed as parameter
//        File file = new File("E:/test task.docx");
//
//        // Note:  Double backquote is to avoid compiler
//        // interpret words
//        // like \test as \t (ie. as a escape sequence)
//
//        // Creating an object of BufferedReader class
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(file));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        // Declaring a string variable
//        String st;
//        // Condition holds true till
//        // there is character in a string
//
//        while (true) {
//            try {
//                if (!((st = br.readLine()) != null)) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            // Print the string
//            System.out.println(st);
//        }

        //Вариант 2
//        StringBuilder sb = new StringBuilder();
//        String strLine = "";
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
//            while (strLine != null)
//            {
//                sb.append(strLine);
//                sb.append(System.lineSeparator());
//                strLine = br.readLine();
//                System.out.println(strLine);
//            }
//            br.close();
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found");
//        } catch (IOException e) {
//            System.err.println("Unable to read the file.");
//        }
    }
    //Упражнение 9
//    private static String filesize_in_megaBytes(File file) {
//        return (double) file.length()/(1024*1024)+" mb";
//    }
//
//    private static String filesize_in_kiloBytes(File file) {
//        return (double) file.length()/1024+"  kb";
//    }
//
//    private static String filesize_in_Bytes(File file) {
//        return file.length()+" bytes";
//    }

    //Упражнение 10
//    public static byte[] method(File file) throws IOException {
//        // Creating an object of FileInputStream to
//        // read from a file
//        FileInputStream fl = new FileInputStream(file);
//
//        // Now creating byte array of same length as file
//        byte[] arr = new byte[(int)file.length()];
//
//        // Reading file content to byte array
//        // using standard read() method
//        fl.read(arr);
//
//        // lastly closing an instance of file input stream
//        // to avoid memory leakage
//        fl.close();
//
//        // Returning above byte array
//        return arr;
//    }
}
