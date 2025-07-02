class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
		int tgas=0;
		int tcost=0;
		
		for(int i=0;i<n;i++) {
			tgas=tgas+gas[i];
			tcost=tcost+cost[i];
		}
		if(tgas<tcost)return-1;
		
		int ans=0;
		int current_gas=0;
		for(int i=0;i<n;i++) {
			current_gas=current_gas+gas[i]-cost[i];
			
			if(current_gas<0) {
				ans=i+1;
				current_gas=0;
			}
		}
		return ans;
    }
}