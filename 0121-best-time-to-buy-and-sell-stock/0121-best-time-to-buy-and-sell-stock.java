class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
                System.out.println("min = " + min);
            } else if(prices[i] - min > max) {
                max = prices[i] - min;    
            }
            // max = Math.max(prices[i], max-min);
            
            System.out.println("max = " + max);
        }
        
        
        return max;
    }
}












// class Solution {
//     public int maxProfit(int[] prices) {
//         int min = prices[0];
//         int max = 0;

//         for(int i=1; i<prices.length; i++) {
//             if(min > prices[i]) {
//                 min = prices[i];
//                 System.out.println("min = " + min);
//             } else if(prices[i] - min > max) {
//                 max = prices[i] - min;
//                 System.out.println("max = " + max);
//             }
//         }
        
        
        
        
        
//         return max;
//     }
// }





// class Solution {
//     public int maxProfit(int[] prices) {
//         int min = prices[0];
//         int max = 0;
        
//         System.out.println("1 min = " + min);
//         System.out.println("1 max = " + max);
        
//         for (int i=1; i<prices.length; i++) {
// 			if (min > prices[i]) {
// 				min = prices[i];
//                 System.out.println("2 min = " + min);
// 			} else if (prices[i] - min > max) {
// 				System.out.println("prices[i] = " + prices[i]);
//                 System.out.println("3 min = " + min);
// 				max = prices[i] - min;
// 				System.out.println("2 max = " + prices[i] + " - " + min + " = " +  max);
// 			}
// 			System.out.println("4min = " + min);
// 		}
// 		System.out.println("3 max = " + max);
//         return max;
//     }
// }