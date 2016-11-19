import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataPreprocessor {

	//get geotags and weights
	public void tagData() {

		try{

			String  nextLine = null;
			//bufferedReader/Writer for fast IO
			BufferedReader br = new BufferedReader(new FileReader("washington zip code.json"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("processed "+"washington zip code.json", false));

			//read in file, Api limit of 2500 requests/day
			while ((nextLine = br.readLine()) != null) {

				String[] sections = nextLine.split(",");

				for(int i =0; i < sections.length; i++) {

					//System.out.println(sections[i]);
					if(sections[i].contains("Latitude")) {

						bw.write(sections[i].substring(sections[i].indexOf(":")+1) +",");
					}
					else if(sections[i].contains("Longitude")) {

						bw.write(sections[i].substring(sections[i].indexOf(":")+1)+",");
					}
					else if(sections[i].contains("\"AQI\":")) {

						if(sections[i].indexOf(":") != -1 && !(sections[i].substring(sections[i].indexOf(":")).contains("-")))
							bw.write("0.0" + sections[i].substring(sections[i].indexOf(":")+1)+",");
						else
							bw.write("0.0,");
						
					}
				}
			}   

			bw.flush();
			bw.close();
			br.close();

		}catch(IOException e){

			System.out.println("file not found");
		}
	}

}
