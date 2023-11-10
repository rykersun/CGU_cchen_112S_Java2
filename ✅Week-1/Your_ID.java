//請以你的學號為檔案名稱撰寫下列程式 :
//隨機產生十個介於-100與100之間的隨機整數，然後
//1.	將它們列印出來，並儲存在一個大小為10的陣列中
//2.	找出這十個整數的最大值並列出來
//3.	請使用者輸入一個介於-100與100之間的整數，讓程式找出這十個隨機整數最靠近使用者所輸入的這個整數
//
//提示 : 
//	可用Random class的方法來產生隨機數字，請參考上學期第四章投影片第28頁
//	Loop用法請參考上學期第五章
//	陣列用法請參考上學期第七章
//	可用Math.abs( )方法來計算絕對值，請參考上學期第四章投影片第27頁

import java.util.Random;
import java.util.Scanner;

public class Your_ID {
	
	public static void main(String[] args) {

//		建立一個大小為 10 的陣列
		int[] arr = new int[10];
		
//		建立一個 Random 物件
		Random rand = new Random();
		int r = 0;
		
//		定義亂數範圍
		int min = -100;
		int max = 100;
		
//		印出生成的 10 個亂數並存入陣列
		for (int i = 0; i < 10; i ++) {
			r = rand.nextInt(max - min + 1) + min;
			
			arr[i] = r;
			System.out.println("已將 " + r + " 存入 arr[" + i + "]");
		}

//		宣告陣列裡的最大值變數
		int max_value_in_arr = arr[0];
		
//		找出並列印陣列裡的最大值
		for (int j = 0; j < arr.length; j ++) {
			max_value_in_arr = (arr[j] > max_value_in_arr) ? arr[j] : max_value_in_arr;
		}
		System.out.println("最大值: " + max_value_in_arr);
		
//		建立一個 Scanner 物件
		Scanner s = new Scanner(System.in);
		int user_input = 0;
		
//		要求使用者輸入一個介於 -100 與 100 之間的整數
		System.out.print("輸入一個介於 -100 與 100 之間的整數: ");
		user_input = s.nextInt();
		
//		chatGPT
//		用戶輸入驗證：您的程式假設用戶將輸入一個介於-100和100之間的整數。在實際應用中，最好增加一些邏輯來驗證用戶輸入的是有效的整數，並且確實在這個範圍內。
		
//		建立一個相差值陣列
		int[] d_value = new int[10];
		
//		將相差值存入 d_value
		for (int k = 0; k < arr.length; k ++) {
			d_value[k] = (arr[k] > user_input) ? arr[k] - user_input : user_input - arr[k];
		}
		
//		宣告一個最小相差值變數
		int min_d_value = d_value[0];
		
//		chatGPT
//		最小相差值的初始值：在尋找與用戶輸入數字最接近的數字時，您將min_d_value的初始值設置為d_value[0]。這是合適的，但在極少數情況下，如果arr[0]恰好是與用戶輸入最接近的數字，這可能會導致問題。為了更穩妥，您可以將min_d_value初始化為一個非常大的數（比如Integer.MAX_VALUE），這樣可以確保無論什麼情況都能找到最接近的值。

//		找出最小相差值
		for (int l = 0; l < arr.length; l ++) {
			min_d_value = (d_value[l] < min_d_value) ? d_value[l] : min_d_value;
		}

		int min_index = 0;
		
//		chatGPT
//		尋找最接近值的邏輯：在尋找最小相差值的索引時，您使用了一個三元運算子，但這個運算子只在條件為真時更新min_index。這意味著如果最小相差值出現在arr[0]，則min_index將永遠保持為0。這是一個邏輯錯誤。應該在找到新的最小相差值時更新min_index。

//		找出最小相差值的 index
		for (int m = 0; m < arr.length; m ++) {
			min_index = (d_value[m] == min_d_value) ? m : min_index;
		}
		System.out.println("陣列裡最靠近 " + user_input + " 的值為 arr[" + min_index + "] = " + arr[min_index]);
		
		s.close();
	}
}
