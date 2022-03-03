package javaNIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NIODemo {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        //create an object then we can open the channel
        FileInputStream aFile = new FileInputStream("C:\\Users\\yangyangzhao1213\\TESTFORFILE\\hi.txt"); //handle the exception
        // open the channel by using getChannel() method
        aFile.getChannel();
        // once channel open we need a buffer to read the file
        FileChannel inputchannel = aFile.getChannel(); //channel is open mychannel is a byte stream
        long Filesize = inputchannel.size(); // ideal the buffer size is the same with file size. this is to find the size of file. return long.
        ByteBuffer buf = ByteBuffer.allocate((int)Filesize); // we can specify the size of the buffer. 48 bytes. inside of the allocate only can use integer
        // so we need to do the type casting.
        int bytRead = inputchannel.read(buf); // then we pass the data, read data from a channel into a buffer. we need to handle exception.

        buf.flip();//make buffer ready for read, ready modify set
        while(buf.hasRemaining())
        {
            System.out.print((char)buf.get()); //we convert ASCIcode to character.
        }
        inputchannel.close();
        aFile.close();
        //character based stream
        //RandomAccessFile afile = new RandomAccessFile();


//=============================================================================
        //two exsits files
        String[] inputFiles = {"C:\\Users\\yangyangzhao1213\\TESTFORFILE\\hi.txt", "C:\\Users\\yangyangzhao1213\\TESTFORFILE\\second.txt"};
        // one unexsit file will be writen
        String outfile = "";
        //open channel
        FileOutputStream foutput = new FileOutputStream(outfile);
        //open channel for destination
        WritableByteChannel destinationChannel = foutput.getChannel(/*"C:\\Users\\yangyangzhao1213\\TESTFORFILE\\output.txt"*/); //we will write the data from exsited file to new channel.
        for (int i = 0; i < inputFiles.length; i++)
        {
            //open channel for source file
            FileInputStream finp = new FileInputStream(inputFiles[i]);
            FileChannel sourcechannel = finp.getChannel();
            //transfer data from sourcechannel to putputchannel
            sourcechannel.transferTo(0, sourcechannel.size(), destinationChannel);
        }
        destinationChannel.close();
        foutput.close();


    }
}
