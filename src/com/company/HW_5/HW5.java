package com.company.HW_5;

import java.io.*;
import java.nio.channels.WritableByteChannel;
import java.nio.file.*;
import java.util.Arrays;

;

public class HW5 {
    public static void main(String[] args) throws IOException {
        createdTreeDir("resources", "folder 1", 3);
        createdTreeDir("resources/folder 1/folder 1.3", "folder 1.3.1", 0);
        createdTreeDir("resources/folder 1/folder 1.3/folder 1.3.1", "folder 1.3.4", 0);
        createdTreeDir("resources", "folder 2", 0);
        createdTreeDir("resources", "folder 3", 1);

        Path path = Files.createFile(Paths.get("resources\\folder 1\\folder 1.3\\folder 1.3.1\\folder 1.3.4\\file.txt"));

        String str = getStructureDir(Paths.get("resources"), new StringBuilder());
        System.out.println(str);
        Files.write(path , Arrays.asList(str),StandardOpenOption.TRUNCATE_EXISTING);

        Path file3 =
                Files.copy(path, Paths.get("resources/folder 2/"
                        +String.valueOf(path.getFileName()).replace(".txt","_folder 2.txt")));

                 Files.copy(path, Paths.get("resources/folder 3/folder 3.1/file.txt"));
    }

    static void createdTreeDir(String path, String folderName, int colSubDir) throws IOException {
        String subPath = path + "/" + folderName;
        File rootDir = new File(subPath);
        if (rootDir.mkdir()) {
            int i = 1;
            while (i <= colSubDir) {
                File subDir = new File(rootDir.getPath(), folderName + "." + i);
                subDir.mkdir();
                i++;
            }
        }
    }

    static String getStructureDir(Path dir, StringBuilder stringBuilder) throws IOException {

        DirectoryStream<Path> resources = Files.newDirectoryStream(dir);

        for (Path item : resources
                ) {
            if (Files.isDirectory(item)) {
                dir = item;
                //long size = Files.list(item).count();
                stringBuilder.append(item.getFileName() + "\n");
                getStructureDir(dir, stringBuilder);
            } else if(Files.isRegularFile(item)){
                stringBuilder.append(item.getFileName() + "\n");
            }
        }
        return String.valueOf(stringBuilder);
    }
}
