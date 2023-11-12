//請以你的學號為檔案名稱(如Bxx44100W2T1.java)撰寫下列程式 :
//隨機產生12個介於10與90之間的隨機整數，並
//1.	將它們儲存在一個大小為3x4的2維陣列中
//2.	隨後將此2維陣列的值印出來，並在每一列的最後印出該列各數值的總和
//3.	找出每一欄的最小值，並將其印在2維陣列的下一行
//
//提示 : 
//	2維陣列用法請參考第八章
//	可用Random class的方法來產生隨機數字，請參考上學期第四章投影片第28頁

import java.util.Random;

public class Your_ID {
	
	public static void main(String[] args) {

//		建立一個 Random 物件
		Random rand = new Random();
		int r = 0;
		
//		定義亂數範圍
		int min = 10;
		int max = 90;
		
		int arr[][] = new int[3][4];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				r = rand.nextInt(max - min + 1) + min;
				arr[i][j] = r;
			}
		}

		int sum;
		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
				sum += arr[i][j];
			}
			System.out.println(sum);
		}
		
		int min_value_in_arr;
		for (int j = 0; j < 4; j++) {
			min_value_in_arr = max;
			for (int i = 0; i < 3; i++) {
				min_value_in_arr = (arr[i][j] < min_value_in_arr) ? arr[i][j] : min_value_in_arr;
			}
			System.out.print(min_value_in_arr);
			System.out.print(" ");
		}
	}
}
