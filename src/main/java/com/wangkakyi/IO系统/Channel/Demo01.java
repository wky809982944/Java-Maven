package com.wangkakyi.IO系统.Channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Demo01{
    public static void main(String[] args) throws Exception{
        File src = new File("/home/wky/IdeaProjects/Java/src/IO系统/Channel/core.jpg");
        File dest = new File("/home/wky/IdeaProjects/Java/src/IO系统/Channel/corebak.jpg");
        FileChannel inChannel = new FileInputStream(src).getChannel();
        FileChannel outChannel = new FileOutputStream(dest).getChannel();
        MappedByteBuffer mbuff = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, src.length());
       // outChannel.write(mbuff);
        ByteBuffer bbuffer = ByteBuffer.allocate((int) src.length());
        inChannel.read(bbuffer);
        bbuffer.flip();
        outChannel.write(bbuffer);
        inChannel.close();
        outChannel.close();

    }
}
