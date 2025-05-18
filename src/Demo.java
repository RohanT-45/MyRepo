
public class Demo {
    public static void main(String[] args) {
    //5,3,1,7,9
        int[] a1={5,3,1,7,9};
        int[] a2={};

        for(int i=0;i<a1.length;i++)
        {
            for(int j=i+1;j<a1.length;j++)
            {
                if(a1[i]>a1[j])
                {
                    System.out.println(a1[j]);
                }

            }
        }
    }
}
