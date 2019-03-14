
public class Kvalue {
	
	public static void main(String[] args){
		int[] nums = new int[]{9,8,7}; 
		System.out.println(getKValue(nums,1));
		
	}
	
	public static int getKValue(int[] nums,int K){
		int[] results = new int[K];
		//获取nums数组前K个值
		for(int i = 0;i < K;i++){
			results[i] = nums[i];
		}
		
		//K个数组从大到小排序
		for(int i = 0;i<K;i++){
			for(int j = i+1;j< K;j++){
				if(results[j] > results[i]){
					int temp = results[i];
					results[i] = results[j];
					results[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i = K;i<nums.length;i++){
			for(int j = 0;j<K;j++){
				if(nums[i] > results[j]){
					addValue(results,j,nums[i]);
					break;
				}
			}
		}
		int result = results[K -1];
		return result;
	}
	
	public static void addValue(int[] results,int location,int value ){
		int temp = results[location];
		results[location] = value;
		location ++;
		if(location < results.length){
			addValue(results,location,temp);
		}
	}
	
	
}
