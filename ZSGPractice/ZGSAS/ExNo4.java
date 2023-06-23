class ExNo4
{
    public static void main(String[] args) 
    {
        int[] denoms={1,5,9};
        System.out.println("Min Coins "+minNumberOfCoins(10,denoms));
    }
    public static int minNumberOfCoins(int n, int[] denoms) 
    {
      int[] numberOfCoins=new int[n+1];
      Arrays.fill(numberOfCoins,Integer.MAX_VALUE);
      numberOfCoins[0]=0;

      for(int i=0;i<denoms.length;i++)
      {
          for(int j=denoms[i];j<numberOfCoins.length;j++)
          {
              if(numberOfCoins[j-denoms[i]]!=Integer.MAX_VALUE)
              {
                  numberOfCoins[j]=Math.min(numberOfCoins[j],numberOfCoins[j-denoms[i]]+1);
              }
          }
      }
      return numberOfCoins[n]==Integer.MAX_VALUE?-1:numberOfCoins[n];
}
