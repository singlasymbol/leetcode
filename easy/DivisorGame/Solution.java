class Solution {
    
    int getOptimalValue(int N) {
        for(int i = 1; i < N; i++) {
            if(N % i == 0) {
                return i;
            }
        }
        return -1;
    }
    
    boolean playGame(int N, boolean AliceTurn) {
        
        if(N == 0) {
            return !AliceTurn;
        }

        int optimalValue = getOptimalValue(N);
        
        if(optimalValue == -1) {
            return !AliceTurn;
        }
        
        return playGame(N - optimalValue, !AliceTurn);
    }
    
    public boolean divisorGame(int N) {
        boolean AliceTurn = true;
        return playGame(N, AliceTurn);
    }
}