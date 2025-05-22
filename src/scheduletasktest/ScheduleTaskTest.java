/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scheduletasktest;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

/**
 *
 * @author Zelone
 */
public class ScheduleTaskTest {

    public ScheduleTaskTest() {
        // get the path to the Downloads folder
        String downloadDir = System.getenv("USERPROFILE") + "\\Downloads";
        String filePath = downloadDir + "\\Funstire.zelone";
    
        String str = new Date().toString();
        try {
            FileWriter fw = new FileWriter(new File(filePath), true);
            fw.append((str + "\n"));
            fw.close();
        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ScheduleTaskTest();
        // TODO code application logic here
    }

}
