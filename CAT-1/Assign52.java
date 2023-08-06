class Assign52 {
    int display(int a)
    {
        System.out.println("x = " + a);
        return 0;
    }
    public static void main(String[] args)
    {
        Assign52 D1 = new Assign52();  
        System.out.println(D1); 	//initializing using method
        System.out.println(D1.display(10));	
    }}