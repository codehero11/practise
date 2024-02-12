
package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) {
        
        String filePath = "src/abc/log.txt";

        File file = new File(filePath);

        try {
           
            File directory = file.getParentFile();
            if (!directory.exists()) {
                directory.mkdirs(); 
                }
            if (file.createNewFile()) {
               
                FileWriter writer = new FileWriter(file);

                try (
				Scanner scanner = new Scanner(System.in)) {
					System.out.print("Enter Client Name: ");
					String clientName = scanner.nextLine();

					writer.write("Client Name: john doe" + clientName + "\n");
				}
                writer.write("Date: " + new Date() + "\n"); 
                writer.write("IP Address: " + InetAddress.getLocalHost().getHostAddress() + "\n"); 

                writer.close();

                System.out.println("File created and data inserted: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
           
        }
    }
}
