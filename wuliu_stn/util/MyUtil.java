package wuliu_stn.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class MyUtil {
    public final static String projectInfoName = "wuliu_stn_project_info.txt";
    public final static String allNotesFolderName = "all_notes";

    public static void checkProjectExists() {
        File projInfo = new File(projectInfoName);
        if (!projInfo.isFile()) {
            throw new Error(projectInfoName + " does not exist or is not a file");
        }
        File notesFolder = new File(allNotesFolderName);
        if (!notesFolder.isDirectory()) {
            throw new Error(allNotesFolderName + " does not exist or is not a folder");
        }
    }

    public static void createNoteToday(String text) throws IOException {
        String today = LocalDate.now().toString();
        String filename = today + ".txt";
        Path file = Path.of(allNotesFolderName, filename);
        if (Files.notExists(file)) {
            System.out.printf("Create file %s\n", file);
            text = today + "\n" + "-".repeat(15) + "\n\n" + text + "\n";
            System.out.println(text);
            Files.writeString(file, text, StandardOpenOption.CREATE);
            return;
        }
        if (Files.exists(file)) {
            System.out.printf("Append to file %s\n", file);
            System.out.println(text);
            Files.writeString(file, "\n\n" + text + "\n", StandardOpenOption.APPEND);
        }
    }
}
