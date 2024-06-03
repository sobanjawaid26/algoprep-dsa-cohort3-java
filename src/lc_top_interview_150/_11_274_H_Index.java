package lc_top_interview_150;

import java.util.Arrays;

public class _11_274_H_Index {

    public static int hIndex(int[] citations) {
        int n = citations.length;
        int i;
        Arrays.sort(citations);
        for(i = 1; i<= n; i++){
            if(citations[n - i] < i)
                break;
        }
        return i - 1;
    }

    public int hIndex_0(int[] c) {
        int low=0 , high = c.length;
        while(low < high){
            int mid = (low+high+1)/2;
            int cnt=0;
            for(int i=0 ; i<c.length ; i++) if(c[i] >= mid) cnt++;
            if(cnt >= mid) low = mid;
            else high = high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int citations[] = {3,0,6,1,5};
        int hIndex = hIndex(citations);
        System.out.println(hIndex);
    }
}
