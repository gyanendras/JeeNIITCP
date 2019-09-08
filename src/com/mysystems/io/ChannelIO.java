package com.mysystems.io;

import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.nio.ByteBuffer;  
import java.nio.channels.ReadableByteChannel;  
import java.nio.channels.WritableByteChannel;  
 public class ChannelIO {  
    public static void main(String args[]) throws IOException {  
    FileInputStream input = new FileInputStream ("C:\\gyanLaptop\\cusp\\htmlTrn\\jdbcPoc\\jdbcPOC\\src\\com\\mysystems\\io\\chIpFile.txt"); // Path of Input text file  
        ReadableByteChannel source = input.getChannel();  
    FileOutputStream output = new FileOutputStream ("C:\\gyanLaptop\\cusp\\htmlTrn\\jdbcPoc\\jdbcPOC\\src\\com\\mysystems\\io\\chOpFile.txt"); // Path of Output text file  
        WritableByteChannel destination = output.getChannel();  
  copyData(source, destination);  
  source.close();  
        destination.close();  
    }  
 private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException   
    {  
        ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);  
   while (src.read(buffer) != -1)   
        {  
            // The buffer is used to drained  
            buffer.flip();  
            // keep sure that buffer was fully drained  
            while (buffer.hasRemaining())   
            {  
                dest.write(buffer);  
            }  
            buffer.clear(); // Now the buffer is empty, ready for the filling  
        }  
    }  
}  
