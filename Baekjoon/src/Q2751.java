import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0;i<num;i++)
			arr.add(Integer.parseInt(br.readLine()));
		
		br.close();
		
		Collections.sort(arr);
		
		for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));

	}

}
