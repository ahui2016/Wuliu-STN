package wuliu_stn.util;

import java.io.File;

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
}
