package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * copy from a.txt to b.txt
 */
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("D:\\Buffered.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
	
		
		
		
		FileReader fr=new FileReader("D:\\Reader.txt");
		BufferedReader br=new BufferedReader(fr);
	
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		/*  “ªÇÄ◊÷πù“ªÇÄ◊÷πùµƒåë°£ 
        int ch = 0; 
        while((ch = bufr.read())!=-1){ 
            bufw.write(ch); 
        }*/  
		bw.close();
		fw.close();
		br.close();
		
		
	}

}
