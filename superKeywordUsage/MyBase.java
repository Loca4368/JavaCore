package superKeywordUsage;

public class MyBase extends Base{
	
	MyBase(){
        System.out.println("MyBase");
        add(2);
    }

    void add(int v)
    {
        System.out.println("MyBase Add");
        i+=v*2;
        System.out.println(i);
    }

}
