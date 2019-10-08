package com.group5.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class UpLoad {
    private String filePath="H:/System/src/main/webapp/file/";
    public  void upLoadFile(MultipartFile upload){
        String fileName=upload.getOriginalFilename();
        File file=new File(filePath);

                 if(!file.exists()){
                         file.mkdirs();
                     }
        String newFilePath=filePath+fileName;
                 try{
                     upload.transferTo(new File(newFilePath));
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
    }
}
