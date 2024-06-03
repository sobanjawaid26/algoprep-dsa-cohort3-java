package lc_top_interview_150;

public class _14_134_GasStation {

    /*
        sum of gas and sum of cost
        if(sum of gas <sum of cost )return -1 [because that will be invalidd!!!]

        otherwise do curr+=gas[i]-cost[i];
     */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0;
        int tf=0,tc=0,diff=0,start=0;
        for(int i=0;i<gas.length;i++){
            tf+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            tc+=cost[i];
        }
        if(tf<tc)return-1;
        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                start=i+1;
                curr=0;
            }
        }return start;
    }

    public static void main(String[] args) {
        int cost[] = {3,4,5,1,2};
        int gas[] = {1,2,3,4,5};
        int res = canCompleteCircuit(gas, cost);
        System.out.println(res);
    }
}
