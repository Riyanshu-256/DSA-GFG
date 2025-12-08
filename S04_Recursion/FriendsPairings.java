

public class FriendsPairings {
    public long countFriendsPairings(int n) {
        if(n==1|| n==2) return n;
        long fs= countFriendsPairings(n-1);
        long fp= countFriendsPairings(n-2);
        long pairWays=(n-1)*fp;
        long totalWays=fs + pairWays;
        return totalWays;
        
    }
}
