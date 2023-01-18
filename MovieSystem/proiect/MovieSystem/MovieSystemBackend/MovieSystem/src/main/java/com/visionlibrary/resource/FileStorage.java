package com.visionlibrary.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorage {
    private final Path root = Paths.get("files");


    public String saveFile(MultipartFile file) throws Exception {
        if(!Files.exists(root)) {
            Files.createDirectory(root);
        }
        String fileName = file.getOriginalFilename();
        String start = fileName.substring(0,fileName.indexOf("."));
        String ext = fileName.substring(fileName.indexOf("."));
        fileName = start + "_" + System.currentTimeMillis() + ext;
        Files.copy(file.getInputStream(),root.resolve(fileName));
        return fileName;
    }

    public Resource getFile(String fileName) throws Exception {

        Path path = root.resolve(fileName);
        Resource resource = new UrlResource(path.toUri());
        if(resource.isFile() && resource.exists()) {
            return resource;
        }
        return null;
    }

}
