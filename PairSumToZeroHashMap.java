import java.util.HashMap;

class PairSumToZeroHashMap {
    public static int PairSum(int[] input, int size) {

		HashMap<Integer, Integer> freqMap = new HashMap<>();
		int count =0;
		for(int num: input){
			freqMap.put(num, freqMap.getOrDefault(num, 0)+1);

		}
		for(int num : input){
			if(freqMap.containsKey(-num)){
				count = count + freqMap.get(-num);
			}
			if(num == 0){
				count--;
			}
		}
		return count/2;
	}
    public static void main(String[] args) {
        int[] input = {-2, 2, 6, -2, 2, -6, 3};
        int size = input.length;
        int result = PairSum(input, size);
        System.out.println("Number of pairs with sum zero: " + result);
    }
}
