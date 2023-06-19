/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author abhij
 */
public class decompressor {
     public static void method(File file) throws IOException{
        String filedirectory = file.getParent();
        
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(filedirectory+"/decompressedfile");
        GZIPInputStream gzip = new GZIPInputStream(fis);
        
        byte[] buffer = new byte[1024];
        int len;
        
        while((len=fis.read(buffer))!=-1){
        fos.write(buffer,0,len);
       }
        fis.close();
        fos.close();
        gzip.close();
        
    }
     public static void main(String []args) throws IOException{
         File path = new File("Users/abhij/Documents/NetBeansProjects/compressor_decompressor/compressesdfile.gz");
         method(path);
     }
}
