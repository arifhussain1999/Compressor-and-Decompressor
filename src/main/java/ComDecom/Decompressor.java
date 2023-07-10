/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComDecom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Arif Hussain
 */
public class Decompressor {
    public static void method(File file)throws IOException{
        String fileDirectory=file.getParent();
        FileInputStream fis=new FileInputStream(file);
        GZIPInputStream gzip= new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/DecompressedFile");
        
        
        byte[] buffer = new byte[1024];
        int len;
        while((len=gzip.read(buffer))!=-1)
        {
            fos.write(buffer,0,len);
        }
        gzip.close();
        fis.close();
        fos.close();
    }
}
