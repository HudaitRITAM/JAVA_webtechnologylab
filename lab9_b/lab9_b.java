
 class lab9_b {
    public static void main(String[] args) {
        //upper case to lower case
        String s1="KIIT UNIVERSITY";
        String case1=s1.toLowerCase();
        System.out.println(case1);

        //lower case to upper case
        String s2="kiit university";
        String case2=s2.toUpperCase();
        System.out.println(case2);

        //compare two string
        String name1="welcome";  
        String name2="welcome";  
        String name3=new String("welcome");  
        System.out.println(name1==name2); 
        System.out.println(name1==name3);  


        //reverse string
        StringBuffer s3=new StringBuffer("ritam hudait");  
        s3.reverse();  
        System.out.println(s3);  
         
        //insert string into another string 
        StringBuffer s4=new StringBuffer("hello");  
        s4.insert(5,"java");  
        System.out.println(s4);  
    }
}