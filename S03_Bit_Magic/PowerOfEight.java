package S03_Bit_Magic;

public class PowerOfEight {
    public String is_power_of_eight(Long n) {
        // Code here
        while(n>1)
        {
          if(n%8!=0)
          return "No";
          n=n/8;
        }
        return "Yes";
    }
}
